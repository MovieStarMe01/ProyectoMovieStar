/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOMySQL;

import DAO.DAOException;
import DAO.INotasDAO;
import Modelo.notas;
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
public class MySQLNotasDAO implements INotasDAO {
     //Propiedades a manipular la BD
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;

    
    //Consultas SQL a utilizar
    private final String INSERTRENTA = "INSERT INTO nota (nota_total, nota_fecha, nota_peli_id, nota_tipo, nota_usu_id, "
            + " nota_cli_id, nota_fecha_lim) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    private final String INSERTVENTA = "INSERT INTO nota (nota_total, nota_fecha, nota_peli_id, nota_tipo, nota_usu_id, "
            + " nota_cli_id) VALUES (?, ?, ?, ?, ?, ?)";
    
    private final String LLENARNOTAS = "SELECT nota_fecha_lim, nota_peli_id FROM nota WHERE nota_fecha_lim != 'NULL' "
            + "AND nota_tipo = 'RENTADA'";
    
    /**
     * Método para insertar una renta de una película a la tbl notas
     * @param nota
     * @throws DAOException 
     */
    @Override
    public void insertar(notas nota) throws DAOException {
        try{
            //Creamos la conexión a la BD   
            conn = Conectar.ConectarBD();
            
            //Preparamos la consulta y especificamos el parámetro de entrada
            ps = conn.prepareStatement(INSERTRENTA);
                ps.setString(1, nota.getNotaTotal());
                ps.setTimestamp(2, nota.getNotaFecha());
                ps.setString(3, nota.getPeliID());
                ps.setString(4, "RENTADA");
                ps.setInt(5, nota.getUsuarioID());
                ps.setInt(6, nota.getClienteID());
                ps.setDate(7, new java.sql.Date(nota.getFechaDevolucion().getTime()));
            
            //Ejecutamos la consulta y verificamos el resultado
            if(ps.executeUpdate() == 0){
                throw new DAOException("No se pudo dar de alta La Nota");
            }// fin del if 1.0
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally   
    }// fin del método insertar
    
    /**
     * Método para insertar una venta de una película a la tbl notas
     * @param nota
     * @throws DAOException 
     */
    @Override
    public void venta(notas nota) throws DAOException {
        try{
            //Creamos la conexión a la BD   
            conn = Conectar.ConectarBD();
            
            //Preparamos la consulta y especificamos el parámetro de entrada
            ps = conn.prepareStatement(INSERTVENTA);
                ps.setString(1, nota.getNotaTotal());
                ps.setTimestamp(2, nota.getNotaFecha());
                ps.setString(3, nota.getPeliID());
                ps.setString(4, nota.getNotaTipo());
                ps.setInt(5, nota.getUsuarioID());
                ps.setInt(6, nota.getClienteID());
           
            //Ejecutamos la consulta y verificamos el resultado
            if(ps.executeUpdate() == 0){
                throw new DAOException("No se pudo insertar la Nota");
            }// fin del if 1.0
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally   
    }// fin del método venta
    
    /**
     * Método para obtener las notas dadas de alta
     * @return miRenta
     * @throws DAOException 
     */
    @Override
    public List<notas> obtenerNotas() throws DAOException {
         List<notas> miRenta = null;
       
        try{
            //Creamos un arrayList 
            miRenta = new ArrayList<>();
            
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(LLENARNOTAS);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                notas miPeli = new notas();
                miPeli.setFechaDevolucion(rs.getDate("nota_fecha_lim"));
                miPeli.setPeliID(rs.getString("nota_peli_id"));
                miRenta.add(miPeli);
            }// fin del while
        }catch(SQLException ex){
            throw new DAOException("Error en SQL: " + ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
        
        return miRenta;
    }// fin del método obtenerNotas

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
    public void modificar(notas a) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaUP(String a, String passE) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<notas> obtenerTodos() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public notas obtener(Integer id) throws DAOException {
        return null;
        
    }

    @Override
    public void estado(notas estado) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}// fin de la clase MySQLNotasDAO
