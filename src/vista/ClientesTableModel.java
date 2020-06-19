/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import DAO.DAOException;
import DAO.IClienteDAO;
import Modelo.cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Erick
 * @author Jesús Moisés
 */
public class ClientesTableModel extends AbstractTableModel{

    //propiedades
    private IClienteDAO cliente;
    
    //Lista de elementos de tipo Cliente
    private List<cliente> datosCli = new ArrayList<>();

    /**
     * Constructor
     * @param cliente 
     */
    public ClientesTableModel(IClienteDAO cliente){
        this.cliente = cliente;
    }// fin del constructor
    
    /**
     * Nombre de las columnas a retornar en nuestra tabla
     * @param colum
     * @return 
     */
    @Override
    public String getColumnName(int colum){
        switch(colum){
            case 0: return "ID";
            case 1: return "Nombre";
            case 2: return "Paterno";
            case 3: return "Materno";
            case 4: return "Domicilio";
            case 5: return "Celular";
            case 6: return "Correo";
            default: return "[no]";
        }// fin del switchCase
    }// fin del método getColumnName
    
    /**
     * Retorna el número de elementos  obtenidos de la tabla clientes
     * @return 
     */
    @Override
    public int getRowCount() {
        return datosCli.size();
    }// fin del método getRowCount

    /**
     * Retorna el número de columnas
     * @return 
     */
    @Override
    public int getColumnCount() {
        return 7;
    }

    /**
     * Obtenemos los nombres que irán en cada fila respcto a su columna
     * @param rowIndex
     * @param columnIndex
     * @return 
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        cliente preguntado = datosCli.get(rowIndex);
        switch(columnIndex){
            case 0: return preguntado.getCli_ID();
            case 1: return preguntado.getNombreCliente();
            case 2: return preguntado.getApellidoPaterno();
            case 3: return preguntado.getApellidoMaterno();
            case 4: return preguntado.getDomicilio();
            case 5: return preguntado.getCelular();
            case 6: return preguntado.getCorreo();
            default: return "";
        }// fin del switchCase
    }// fin del método getValueAt
    
    /**
     * Método para actualizar la tabla peliculas
     * @throws DAOException 
     */
    public void updateModel() throws DAOException{
        this.datosCli = cliente.obtenerTodos();
    }// fin del metodo updateModel
    
}// fin de la clase ClientesTableModel
