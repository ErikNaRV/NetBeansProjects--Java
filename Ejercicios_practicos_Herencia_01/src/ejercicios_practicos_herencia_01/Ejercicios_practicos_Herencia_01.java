/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ejercicios_practicos_herencia_01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author erik_
 */
public class Ejercicios_practicos_Herencia_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro = new Perro("Rocky","Croquetas",2,"Chihuahua");
       Animal gato = new Gato("Max","Wiskas",5,"Persa");
       Animal caballo = new Caballo("Spirit","Pasto",6,"Pinto");
       
       perro.mostrarComida();
       gato.mostrarComida();
       caballo.mostrarComida();
    }
    
}
