/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
 * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
 * investigar la función Substring y equals() de Java.
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase o palabra");
        
        String frase = leer.next().toUpperCase();
        
        System.out.println(frase.substring(0,1));
        
        if("A".equals(frase.substring(0,1))){
            System.out.println("Correcto");
        }else{
            
            System.out.println("Incorrecto");
        }
        
        
        
        
        
        
    }
    
}
