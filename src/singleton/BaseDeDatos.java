/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author niza
 */
public class BaseDeDatos {
    private static BaseDeDatos instanciaUnica;

    private BaseDeDatos() {
        System.out.println("Conexion a la base de datos establecida.");
    }

    public static BaseDeDatos obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new BaseDeDatos();
        }
        return instanciaUnica;
    }

    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta: " + consulta);
    }
}

    

