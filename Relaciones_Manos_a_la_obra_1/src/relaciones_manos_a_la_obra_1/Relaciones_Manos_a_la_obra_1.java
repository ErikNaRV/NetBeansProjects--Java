/*
 EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package relaciones_manos_a_la_obra_1;

import Clase.DNI;
import Clase.Persona;

/**
 *
 * @author erik_
 */
public class Relaciones_Manos_a_la_obra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       DNI d = new DNI();
       
       Persona p = new Persona();
       
       d.setNumero(5);
       d.setSerie("fer3528weq");
       p.setNombre("Erik");
       p.setApellido("Narváez");
       p.setDni(d);
       
        System.out.println("Nombre: "+p.getNombre() + "\nApellido: "+p.getApellido());
        System.out.println("Dni: "+p.getDni().getSerie()+"-"+p.getDni().getNumero());
    }
    
}
