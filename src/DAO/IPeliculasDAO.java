/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.peliculas;
import java.util.List;

/**
 *
 * @author Jesús Moisés
 */
public interface IPeliculasDAO extends IDAO<peliculas, String>{
  
    //Lista para obtener peliculas según el género solicitado
    List<peliculas> obtenerPeliculas(String genero) throws DAOException;
    //Lista para obtener todaas las películas
    List<peliculas> obtenerTodasPeli(String todas) throws DAOException;
    //Lista para obtener todas las peliculas con otra columna mas, se utiliza para la edición
    List<peliculas> obtenerPeliEdit() throws DAOException;
    //Lista para obtener peliculas por género al buscarlas
    List<peliculas> obtenerBusqueda(String genero, String busqueda) throws DAOException;
    //Lista para obtener peliculas al buscarlas
    List<peliculas> obtenerBusquedaGEN(String busqueda) throws DAOException;
    //Lista para obtener lista de Peliculas Actvas e inactivas
    List<peliculas> obtenerActivo(String estado) throws DAOException;
    //Lista para obtener las peliculas Inactivas y Vendidas
    List<peliculas> obtenerInactivoVendido(String estado, String estado1) throws DAOException;
   

}
