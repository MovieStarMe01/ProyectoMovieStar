/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import DAO.DAOException;
import DAO.IPeliculasDAO;
import Modelo.peliculas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Erick
 * @author Jesús Moisés
 */
public class PeliculasVisiblesTableModel extends AbstractTableModel{
    
    //propiedades
    private IPeliculasDAO peliculas;
    
    //Lista de elementos de tipi Película
    private List<peliculas> datosPeli = new ArrayList<>();

    /**
     * Constructor
     * @param peliculas 
     */
    public PeliculasVisiblesTableModel(IPeliculasDAO peliculas){
        this.peliculas = peliculas;
    }// fin del constructor
    
    @Override
    public String getColumnName(int colum){
        switch(colum){
            case 0: return "ID-Pelicula";
            case 1: return "Nombre";
            case 2: return "Año";
            case 3: return "Audio";
            case 4: return "Calidad";
            case 5: return "Género";
            case 6: return "Estado";
            default: return "[no]";
        }// fin del switchCase
    }// fin del método getColumnName
     
    /**
     * Retorna el número de elementos  obtenidos de la tabla películas
     * @return 
     */
    @Override
    public int getRowCount() {
       return datosPeli.size();
    }// fin del método getRowCount
    
    /**
     * Retorna  el número de  columnas
     * @return 
     */
    @Override
    public int getColumnCount() {
        return 7;
    }// fin del método getColumnCount
    
    
    /**
     * Método para obtener información de dicha película a editar
     * @param rowIndex
     * @param columnIndex
     * @return 
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        peliculas preguntado = datosPeli.get(rowIndex);
        switch(columnIndex){
            case 0: return preguntado.getPeliID();
            case 1: return preguntado.getPeliTitulo();
            case 2: return preguntado.getAnio();
            case 3: return preguntado.getAudio();
            case 4: return preguntado.getCalidad();
            case 5: return preguntado.getGenero();
            case 6: return preguntado.getEstado();
            default: return "";
        }// fin del switchCase
    }// fin del método getValueAt
    
    
    /**
     * Método para actualizar la tabla peliculas con las Activas o Rentadas
     * @throws DAOException 
     * @param estado
     */
    public void updateModelAll(String estado) throws DAOException{
        this.datosPeli = peliculas.obtenerActivo(estado);
    }//fin del método updateModelAll
    
    /**
     * Método para Actualizar la tabla películas por el estado de la Película
     * @param estado
     * @throws DAOException 
     */
    public void updateModelID(String estado) throws DAOException{
        this.datosPeli = peliculas.obtenerNoDevueltas(estado);
    }// fin del método updateModelID
    
    /**
     * Método para actualizar la tabla películas con las Inactivas y Vendidas
     * @param estado
     * @param estado1
     * @throws DAOException 
     */
    public void updateModel(String estado, String estado1) throws DAOException{
        this.datosPeli = peliculas.obtenerInactivoVendido(estado, estado1);
    }// fin del método updateModel     
    
}// fin de la clase PeliculasVisiblesTableModel
