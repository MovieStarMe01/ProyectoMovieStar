/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.notas;
import java.util.List;

/**
 * @author Erick
 * @author Jesús Moisés
 */
public interface INotasDAO extends IDAO<notas, Integer>{
   //Obtenemos una lista con todas las notas según lo solicitado
   List<notas> obtenerNotas() throws DAOException;
   
}// fin de la interface INotasDAO
