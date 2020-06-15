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
    
    //Consultas SQL a utilizar
    private final String INSERT = "INSERT INTO peliculas (peli_id, peli_genero, peli_titulo, peli_sinopsis, peli_precio_renta, "
            + " peli_precio_venta, peli_caratula, peli_audio, peli_calidad, peli_anio, peli_estado)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    private final String GETMOVIES = "SELECT peli_id, peli_titulo, peli_anio, peli_audio, peli_calidad, peli_precio_renta, "
            + " peli_precio_venta, peli_genero, peli_sinopsis, peli_caratula FROM peliculas WHERE peli_genero = ? AND "
            + " peli_estado = 'ACTIVO'";
    
    private final String GETALLMOVIES = "SELECT peli_id, peli_titulo, peli_anio, peli_audio, peli_calidad, peli_precio_renta, "
            + " peli_precio_venta, peli_genero, peli_sinopsis, peli_caratula FROM peliculas WHERE peli_estado = 'ACTIVO'";
    
    private final String GETALLMOVIESEDIT = "SELECT peli_titulo, peli_anio, peli_audio, peli_calidad, peli_precio_renta, "
            + " peli_precio_venta, peli_caratula, peli_sinopsis, peli_genero, peli_id FROM peliculas WHERE peli_estado = 'ACTIVO'";
    
    private final String GETONE = "SELECT peli_titulo, peli_anio, peli_audio, peli_calidad, peli_genero, peli_precio_renta,"
            + " peli_precio_venta, peli_sinopsis, peli_caratula FROM peliculas WHERE peli_id = ?"; 
    
    private final String UPDATE = "UPDATE peliculas SET peli_genero = ?, peli_titulo = ?, peli_sinopsis = ?, peli_precio_renta = ?, "
             + " peli_precio_venta = ?, peli_caratula = ?, peli_audio = ?, peli_calidad = ?, peli_anio = ? WHERE peli_id = ?";
    
    private final String ACTIVO = "SELECT peli_id, peli_titulo, peli_anio, peli_audio, peli_calidad, "
            + " peli_estado, peli_genero FROM peliculas WHERE peli_estado = ?";
    
    private final String INACTIVOVEND = "SELECT peli_id, peli_titulo, peli_anio, peli_audio, peli_calidad, "
            + " peli_estado, peli_genero FROM peliculas WHERE peli_estado = ? OR peli_estado = ?";
    
    private final String ESTADO = "UPDATE peliculas SET peli_estado = ? WHERE peli_id = ?";
    
    private final String NODEV = "SELECT peli_id, peli_titulo, peli_anio, peli_audio, peli_calidad, "
            + " peli_estado, peli_genero FROM peliculas WHERE peli_estado = ?";
    
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
            }// fin del if 
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally   
    }// fin del método insertar

    /**
     * Método para actualizar una película
     * @param peli
     * @throws DAOException 
    */
    @Override
    public void modificar(peliculas peli) throws DAOException {
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
             
            //Preparamos la consult SQL y especificamos los parámetros de entrada
            ps = conn.prepareStatement(UPDATE);
                ps.setString(1, peli.getGenero());
                ps.setString(2, peli.getPeliTitulo());
                ps.setString(3, peli.getPeliSinopsis());
                ps.setDouble(4, peli.getPrecioRenta());
                ps.setDouble(5, peli.getPrecioVenta());
                ps.setString(6, peli.getCaratula());
                ps.setString(7, peli.getAudio());
                ps.setString(8, peli.getCalidad());
                ps.setInt(9, peli.getAnio());
                ps.setString(10, peli.getPeliID());
                
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
     * Método para retornar un objeto de tipo peliculas
     * @param genero
     * @return miPelicula
     * @throws DAOException 
    */
    @Override
    public peliculas obtener(String genero) throws DAOException {
        //Lista de Películas a retornar
        peliculas miPelicula = null;
        
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //Preparamos la consulta SQL y especificamos los parámetros de entrada
            ps = conn.prepareStatement(GETONE);
                ps.setString(1, genero);
            
            //Ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            if(rs.isBeforeFirst()){
                   //Verificamos si  el RS obtuvo un resultado y lo asginamos al objeto correspondiente
                   while(rs.next()){
                   miPelicula = new peliculas();
                   miPelicula.setPeliTitulo(rs.getString("peli_titulo"));
                   miPelicula.setAnio(rs.getInt("peli_anio"));
                   miPelicula.setAudio(rs.getString("peli_audio"));
                   miPelicula.setCalidad(rs.getString("peli_cadidad"));
                   miPelicula.setPrecioRenta(rs.getDouble("peli_precio_renta"));
                   miPelicula.setPrecioVenta(rs.getDouble("peli_precio_venta"));
                   miPelicula.setGenero(rs.getString("peli_genero"));
                   miPelicula.setCaratula(rs.getString("peli_caratula"));
               }// fin del while
            }// fin del if
            
            else{
                throw new DAOException("No se encontró el elemento");
            }// fin del else
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin dle finally
        
        return miPelicula;
    }// fin del método obtener
    
    /**
     * Método para obtener todas las películas por genero
     * @param genero
     * @return
     * @throws DAOException 
     */
    @Override
    public List<peliculas> obtenerPeliculas(String genero) throws DAOException {
      
        List<peliculas> misPeliculas = null;
       
        try{
            //Creamos un arrayList 
            misPeliculas = new ArrayList<>();
            
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(GETMOVIES);
            ps.setString(1, genero);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                peliculas miPeli = new peliculas();
                miPeli.setPeliID(rs.getString("peli_id"));
                miPeli.setPeliTitulo(rs.getString("peli_titulo"));
                miPeli.setAnio(rs.getInt("peli_anio"));
                miPeli.setAudio(rs.getString("peli_audio"));
                miPeli.setCalidad(rs.getString("peli_calidad"));
                miPeli.setPrecioRenta(rs.getDouble("peli_precio_renta"));
                miPeli.setPrecioVenta(rs.getDouble("peli_precio_venta"));
                miPeli.setGenero(rs.getString("peli_genero"));
                miPeli.setPeliSinopsis(rs.getString("peli_sinopsis"));
                miPeli.setCaratula(rs.getString("peli_caratula"));
                misPeliculas.add(miPeli);
            }// fin del while
        }catch(SQLException ex){
            throw new DAOException("Error en SQL: " + ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
        
        return misPeliculas;
    }// fin del método obtenerPeliculas

    /**
     * Método para obtener todas las películas que están dadas de alta y están activas
     * @param todas
     * @return
     * @throws DAOException 
     */
    @Override
    public List<peliculas> obtenerTodasPeli(String todas) throws DAOException {
        List<peliculas> misPeliculas = null;
       
        try{
            //Creamos un arrayList 
            misPeliculas = new ArrayList<>();
            
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(GETALLMOVIES);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                peliculas miPeli = new peliculas();
                miPeli.setPeliID(rs.getString("peli_id"));
                miPeli.setPeliTitulo(rs.getString("peli_titulo"));
                miPeli.setAnio(rs.getInt("peli_anio"));
                miPeli.setAudio(rs.getString("peli_audio"));
                miPeli.setCalidad(rs.getString("peli_calidad"));
                miPeli.setPrecioRenta(rs.getDouble("peli_precio_renta"));
                miPeli.setPrecioVenta(rs.getDouble("peli_precio_venta"));
                miPeli.setGenero(rs.getString("peli_genero"));
                miPeli.setPeliSinopsis(rs.getString("peli_sinopsis"));
                miPeli.setCaratula(rs.getString("peli_caratula"));
                misPeliculas.add(miPeli);
            }// fin del while
        }catch(SQLException ex){
            throw new DAOException("Error en SQL: " + ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
        
        return misPeliculas;
    }// fin del método obtenerTodasPeli

    /**
     * Método para obtener todas las películas con un campos mas, el de sinopsis
     * para al momento de editarlas
     * @return misPeliculas
     * @throws DAOException 
     */
    @Override
    public List<peliculas> obtenerPeliEdit() throws DAOException {
        List<peliculas> misPeliculas = null;
       
        try{
            //Creamos un arrayList 
            misPeliculas = new ArrayList<>();
            
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(GETALLMOVIESEDIT);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                peliculas miPeli = new peliculas();
               
                miPeli.setPeliTitulo(rs.getString("peli_titulo"));
                miPeli.setAnio(rs.getInt("peli_anio"));
                miPeli.setAudio(rs.getString("peli_audio"));
                miPeli.setCalidad(rs.getString("peli_calidad"));
                miPeli.setPrecioRenta(rs.getDouble("peli_precio_renta"));
                miPeli.setPrecioVenta(rs.getDouble("peli_precio_venta"));
                miPeli.setCaratula(rs.getString("peli_caratula"));
                miPeli.setPeliSinopsis(rs.getString("peli_sinopsis"));
                miPeli.setGenero(rs.getString("peli_genero"));
                miPeli.setPeliID(rs.getString("peli_id"));
                misPeliculas.add(miPeli);
            }// fin del while
        }catch(SQLException ex){
            throw new DAOException("Error en SQL: " + ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
        
        return misPeliculas;
    }// fin del método ObtenerPeliEdit

    /**
     * Método para obtener toda las Películas que esten Activas
     * @param estado
     * @return misPeliculas
     * @throws DAOException 
     */
    @Override
    public List<peliculas> obtenerActivo(String estado) throws DAOException {
        List<peliculas> misPeliculas = null;
       
        try{
            //Creamos un arrayList 
            misPeliculas = new ArrayList<>();
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(ACTIVO);
                ps.setString(1, estado);
            
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                peliculas miPeli = new peliculas();
                miPeli.setPeliID(rs.getString("peli_id"));
                miPeli.setPeliTitulo(rs.getString("peli_titulo"));
                miPeli.setAnio(rs.getInt("peli_anio"));
                miPeli.setAudio(rs.getString("peli_audio"));
                miPeli.setCalidad(rs.getString("peli_calidad"));
                miPeli.setGenero(rs.getString("peli_genero"));
                miPeli.setEstado(rs.getString("peli_estado"));
             
                misPeliculas.add(miPeli);
            }// fin del while
        }catch(SQLException ex){
            throw new DAOException("Error en SQL: " + ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
        
        return misPeliculas;
    }// fin del método obtenerVisibles

    /**
     * Método para cambiar de estado las Películas a Activas o Inactivas
     * @param estado
     * @throws DAOException 
     */
    @Override
    public void estado(peliculas estado) throws DAOException {
        try{
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
             
            //Preparamos la consulta SQL y especificamos los parámetros de entrada
            ps = conn.prepareStatement(ESTADO);
                ps.setString(1, estado.getEstado());
                ps.setString(2, estado.getPeliID());
                
            //Ejecutamos la consulta y verificamos  el resultado
            if(ps.executeUpdate() == 0){
                throw new DAOException("Hubo un problema y no se guardaron los cambios");
            }
        }catch(SQLException ex){
            throw new DAOException("ERROR de SQL", ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
    }

    /**
     * Método para obtener todas las películas que están Inacitvas y Vendidas
     * @param estado
     * @param estado1
     * @return misPeliculas
     * @throws DAOException 
     */
    @Override
    public List<peliculas> obtenerInactivoVendido(String estado, String estado1) throws DAOException {
        List<peliculas> misPeliculas = null;
       
        try{
            //Creamos un arrayList 
            misPeliculas = new ArrayList<>();
            
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(INACTIVOVEND);
                ps.setString(1, estado);
                ps.setString(2, estado1);
           
            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                peliculas miPeli = new peliculas();
                miPeli.setPeliID(rs.getString("peli_id"));
                miPeli.setPeliTitulo(rs.getString("peli_titulo"));
                miPeli.setAnio(rs.getInt("peli_anio"));
                miPeli.setAudio(rs.getString("peli_audio"));
                miPeli.setCalidad(rs.getString("peli_calidad"));
                miPeli.setGenero(rs.getString("peli_genero"));
                miPeli.setEstado(rs.getString("peli_estado"));
                misPeliculas.add(miPeli);
            }// fin del while
        }catch(SQLException ex){
            throw new DAOException("Error en SQL: " + ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
        
        return misPeliculas;
    }// fin del método obtenerInactivoVendido
    
    /**
     * Método para obtener las películas que no se devolvierón en la fecha limite
     * @param estado
     * @return misPeliculas
     * @throws DAOException 
     */
    @Override
    public List<peliculas> obtenerNoDevueltas(String estado) throws DAOException {
        List<peliculas> misPeliculas = null;
       
        try{
            //Creamos un arrayList 
            misPeliculas = new ArrayList<>();
            
            //Creamos la conexión a la BD
            conn = Conectar.ConectarBD();
            
            //preparamos la consulta y especificamos los parametros de entrada
            ps = conn.prepareStatement(NODEV);
                ps.setString(1, estado);

            //ejecutamos la consulta y almacenamos el resultado en un objeto RS
            rs = ps.executeQuery();
            
            //recorremos el RS y agregamos cada item al ArrayList
            while(rs.next()){
                peliculas miPeli = new peliculas();
                miPeli.setPeliID(rs.getString("peli_id"));
                miPeli.setPeliTitulo(rs.getString("peli_titulo"));
                miPeli.setAnio(rs.getInt("peli_anio"));
                miPeli.setAudio(rs.getString("peli_audio"));
                miPeli.setCalidad(rs.getString("peli_calidad"));
                miPeli.setGenero(rs.getString("peli_genero"));
                miPeli.setEstado(rs.getString("peli_estado"));
             
                misPeliculas.add(miPeli);
            }// fin del while
        }catch(SQLException ex){
            throw new DAOException("Error en SQL: " + ex);
        }finally{
            cerrarConexiones(ps, rs, conn);
        }// fin del finally
        
        return misPeliculas;
    }// fin del método obtenerNoDevueltas
    
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
    public void venta(peliculas a) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}// fin de la clase MySQLPeliculasDAO
