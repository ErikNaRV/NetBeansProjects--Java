/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
 * el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
 * “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String frase = leer.nextLine();
        
        int l = frase.length();
        System.out.println(l);
        if(l == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        
     
    }
    
}
