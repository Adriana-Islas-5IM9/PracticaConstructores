/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 *
 * @author Alumno
 */
public interface LoQueHaceElLibro {
    
    public String leer(String nombre) throws Exception;
    public String verAutor(String nombre) throws Exception;
    public int comprar(String nombre) throws Exception;
    public int verAnio(String nombre) throws Exception;
    public boolean vender(String nombre) throws Exception;
}
