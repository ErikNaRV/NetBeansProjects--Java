/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 * Math.sqrt()..
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero ");
        int num = leer.nextInt();
        
        int doble = num + num;
        int triple = num * 3;
        double raiz =  Math.sqrt(num);
        
        System.out.println("El doble del numero "+ num + " es "+ doble);
        System.out.println("El triple del numero "+ num + " es "+ triple);
        System.out.println("La raiz del numero "+ num + " es "+ raiz);
        
        
        
        
    }
    
}
