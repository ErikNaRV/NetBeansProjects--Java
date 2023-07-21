/*
 *Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
 *alguno de ellos es mayor a 25.
 */
package javaintroduccion_ej6;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class JavaIntroduccion_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese dos numero enteros");
       int numero1 = leer.nextInt();
       int numero2 = leer.nextInt();
       
       if(numero1>25){
           System.out.println("El numero "+numero1+" es mayor a 25 ");
       }if(numero2>25) {
           
           System.out.println( "El numero "+numero2+" es mayor a 25 ");
       }
    
       }
    }

