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
public abstract class  LibroAbs implements LoQueHaceElLibro{
    
    int iva = 2;
    int precio = 0;
    int anio;
 
    public int buy(String nombre, int precio1) throws Exception{
        precio = precio1 + iva;
        return precio;
    }
    public String verAuthor(String nombre) throws Exception{
        
        return nombre;
    }
    public String read(String nombre) throws Exception{
        return nombre;
    }
    
    
    public abstract int seeAnio(String nombre) throws Exception;
    public abstract int seeNombre(String nombre) throws Exception;
    
    
}
