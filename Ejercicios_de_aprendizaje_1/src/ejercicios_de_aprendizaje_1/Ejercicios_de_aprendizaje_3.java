/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
 * Java.
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase :");
        
        String frase = leer.nextLine();
        
        System.out.println("La frase ingresada en minusculas es : " + frase.toLowerCase());
        System.out.println("La frase ingresada en mayusculas es : " + frase.toUpperCase());
    }
    
}


