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
public class PeliculasEditTableModel extends AbstractTableModel{
    
    //propiedades
    private IPeliculasDAO peliculas;
    
    //Lista de elementos de tipi Película
    private List<peliculas> datosPeli = new ArrayList<>();

    /**
     * Constructor
     * @param peliculas 
     */
    public PeliculasEditTableModel(IPeliculasDAO peliculas){
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
            case 7: return "Caratula";
            case 8: return "Sinopsis";
            case 9: return "Género";
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
            case 5: return preguntado.getPrecioRenta();
            case 6: return preguntado.getPrecioVenta();
            case 7: return preguntado.getCaratula();
            case 8: return preguntado.getPeliSinopsis();
            case 9: return preguntado.getGenero();
            default: return "";
        }// fin del switchCase
    }// fin del método getValueAt
    
    
    /**
     * Método para actualizar la tabla peliculas
     * @throws DAOException 
     */
    public void updateModelAll() throws DAOException{
        this.datosPeli = peliculas.obtenerPeliEdit();
    }//fin del método updateModelAll
    
}// fin de la clase PeliculasEditTableModel
