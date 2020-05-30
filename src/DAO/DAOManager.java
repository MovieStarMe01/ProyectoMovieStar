/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Jesús Moisés
 */
public interface DAOManager {
    /*
    Mediante esta  interface haremos una forma centralizada de pedir
    cualquier DAO, Usuario etc.
    */
    IUsuarioDAO getUsuarioDAO();
    IClienteDAO getClienteDAO();
    IPeliculasDAO getPeliculasDAO();
   
}
