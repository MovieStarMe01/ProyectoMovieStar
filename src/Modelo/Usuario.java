/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * @author Erick
 * @author Jesús Moisés
 */
public class Usuario {
    //Campos
    private String nombreUsuario;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String celular;
    private String nickName;
    private String contraseña;
    private int id_Usu;

    /**
     * Constrcutor vacio
     */
    public Usuario() {
        super();
    }// fin del constrcutor vacio
    
    /**
     * Constructor con todos los parámetros
     * @param nombreUsuario
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param domicilio
     * @param celular
     * @param nickName
     * @param contraseña
     * @param id_Usu 
     */
    public Usuario(String nombreUsuario, String apellidoPaterno, String apellidoMaterno, String domicilio, String celular,
            String nickName, String contraseña, int id_Usu) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.celular = celular;
        this.nickName = nickName;
        this.contraseña = contraseña;
        this.id_Usu = id_Usu;
    }// fin del constrcutor
   
    
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
    public Usuario(String nombreUsuario, String apellidoPaterno, String apellidoMaterno, String domicilio, String celular,
            String nickName, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
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
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domiciilio the domiciilio to set
     */
    public void setDomiciilio(String domiciilio) {
        this.domicilio = domiciilio;
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

    /**
     * @return the id_Usu
     */
    public int getId_Usu() {
        return id_Usu;
    }

    /**
     * @param id_Usu the id_Usu to set
     */
    public void setId_Usu(int id_Usu) {
        this.id_Usu = id_Usu;
    }
    
    
     
}// fin de la clase usuario
