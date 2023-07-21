/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package excepciones_ejercicios_05;

import Entidades.Juego;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Excepciones_Ejercicios_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego newJuego = new Juego();
        Scanner leer = new Scanner(System.in);
        do{
           try {

            newJuego.crearJuego();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        }while(newJuego.crearJuego());

        
    }

}
