/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese dos numero enteros :");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma;
        
        suma = num1 + num2;
        System.out.println("El resultado de la suma es : "+ suma);
        
    }
    
}
