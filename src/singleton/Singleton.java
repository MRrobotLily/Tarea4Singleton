/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author niza
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseDeDatos db1 = BaseDeDatos.obtenerInstancia();
        BaseDeDatos db2 = BaseDeDatos.obtenerInstancia();

        db1.ejecutarConsulta("SELECT * FROM usuarios");
        db2.ejecutarConsulta("INSERT INTO productos (nombre, precio) VALUES ('Laptop', 1200)");

        if (db1 == db2) {
            System.out.println("Las dos referencias son iguales, es la misma instancia.");
        } else {
            System.out.println("Las dos referencias son diferentes, hay multiples instancias.");
        }
    }
}

    
    

