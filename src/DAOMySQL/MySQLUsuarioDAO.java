/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOMySQL;

import DAO.DAOException;
import DAO.IUsuarioDAO;
import Modelo.Usuario;
import MySQLConexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Erick
 * @author Jesús Moisés
 */
public class MySQLUsuarioDAO implements IUsuarioDAO {

    //Propiedades a manipular la BD
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
 
    //Consultas SQL a utilizar
    private final String INSERT = "INSERT INTO usuario (usu_nombre, usu_paterno, usu_materno, usu_domicilio, usu_cel, "
            + " usu_nick, usu_pass)"
            + " VALUES (?, ?, ?, ?, ?, ?, MD5(?))";
    
    private final String VALIDAR = "SELECT usu_nick, usu_pass FROM usuario";
    
    private final String DELETE = "DELETE FROM usuario WHERE usu_id = ?";
    
    private final String UPDATE = "UPDATE usuario SET usu_nombre = ?, usu_paterno = ?, usu_materno = ?, usu_domicilio = ?, "
             + " usu_cel = ?, usu_nick = ?, usu_pass = MD5(?) WHERE usu_id = ?";
    
    private final String GETALLUSU = "SELECT usu_id, usu_nombre, usu_paterno, usu_materno, usu_domicilio, usu_cel, usu_nick "
             + " FROM usuario";
    
    private final String GETUSU = "SELECT usu_id FROM usuario WHERE usu_nick = ? AND usu_pass = ?";
     
    /**
     * Método para obtenr el id del Usuario que ingresó al Sistema
     * @param nick
     * @param pass
     * @return idUsuario
     * @throws DAOException 
     */
    @Override
    public String getIdUsuario(String nick, String pass) throws DAOException {
        //idUsuario a retornar
        String idUsuario = "";
        
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(GETUSU);
                ps.setString(1, nick);
                ps.setString(2, pass);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                //String usu = new String();
                idUsuario = (rs.getString("usu_id"));
               
            }// fin del while
          
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin dle finally
        
