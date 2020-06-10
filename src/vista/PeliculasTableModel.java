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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesús Moisés
 */
public class PeliculasTableModel extends AbstractTableModel{
 
    //propiedades
    private IPeliculasDAO peliculas;
    
    //Lista de elementos de tipi Película
    private List<peliculas> datosPeli = new ArrayList<>();

    /**
     * Constructor
     * @param peliculas 
     */
    public PeliculasTableModel(IPeliculasDAO peliculas){
        this.peliculas = peliculas;
    }// fin del constructor
    
    @Override
    public String getColumnName(int colum){
        switch(colum){
            case 0: return "ID-Peli";
            case 1: return "Nombre";
            case 2: return "Año";
            case 3: return "Audio";
            case 4: return "Calidad";
            case 5: return "Precio Renta";
            case 6: return "Precio Venta";
            case 7: return "Género";
            case 8: return "Sinopsis";
            case 9: return "Caratula";
            default: return "[no]";
        }// fin del switchCase
    }// fin del método getColumnName
    
    /**
     * Retorna el número de elementos  obtenidos de la tabla títulos
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
        return 10;
    }// fin del método getColumnCount
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        peliculas preguntado = datosPeli.get(rowIndex);
        switch(columnIndex){
            case 0: return preguntado.getPeliID();
            case 1: return preguntado.getPeliTitulo();
            case 2: return preguntado.getAnio();
            case 3: return preguntado.getAudio();
            case 4: return preguntado.getCalidad();
            case 5: return preguntado.getPrecioRenta();
            case 6: return preguntado.getPrecioVenta();
            case 7: return preguntado.getGenero();
            case 8: return preguntado.getPeliSinopsis();
            case 9: return preguntado.getCaratula();
            default: return "";
        }// fin del switchCase
    }// fin del método getValueAt
    
    
    /**
     * Método para actualizar la tabla peliculas
     * @param genero
     * @throws DAOException 
     */
    public void updateModel(String genero) throws DAOException{
        this.datosPeli = peliculas.obtenerPeliculas(genero);
    }// fin del metodo updateModel
    
    /**
     * Método para actualizar la tabla peliculas
     * @param todas
     * @throws DAOException 
     */
    public void updateModelAll(String todas) throws DAOException{
        this.datosPeli = peliculas.obtenerTodasPeli(todas);
    }// fin del método updateModelAll
    
    /**
     * Método para realizar busqueda filtrada, Busqueda por nombre
     * @param genero
     * @param busqueda
     * @throws DAOException 
     */
    public void updateModelSearch(String genero, String busqueda) throws DAOException{
        this.datosPeli = peliculas.obtenerBusqueda(genero, busqueda);
    }// fin del método updateModelSearch
    
    
}// fin de la clase PeliculasTableModel
