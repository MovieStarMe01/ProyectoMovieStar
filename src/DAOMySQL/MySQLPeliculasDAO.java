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
import java.util.ArrayList;
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
    
    private final String GETALL = "SELECT peli_id, peli_genero, peli_titulo, peli_sinopsis, peli_precio_renta, "
            + " peli_precio_venta, peli_caratula, peli_audio, peli_calidad, peli_anio, peli_estado FROM peliculas";
    
    private final String GETALLRENTEDMOVIES = "SELECT peli_id, peli_genero, peli_titulo, peli_sinopsis, peli_precio_renta, "
            + " peli_precio_venta, peli_caratula, peli_audio, peli_calidad, peli_anio FROM peliculas WHERE peli_estado = 'ACTIVO'";
    
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
        //lista de peliculas a retornar
        List<peliculas> misPeliculas = new ArrayList<peliculas>();
        
        try{
            //creamos la conexion a la base de datos
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta
            ps = conn.prepareStatement(GETALL);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto ResultSet
            rs = ps.executeQuery();
            
            //recorremos el ResultSet y agregamos cada item al ArrayList
            while(rs.next()){
                peliculas miPelicula = new peliculas();
                miPelicula.setPeliID(rs.getString("peli_id"));
                miPelicula.setGenero(rs.getString("peli_genero"));
                miPelicula.setPeliTitulo(rs.getString("peli_titulo"));
                miPelicula.setPeliSinopsis(rs.getString("peli_sinopsis"));
                miPelicula.setPrecioRenta(rs.getDouble("peli_precio_renta"));
                miPelicula.setPrecioVenta(rs.getDouble("peli_precio_venta"));
                miPelicula.setCaratula(rs.getString("peli_caratula"));
                miPelicula.setAudio(rs.getString("peli_audio"));
                miPelicula.setCalidad(rs.getString("peli_calidad"));
                miPelicula.setAnio(rs.getInt("peli_anio"));
                miPelicula.setCalidad(rs.getString("peli_estado"));
                misPeliculas.add(miPelicula);
            }//fin del while
        }
        catch(SQLException ex){
            throw new DAOException("Error de SQL: ", ex);
        }
        finally{
            cerrarConexiones(ps, rs, conn);
        }//fin del finally
        
        return misPeliculas;
    }//fin del metodo obtenerTodos

    @Override
    public peliculas obtener(String id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<peliculas> obtenerRentadas() throws DAOException {
        //lista de peliculas a retornar
        List<peliculas> misPeliculas = new ArrayList<peliculas>();
        
        try{
            //creamos la conexion a la base de datos
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta
            ps = conn.prepareStatement(GETALLRENTEDMOVIES);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto ResultSet
            rs = ps.executeQuery();
            
            //recorremos el ResultSet y agregamos cada item al ArrayList
            while(rs.next()){
                peliculas miPelicula = new peliculas();
                miPelicula.setPeliID(rs.getString("peli_id"));
                miPelicula.setGenero(rs.getString("peli_genero"));
                miPelicula.setPeliTitulo(rs.getString("peli_titulo"));
                miPelicula.setPeliSinopsis(rs.getString("peli_sinopsis"));
                miPelicula.setPrecioRenta(rs.getDouble("peli_precio_renta"));
                miPelicula.setPrecioVenta(rs.getDouble("peli_precio_venta"));
                miPelicula.setCaratula(rs.getString("peli_caratula"));
                miPelicula.setAudio(rs.getString("peli_audio"));
                miPelicula.setCalidad(rs.getString("peli_calidad"));
                miPelicula.setAnio(rs.getInt("peli_anio"));
                misPeliculas.add(miPelicula);
            }//fin del while
        }
        catch(SQLException ex){
            throw new DAOException("Error de SQL: ", ex);
        }
        finally{
            cerrarConexiones(ps, rs, conn);
        }//fin del finally
        
        return misPeliculas;
    }//fin del metodo obtenerRentadas
    

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
