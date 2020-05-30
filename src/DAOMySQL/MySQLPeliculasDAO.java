/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOMySQL;

import DAO.DAOException;
import DAO.IPeliculasDAO;
import Modelo.peliculas;
import MySQLConexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Jesús Moisés
 */
public class MySQLPeliculasDAO implements IPeliculasDAO{
    //Propiedades a manipular la BD
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private Statement st = null;
    
    //Consultas SQL a utilizar
    private final String INSERT = "INSERT INTO peliculas (peli_id, peli_genero, peli_titulo, peli_sinopsis, peli_precio_renta, "
            + " peli_precio_venta, peli_caratula, peli_audio, peli_calidad, peli_anio, peli_estado)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    /**
     * Método para dar de alta peliculas a la BD
     * @param peli
     * @throws DAOException 
     */
    @Override
    public void insertar(peliculas peli) throws DAOException {
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //Preparamos la consulta y especificamos el parámetro de entrada
            ps = conn.prepareStatement(INSERT);
                ps.setString(1, peli.getPeliID());
                ps.setString(2, peli.getGenero());
                ps.setString(3, peli.getPeliTitulo());
                ps.setString(4, peli.getPeliSinopsis());
                ps.setDouble(5, peli.getPrecioRenta());
                ps.setDouble(6, peli.getPrecioVenta());
                ps.setString(7, peli.getCaratula());
                ps.setString(8, peli.getAudio());
                ps.setString(9, peli.getCalidad());
                ps.setInt(10, peli.getAnio());
                ps.setString(11, peli.getEstado());
                
            //Ejecutamos la consulta y verificamos el resultado
            if(ps.executeUpdate() == 0){
                throw new DAOException("No se pudo dar de alta la Película");
            }// fin del if 1.0
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally   
    }// fin del método insertar

    @Override
    public void modificar(peliculas a) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaUP(String a, String passE) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<peliculas> obtenerTodos() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public peliculas obtener(String id) throws DAOException {
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
    
}
