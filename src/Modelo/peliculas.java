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

    /**
     * Constructor con parámetros
     * @param genero
     * @param peliTitulo
     * @param peliSinopsis
     * @param precioRenta
     * @param precioVenta
     * @param caratula
     * @param estado 
     */
    public peliculas(String genero, String peliTitulo, String peliSinopsis, double precioRenta, double precioVenta, 
            String caratula, String estado) {
        this.genero = genero;
        this.peliTitulo = peliTitulo;
        this.peliSinopsis = peliSinopsis;
        this.precioRenta = precioRenta;
        this.precioVenta = precioVenta;
        this.caratula = caratula;
        this.estado = estado;
    }// fin del constructor peliculas
    
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
    
}// fin de la clase peliculas
