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
            case 0: return "Nombre";
            case 1: return "Año";
            case 2: return "Audio";
            case 3: return "Calidad";
            case 4: return "Precio Renta";
            case 5: return "Precio Venta";
            case 6: return "Género";
            case 7: return "Sinopsis";
            case 8: return "Caratula";
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
        return 9;
    }// fin del método getColumnCount
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        peliculas preguntado = datosPeli.get(rowIndex);
        switch(columnIndex){
            case 0: return preguntado.getPeliTitulo();
            case 1: return preguntado.getAnio();
            case 2: return preguntado.getAudio();
            case 3: return preguntado.getCalidad();
            case 4: return preguntado.getPrecioRenta();
            case 5: return preguntado.getPrecioVenta();
            case 6: return preguntado.getGenero();
            case 7: return preguntado.getPeliSinopsis();
            case 8: return preguntado.getCaratula();
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
    
    public void updateModelAll(String todas) throws DAOException{
        this.datosPeli = peliculas.obtenerTodasPeli(todas);
    }
    
    /**
     * Método para realizar busqueda filtrada, Busqueda por nombre
     * @param busqueda
     * @throws DAOException 
     */
    public void updateModelSearch(String busqueda) throws DAOException{
        this.datosPeli = peliculas.obtenerBusquedaGEN(busqueda);
    }// fin del método updateModelSearch
    
    
}// fin de la clase PeliculasTableModel
