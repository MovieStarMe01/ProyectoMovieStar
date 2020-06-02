/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jesús Moisés
 */
public class cliente {
    //Campos
    private String nombreCliente;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String celular;
    private String correo;
    private int cli_ID;

    /**
     * Constructor vacio
     */
    public cliente() {
        super();
    }// fin de constrcutor vacio

    /**
     * Constructor con idCliente
     * @param nombreCliente
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param domicilio
     * @param celular
     * @param correo
     * @param cli_ID 
     */
    public cliente(String nombreCliente, String apellidoPaterno, String apellidoMaterno, String domicilio, String celular, String correo, int cli_ID) {
        this.nombreCliente = nombreCliente;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.celular = celular;
        this.correo = correo;
        this.cli_ID = cli_ID;
    }// fin del constructor con idCliente
    
    
    /**
     * Constructor con sus parámetros
     * @param nombreCliente
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param domicilio
     * @param celular
     * @param correo 
     */
    public cliente(String nombreCliente, String apellidoPaterno, String apellidoMaterno, String domicilio, String celular,
            String correo) {
        this.nombreCliente = nombreCliente;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.celular = celular;
        this.correo = correo;
    }// fin del constructor cliente

    // Getters & Setters
    
    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the cli_ID
     */
    public int getCli_ID() {
        return cli_ID;
    }

    /**
     * @param cli_ID the cli_ID to set
     */
    public void setCli_ID(int cli_ID) {
        this.cli_ID = cli_ID;
    }
     
    
}// fin de la clase cliente
