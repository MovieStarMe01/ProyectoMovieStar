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
    private String peliID;
    private String genero;
    private String peliTitulo;
    private String peliSinopsis;
    private double precioRenta;
    private double precioVenta;
    private String caratula;
    private String estado;
    private String audio;
    private String calidad;
    private int anio;

    /**
     * Constructor vacio
     */
    public peliculas() {
        super();
    }// fin del constuctor vacio

    
    
    /**
     * Constructor con parámetros
     * @param peliID 
     * @param genero
     * @param peliTitulo
     * @param peliSinopsis
     * @param precioRenta
     * @param precioVenta
     * @param caratula
     * @param audio
     * @param calidad 
     * @param anio 
     * @param estado
     */
    public peliculas(String peliID, String genero, String peliTitulo, String peliSinopsis, double precioRenta, double precioVenta, 
            String caratula, String audio, String calidad, int anio, String estado) {
        this.peliID = peliID;
        this.genero = genero;
        this.peliTitulo = peliTitulo;
        this.peliSinopsis = peliSinopsis;
        this.precioRenta = precioRenta;
        this.precioVenta = precioVenta;
        this.caratula = caratula;
        this.audio = audio;
        this.calidad = calidad;
        this.anio = anio;
        this.estado = estado;
    }// fin del constructor peliculas

    /**
     * Constructor sin el parámetro estado
     * @param peliID 
     * @param genero
     * @param peliTitulo
     * @param peliSinopsis
     * @param precioRenta
     * @param precioVenta
     * @param caratula
     * @param audio
     * @param calidad 
     * @param anio 
     */
    public peliculas(String peliID, String genero, String peliTitulo, String peliSinopsis, double precioRenta, double precioVenta, 
            String caratula, String audio, String calidad, int anio){
        this.peliID = peliID;
        this.genero = genero;
        this.peliTitulo = peliTitulo;
        this.peliSinopsis = peliSinopsis;
        this.precioRenta = precioRenta;
        this.precioVenta = precioVenta;
        this.caratula = caratula;
        this.audio = audio;
        this.calidad = calidad;
        this.anio = anio; 
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
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
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
