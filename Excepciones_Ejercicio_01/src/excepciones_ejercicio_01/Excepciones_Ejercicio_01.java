/*
1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el 
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula 
try-catch para probar la nueva excepción que debe ser controlada
 */
package excepciones_ejercicio_01;

import Entidad.Persona;

/**
 *
 * @author erik_
 */
public class Excepciones_Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona Persona1 = new Persona();
        int pesomenor=0;
        int pesoideal=0;
        int pesomayor=0;
        int mayoredad=0;
        int menoredad=0;

        Persona1.crearPersona();
        Persona1.calcularIMC();
        
        Persona Persona2 = new Persona();


        
        try {
            Persona1.esMayorDeEdad();
            Persona2.esMayorDeEdad();
            System.out.println(Persona2.esMayorDeEdad());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
 }