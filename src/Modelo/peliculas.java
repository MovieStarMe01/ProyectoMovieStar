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
public class peliculas {
    //Campos
    private String genero;
    private String peliTitulo;
    private String peliSinopsis;
    private double precioRenta;
    private double precioVenta;
    private String caratula;
    private String estado;
    private int año;
    private String audio;
    private String calidad;
    private String peliID;

    /**
     * Constructor con parámetros
     * @param genero
     * @param peliTitulo
     * @param peliSinopsis
     * @param precioRenta
     * @param precioVenta
     * @param caratula
     * @param estado 
     * @param año 
     * @param audio 
     * @param calidad 
     * @param peliID 
     */
    public peliculas(String genero, String peliTitulo, String peliSinopsis, double precioRenta, double precioVenta, 
            String caratula, String estado, int año, String audio, String calidad, String peliID) {
        this.genero = genero;
        this.peliTitulo = peliTitulo;
        this.peliSinopsis = peliSinopsis;
        this.precioRenta = precioRenta;
        this.precioVenta = precioVenta;
        this.caratula = caratula;
        this.estado = estado;
        this.año = año;
        this.audio = audio;
        this.calidad = calidad;
        this.peliID = peliID;
    }// fin del constructor peliculas

    /**
     * Constructor sin el parámetro estado
     * @param genero
     * @param peliTitulo
     * @param peliSinopsis
     * @param precioRenta
     * @param precioVenta
     * @param caratula
     * @param año
     * @param audio
     * @param calidad 
     * @param peliID 
     */
    public peliculas(String genero, String peliTitulo, String peliSinopsis, double precioRenta, double precioVenta, 
            String caratula, int año, String audio, String calidad, String peliID) {
        this.genero = genero;
        this.peliTitulo = peliTitulo;
        this.peliSinopsis = peliSinopsis;
        this.precioRenta = precioRenta;
        this.precioVenta = precioVenta;
        this.caratula = caratula;
        this.año = año;
        this.audio = audio;
        this.calidad = calidad;
        this.peliID = peliID;
    }// fin del construtor
    
    
    
    // Getters & Setters

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the peliTitulo
     */
    public String getPeliTitulo() {
        return peliTitulo;
    }

    /**
     * @param peliTitulo the peliTitulo to set
     */
    public void setPeliTitulo(String peliTitulo) {
        this.peliTitulo = peliTitulo;
    }

    /**
     * @return the peliSinopsis
     */
    public String getPeliSinopsis() {
        return peliSinopsis;
    }

    /**
     * @param peliSinopsis the peliSinopsis to set
     */
    public void setPeliSinopsis(String peliSinopsis) {
        this.peliSinopsis = peliSinopsis;
    }

    /**
     * @return the precioRenta
     */
    public double getPrecioRenta() {
        return precioRenta;
    }

    /**
     * @param precioRenta the precioRenta to set
     */
    public void setPrecioRenta(double precioRenta) {
        this.precioRenta = precioRenta;
    }

    /**
     * @return the precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the caratula
     */
    public String getCaratula() {
        return caratula;
    }

    /**
     * @param caratula the caratula to set
     */
    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the audio
     */
    public String getAudio() {
        return audio;
    }

    /**
     * @param audio the audio to set
     */
    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
     * @return the calidad
     */
    public String getCalidad() {
        return calidad;
    }

    /**
     * @param calidad the calidad to set
     */
    public void setCalidad(String calidad) {
        this.calidad = calidad;
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
       
    
}// fin de la clase peliculas
