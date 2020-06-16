/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Erick
 * @author Jesús Moisés
 */
public class Conectar {
    
    public static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    public static final String URL_BASEDATOS = "jdbc:mysql://localhost:3306/pelicula?useSSL=false";    
    public static final String NOMBREUSUARIO = "root";
    public static final String CONTRASENIA = "";
     
    public static Connection conn = null;
    /**
     * Método para realizar la conexión en la BD
     * @return conn
     * @throws SQLException 
     */
    public static Connection ConectarBD() throws SQLException{
              
        try{
            Class.forName(CONTROLADOR);
            //Establecemos la conexión  a la BD
            conn = DriverManager.getConnection(URL_BASEDATOS, NOMBREUSUARIO, CONTRASENIA);
            
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return conn;
    }// fin del método ConectarBD
    
    /**
     * Método para poder desconectar la BD
     * @throws SQLException 
     */
    public static void desconectarBD() throws SQLException{
        if(conn != null){
            //se cierra la conexión que tenemos en nuestra BD
            conn.close();
        }// fin del if
    }// fin del método desconectarBD
   
}// fin de la clase Conectar
