/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.sql.Timestamp;

/**
 *
 * @author Erick Cabrera
 */
public class notas {
    //Campos
    private int notaId;
    private String notaTotal;
    private Timestamp notaFecha;
    private String peliID;
    private String notaTipo;
    private int usuarioID;
    private int clienteID;

    /**
     * Constructor con parámetros
     * @param notaId
     * @param notaTotal
     * @param notaFecha
     * @param peliID
     * @param notaTipo
     * @param usuarioID
     * @param clienteID 
     */
    public notas(int notaId, String notaTotal, Timestamp notaFecha, String peliID, String notaTipo, int usuarioID, 
            int clienteID) {
        this.notaId = notaId;
        this.notaTotal = notaTotal;
        this.notaFecha = notaFecha;
        this.peliID = peliID;
        this.notaTipo = notaTipo;
        this.usuarioID = usuarioID;
        this.clienteID = clienteID;
    }// fin del constructor notas

    /**
     * Consctructor sin el parámetro idNota
     * @param notaTotal
     * @param notaFecha
     * @param peliID
     * @param notaTipo
     * @param usuarioID
     * @param clienteID 
     */
    public notas(String notaTotal, Timestamp notaFecha, String peliID, String notaTipo, int usuarioID, int clienteID) {
        this.notaTotal = notaTotal;
        this.notaFecha = notaFecha;
        this.peliID = peliID;
        this.notaTipo = notaTipo;
        this.usuarioID = usuarioID;
        this.clienteID = clienteID;
    }// fin del cosntructor
    
    
    
    // Getters & Setters

    /**
     * @return the notaId
     */
    public int getNotaId() {
        return notaId;
    }

    /**
     * @param notaId the notaId to set
     */
    public void setNotaId(int notaId) {
        this.notaId = notaId;
    }

    /**
     * @return the notaTotal
     */
    public String getNotaTotal() {
        return notaTotal;
    }

    /**
     * @param notaTotal the notaTotal to set
     */
    public void setNotaTotal(String notaTotal) {
        this.notaTotal = notaTotal;
    }

    /**
     * @return the notaFecha
     */
    public Timestamp getNotaFecha() {
        return notaFecha;
    }

    /**
     * @param notaFecha the notaFecha to set
     */
    public void setNotaFecha(Timestamp notaFecha) {
        this.notaFecha = notaFecha;
    }

    /**
     * @return the peliID
     */
    public String getPeliID() {
        return peliID;
    }

    /**
     * @param peliID the peliID to set
     */
    public void setPeliID(String peliID) {
        this.peliID = peliID;
    }

    /**
     * @return the notaTipo
     */
    public String getNotaTipo() {
        return notaTipo;
    }

    /**
     * @param notaTipo the notaTipo to set
     */
    public void setNotaTipo(String notaTipo) {
        this.notaTipo = notaTipo;
    }

    /**
     * @return the usuarioID
     */
    public int getUsuarioID() {
        return usuarioID;
    }

    /**
     * @param usuarioID the usuarioID to set
     */
    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    /**
     * @return the clienteID
     */
    public int getClienteID() {
        return clienteID;
    }

    /**
     * @param clienteID the clienteID to set
     */
    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }
    
}// fin de la clase notas
