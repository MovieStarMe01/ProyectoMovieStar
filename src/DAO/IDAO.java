/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 * @author Jesús Moisés
 * @param <T> hace referencia a  una clase del paquete Modelo
 * @param <K> el id que identifica a un objeto de la clase Modelo
 */
public interface IDAO <T, K> {
    
    void insertar(T a) throws DAOException;
    void modificar(T a) throws DAOException;
    void eliminar(K id) throws DAOException;
    //Verificar contraseña
    boolean verificaUP(String a, String passE) throws DAOException;
    List<T> obtenerTodos() throws DAOException;
    List<T> obtenerRentadas() throws DAOException;
    T obtener(K id) throws DAOException;
}// fin de la interface
