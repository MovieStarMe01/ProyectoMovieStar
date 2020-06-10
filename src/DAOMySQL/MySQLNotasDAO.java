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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Jesús Moisés
 */
public class MySQLNotasDAO implements INotasDAO {
     //Propiedades a manipular la BD
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private Statement st = null;
    
    //Consultas SQL a utilizar
    private final String INSERT = "INSERT INTO nota (nota_total, nota_fecha, nota_peli_id, nota_tipo, nota_usu_id, "
            + " nota_cli_id) VALUES (?, ?, ?, ?, ?, ?)";
    
    
    /**
     * Método para instertar una nota, ya sea de venta o renta de una Película
     * @param nota
     * @throws DAOException 
     */
    @Override
    public void insertar(notas nota) throws DAOException {
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //Preparamos la consulta y especificamos el parámetro de entrada
            ps = conn.prepareStatement(INSERT);
                ps.setString(1, nota.getNotaTotal());
                ps.setTimestamp(2, nota.getNotaFecha());
                ps.setString(3, nota.getPeliID());
                ps.setString(4, nota.getNotaTipo());
                ps.setInt(5, nota.getUsuarioID());
                ps.setInt(6, nota.getClienteID());
               
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void estado(notas estado) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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
    
}// fin de la clase MySQLNotasDAO
