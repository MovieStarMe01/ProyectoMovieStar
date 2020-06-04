/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOMySQL;

import DAO.DAOException;
import DAO.IClienteDAO;
import Modelo.cliente;
import MySQLConexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesús Moisés
 */
public class MySQLClienteDAO implements IClienteDAO{
    //Propiedades a manipular la BD
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private Statement st = null;
    
    //Consultas SQL a utilizar
    private final String INSERT = "INSERT INTO cliente (cli_nombre, cli_paterno, cli_materno, cli_domicilio, cli_cel, "
            + " cli_correo)"
            + " VALUES (?, ?, ?, ?, ?, ?)";
    
    private final String GETONE = "SELECT cli_nombre, cli_paterno, cli_materno, cli_domicilio, cli_cel, cli_correo "
            + " FROM cliente WHERE cli_id = ?";
    
    private final String UPDATE = "UPDATE cliente SET cli_nombre = ?, cli_paterno = ?, cli_materno = ?, cli_domicilio = ?, "
             + " cli_cel = ?, cli_correo = ? WHERE cli_id = ?";
   
     
    private final String GETALLCLI = "SELECT * FROM cliente";
     
    private final String DELETE = "DELETE FROM cliente WHERE cli_id = ?";
    
    /**
     * Método para añadir un cliente a nuestra BD
     * @param miCliente
     * @throws DAOException 
     */
    @Override
    public void insertar(cliente miCliente) throws DAOException {
         try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //Preparamos la consulta y especificamos el parámetro de entrada
            ps = conn.prepareStatement(INSERT);
                ps.setString(1, miCliente.getNombreCliente());
                ps.setString(2, miCliente.getApellidoPaterno());
                ps.setString(3, miCliente.getApellidoMaterno());
                ps.setString(4, miCliente.getDomicilio());
                ps.setString(5, miCliente.getCelular());
                ps.setString(6, miCliente.getCorreo());
                
            //Ejecutamos la consulta y verificamos el resultado
            if(ps.executeUpdate() == 0){
                throw new DAOException("No se pudo dar de alta el Cliente");
            }
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
    }// fin del método insertar

    /**
     * Méotodo para Modificar datos de un cliente
     * @param cli
     * @throws DAOException 
     */
    @Override
    public void modificar(cliente cli) throws DAOException {
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
             
            //Preparamos la consult SQL y especificamos los parámetros de entrada
            ps = conn.prepareStatement(UPDATE);
                ps.setString(1, cli.getNombreCliente());
                ps.setString(2, cli.getApellidoPaterno());
                ps.setString(3, cli.getApellidoMaterno());
                ps.setString(4, cli.getDomicilio());
                ps.setString(5, cli.getCelular());
                ps.setString(6, cli.getCorreo());
                ps.setInt(7, cli.getCli_ID());
                
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
     * Método para eliminar un cliente
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
    }

    @Override
    public boolean verificaUP(String a, String passE) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Método para obtener todo los clientes que están dados de alta
     * @return misClientes
     * @throws DAOException 
     */
    @Override
    public List<cliente> obtenerTodos() throws DAOException {
        //Lista de IDClientes a retornar
        List<cliente> misClientes = null;
        
        try{
            //Creamos un arrayList 
            misClientes = new ArrayList<>();
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(GETALLCLI);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                cliente miCli = new cliente();
                miCli.setCli_ID(rs.getInt("cli_id"));
                miCli.setNombreCliente(rs.getString("cli_nombre"));
                miCli.setApellidoPaterno(rs.getString("cli_paterno"));
                miCli.setApellidoMaterno(rs.getString("cli_materno"));
                miCli.setDomicilio(rs.getString("cli_domicilio"));
                miCli.setCelular(rs.getString("cli_cel"));
                miCli.setCorreo(rs.getString("cli_correo"));
                misClientes.add(miCli);
            }// fin del while
          
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin dle finally
        
        return misClientes;
    }// fin del método obtenerTodos

 
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
    public cliente obtener(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
}// fin de la clase MySQLClienteDAO
