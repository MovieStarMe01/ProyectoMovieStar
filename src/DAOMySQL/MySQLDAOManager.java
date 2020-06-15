/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOMySQL;

import DAO.DAOManager;
import DAO.IClienteDAO;
import DAO.INotasDAO;
import DAO.IPeliculasDAO;
import DAO.IUsuarioDAO;

/**
 *
 * @author Jesús Moisés
 */
public class MySQLDAOManager implements DAOManager{
    
    //Campos
    private IUsuarioDAO usuario = null;
    private IClienteDAO cliente = null;
    private IPeliculasDAO pelicula = null;
    private INotasDAO notas = null;
    
    /**
     * Con esta clase hacemoss el uso del patrón singleton para reutilizar 
     * objetos si estos ya han sido creados
     * @return usuario
     */
    @Override
    public IUsuarioDAO getUsuarioDAO() {
         if(usuario == null){
            usuario = new MySQLUsuarioDAO();
        }// fin del if
        return usuario;
    }// fin del método getUsuarioDAO

    /**
     * Con esta clase hacemoss el uso del patrón singleton para reutilizar 
     * objetos si estos ya han sido creados
     * @return cliente
     */
    @Override
    public IClienteDAO getClienteDAO() {
        if(cliente == null){
            cliente = new MySQLClienteDAO();
        }// fin cel if
        return cliente;
    }// fin del método getClienteDAO
    
    /**
     * Con esta clase hacemoss el uso del patrón singleton para reutilizar 
     * objetos si estos ya han sido creados
     * @return pelicula
     */
    @Override
    public IPeliculasDAO getPeliculasDAO() {
        if(pelicula == null){
            pelicula = new MySQLPeliculasDAO();
        }// fin cel if
        return pelicula;
    }// fin del método getPeliculasDAO
    
    /**
     * Con esta clase hacemoss el uso del patrón singleton para reutilizar 
     * objetos si estos ya han sido creados
     * @return notas
     */
    @Override
    public INotasDAO getNotasDAO() {
        if(notas == null){
            notas = new MySQLNotasDAO();
        }// fin cel if
        return notas;
    }// fin del método getNotasDAO
   
}// fin de la clase MySQLDAOManager
