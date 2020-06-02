/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import DAO.DAOException;
import DAO.IUsuarioDAO;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jesús Moisés
 */
public class UsuariosTableModel extends AbstractTableModel{

     //propiedades
    private IUsuarioDAO usuario;
    
    //Lista de elementos de tipi Película
    private List<Usuario> datosUsu = new ArrayList<>();

    /**
     * Constructor
     * @param usuario
     */
    public UsuariosTableModel(IUsuarioDAO usuario){
        this.usuario = usuario;
    }// fin del constructor
    
    /**
     * Nombre de las columnas a retornar en nuestra tabla
     * @param colum
     * @return 
     */
    @Override
    public String getColumnName(int colum){
        switch(colum){
            case 0: return "ID_Usuario";
            case 1: return "Nombre";
            case 2: return "Paterno";
            case 3: return "Matero";
            case 4: return "Domicilio";
            case 5: return "Celular";
            case 6: return "NickName";
            default: return "[no]";
        }// fin del switchCase
    }// fin del método getColumnName
    
    /**
     * Retorna el número de elementos  obtenidos de la tabla clientes
     * @return 
     */
    @Override
    public int getRowCount() {
        return datosUsu.size();
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
        Usuario preguntado = datosUsu.get(rowIndex);
        switch(columnIndex){
            case 0: return preguntado.getId_Usu();
            case 1: return preguntado.getNombreUsuario();
            case 2: return preguntado.getApellidoPaterno();
            case 3: return preguntado.getApellidoMaterno();
            case 4: return preguntado.getDomicilio();
            case 5: return preguntado.getCelular();
            case 6: return preguntado.getNickName();
            default: return "";
        }// fin del switchCase
    }// fin del método getValueAt
    
    /**
     * Método para actualizar la tabla Usuario
     * @throws DAOException 
     */
    public void updateModel() throws DAOException{
        this.datosUsu = usuario.obtenerTodos();
    }// fin del metodo updateModel
    
}// fin de la clase UsuariosTableModel
