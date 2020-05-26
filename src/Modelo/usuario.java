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
public class usuario {
    //Campos
    private String nombreUsuario;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domiciilio;
    private String celular;
    private String nickName;
    private String contraseña;

    /**
     * constructor con sus parámetros
     * @param nombreUsuario
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param domiciilio
     * @param celular
     * @param nickName
     * @param contraseña 
     */
    public usuario(String nombreUsuario, String apellidoPaterno, String apellidoMaterno, String domiciilio, String celular,
            String nickName, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domiciilio = domiciilio;
        this.celular = celular;
        this.nickName = nickName;
        this.contraseña = contraseña;
    }// fin del constructor usuario
    
    //Getters & Setteres

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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
     * @return the domiciilio
     */
    public String getDomiciilio() {
        return domiciilio;
    }

    /**
     * @param domiciilio the domiciilio to set
     */
    public void setDomiciilio(String domiciilio) {
        this.domiciilio = domiciilio;
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
     * @return the nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName the nickName to set
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
     
}// fin de la clase usuario
