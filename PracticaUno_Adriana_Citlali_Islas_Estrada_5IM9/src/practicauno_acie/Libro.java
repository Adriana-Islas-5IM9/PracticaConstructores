/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicauno_acie;

/**
 *
 * @author Alumno
 */
public class Libro {
    
    String autor = "";
    String nombre = "";
    int precio = 0;
    int año = 0;
    boolean disponible = false;

    public Libro(boolean disponible) {
        this.disponible = disponible;
    }
    

    public Libro() {
    }

    public Libro(String autor, String nombre, int precio, int año) {
        this.autor = autor;
        this.nombre = nombre;
        this.precio = precio;
        this.año = año;
    }

    public Libro(String autor) {
        this.autor = autor;
    }

    public Libro(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Libro(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", nombre=" + nombre + ", precio=" + precio + ", a\u00f1o=" + año + ", disponible=" + disponible + '}';
    }
    
    
    
    
    
}
