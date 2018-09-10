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
public class MainLibro {
    public static void main(String[] args) throws Exception {
      
        Libro lib = new Libro();
        Libro lib1 = new Libro(2001);
        Libro lib2 = new Libro("Great Expectactions");
        Libro lib3 = new Libro("Charles Dickens","A christmas Carol",250,1930);
        Libro lib4 = new Libro("Oliver Twist",300);
        
        lib1.vender("Orlando");
        
        
        System.out.println(lib);
        System.out.println(lib1);
        System.out.println(lib2);
        System.out.println(lib3);
        System.out.println(lib4);
        
        //Instanciando métodos de la interface
        lib1.vender("Orlando");
        
        
    }
}
