/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 * 
 * @author Adriana Citlali Islas Estrada
 * @version 1.0
 */
public class Libro implements LoQueHaceElLibro{
    
    String autor = "";
    String nombre = "";
    int precio = 0;
    int anio = 0;
    boolean disponible = false;
    
    public Libro() {
    }

    /**
     *
     * @param disponible
     */
    public Libro(boolean disponible) {
        this.disponible = disponible;
    }
    
    /**
     *
     */
    

    /**
     *
     * @param autor
     * @param nombre
     * @param precio
     * @param anio
     */
    public Libro(String autor, String nombre, int precio, int anio) {
        this.autor = autor;
        this.nombre = nombre;
        this.precio = precio;
        this.anio = anio;
    }

    /**
     *
     * @param autor
     */
    public Libro(String autor) {
        this.autor = autor;
    }

    /**
     *
     * @param nombre
     * @param precio
     */
    public Libro(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     *
     * @param anio
     */
    public Libro(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", nombre=" + nombre + ", precio=" + precio + ", a\u00f1o=" + anio + ", disponible=" + disponible + '}';
    }

    @Override
    public String leer(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verAutor(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int comprar(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int verAnio(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vender(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
