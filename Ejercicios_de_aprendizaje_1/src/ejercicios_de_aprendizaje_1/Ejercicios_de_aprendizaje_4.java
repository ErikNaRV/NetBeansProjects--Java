/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en °c ");
        
        int gradosC=leer.nextInt();
        int gradosF;
        
        int F = 32 +(9*gradosC/5);
        
        System.out.println("La temperatura en °F es " + F);
        
        
        
    }
    
}
