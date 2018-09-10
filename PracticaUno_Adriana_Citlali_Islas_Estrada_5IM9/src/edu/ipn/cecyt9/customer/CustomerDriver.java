package edu.ipn.cecyt9.customer;
/**
 * 
 * @author Adriana Citlali Islas Estrada
 * @version 1.0
 */


public class CustomerDriver {

    public static void main(String[] args) throws Exception {
        // Define a reference and creates a new Customer object
        //Customer customer;
//        customer = new Customer();
        //aqui defino que quiero instaciar mi objeto utilizando el constructor 
//        que recibe un parametro 
//        los paramnetros se los puedo pasar directamente por ejemplo
//         customer = new Customer("Default Customer");
//        o desde consola como lo haremos a continuacion
//          customer = new Customer(args[0]);
            //aqui defino que quiero instaciar mi objeto utilizando el constructor 
//        que recibe dos parametros desde consola
//          customer = new Customer(args[0], args[1]);
            //aqui defino que quiero instaciar mi objeto utilizando el constructor 
//        que recibe tres parametros desde consola
          //customer = new Customer(args[0], args[1], args[2]);
        //System.out.println(customer.toString());
        
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
        
        //Instaciando métodos en la interface
        lib1.vender("Orlando");
        
    }
}