        return idUsuario;
    }// fin del método getIdUsuario
    
    /**
     * Este método nos sirve para poder agregar un nuevo Usuario a nuestra BD
     * @param miUsuario
     * @throws DAOException 
     */
    @Override
    public void insertar(Usuario miUsuario) throws DAOException {
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //Preparamos la consulta y especificamos el parámetro de entrada
            ps = conn.prepareStatement(INSERT);
                ps.setString(1, miUsuario.getNombreUsuario());
                ps.setString(2, miUsuario.getApellidoPaterno());
                ps.setString(3, miUsuario.getApellidoMaterno());
                ps.setString(4, miUsuario.getDomicilio());
                ps.setString(5, miUsuario.getCelular());
                ps.setString(6, miUsuario.getNickName());
                ps.setString(7, miUsuario.getContraseña());
                
            //Ejecutamos la consulta y verificamos el resultado
            if(ps.executeUpdate() == 0){
                throw new DAOException("No se pudo dar de alta el Usuario");
            }// fin del if 1.0
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
    }// fin del método insertar

    /**
     * Método para modificar un usuario
     * @param miUsuario
     * @throws DAOException 
     */
    @Override
    public void modificar(Usuario miUsuario) throws DAOException {
         try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
             
            //Preparamos la consult SQL y especificamos los parámetros de entrada
            ps = conn.prepareStatement(UPDATE);
                ps.setString(1, miUsuario.getNombreUsuario());
                ps.setString(2, miUsuario.getApellidoPaterno());
                ps.setString(3, miUsuario.getApellidoMaterno());
                ps.setString(4, miUsuario.getDomicilio());
                ps.setString(5, miUsuario.getCelular());
                ps.setString(6, miUsuario.getNickName());
                ps.setString(7, miUsuario.getContraseña());   
                ps.setInt(8, miUsuario.getId_Usu());
            
            //Ejecutamos la consulta y verificamos  el resultado
            if(ps.executeUpdate() == 0){
                throw new DAOException("Hubo un problema y no se guardaron los cambios");
            }
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
    }// fin del método modificar 

    /**
     * Método para eliminar un usuario del registro
     * @param id
     * @throws DAOException 
     */
    @Override
    public void eliminar(Integer id) throws DAOException {
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //Preparamos la consulta SQL y especificamos los parámetros de entrada
            ps = conn.prepareStatement(DELETE);
                ps.setInt(1, id);
               
            //Ejecutamos la consulta  y verficamos el resultado
            if(ps.executeUpdate() == 0){
                throw new DAOException("Hubo un problema y no se pudo eliminar  el registro");
            }
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
    }// fin del método eliminar

    /**
     * Método para obtener todo los Usuarios que están dados de alta
     * @return
     * @throws DAOException 
     */
    @Override
    public List<Usuario> obtenerTodos() throws DAOException {
        //Lista de IDClientes a retornar
        List<Usuario> misUsuarios = null;
        
        try{
            //Creamos un arrayList 
            misUsuarios = new ArrayList<>();
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(GETALLUSU);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                Usuario miUsu = new Usuario();
                miUsu.setId_Usu(rs.getInt("usu_id"));
                miUsu.setNombreUsuario(rs.getString("usu_nombre"));
                miUsu.setApellidoPaterno(rs.getString("usu_paterno"));
                miUsu.setApellidoMaterno(rs.getString("usu_materno"));
                miUsu.setDomiciilio(rs.getString("usu_domicilio"));
                miUsu.setCelular(rs.getString("usu_cel"));
                miUsu.setNickName(rs.getString("usu_nick"));
                misUsuarios.add(miUsu);
            }// fin del while
          
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin dle finally
        
        return misUsuarios;
    }// fin del método obtenerTodos
    
    /**
     * Método para verificar usuario y contraseña esten dados de alta en la BD
     * @param usu
     * @param passE
     * @return true si existe el usuario
     * @throws DAOException 
     */
    @Override
    public boolean verificaUP(String usu, String passE) throws DAOException {
        boolean validar = false;
        
        try{
            //Realizamos la conexión a la BD
            conn = Conectar.ConectarBD();
            //Preparamos la consulta SQL y especificamos los parámetros de entrada
            ps = conn.prepareStatement(VALIDAR);
            //Ejecutamos la consulta
            rs = ps.executeQuery();
            
            /*
            Mientras haya un registro en la BD iremos comparando el nickName
            y la contraseña que se ingresaron en el login con cada uno de nuestros
            registros en la BD
            */
            while(rs.next()){
                String u = rs.getString(1);
                String p = rs.getString(2);
                /*
                Si se encontró un registro con un nickName y contraseña en la BD 
                igual al solicitado en el login devolvemos true para poder dar 
                acceso al sistema
                */
                if(usu.equals(u) && p.equals(passE)){
                    validar = true;
                 }// fin del if
            }// fin del while
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            //Cerramos las conexiones
            cerrarConexiones(ps, rs, conn);   
        }// fin del finally
       
        return validar;
    }// fin del método verificarUP

    /**
     * Método para cerrar las Conexiones de la BD
     * @param ps
     * @param rs
     * @param conn
     * @throws DAOException 
     */
    private void cerrarConexiones(PreparedStatement ps, ResultSet rs, Connection conn) throws DAOException {
        try{
            if(rs != null){
                //Cerramos el rs
                rs.close();
            }//fin del if rs
            
            if(ps != null){
                //Cerramos el ps
                ps.close();
            }// fin del if ps 
            
            if(conn != null){
                //Cerramos la conn
                conn.close();
            }// fin del if conn
        }catch(SQLException ex){
            throw new DAOException("ERROR en SQL", ex);
        }// fin del catch
    }// fin del método cerrarConexiones

    @Override
    public Usuario obtener(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void estado(Usuario estado) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void venta(Usuario a) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}// fin de la clase MySQLUsuaioDAO
