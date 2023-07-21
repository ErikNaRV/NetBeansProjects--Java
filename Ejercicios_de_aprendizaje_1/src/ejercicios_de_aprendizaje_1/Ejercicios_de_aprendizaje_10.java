/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 *  solicite números al usuario hasta que la suma de los números introducidos supere el
 *  límite inicial.
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
       int suma;
       int limite ;
       
       suma = 0;
       
       
       do{
          System.out.println("Ingrese el limite positivo ");
          limite = leer.nextInt();
           
       }while( limite  < 0);
       

       do{
           System.out.println("Ingrese un numero a sumar");
          int numero = leer.nextInt() ;
           suma = suma + numero;
           
       }while(suma < limite+1);
       
       
       
       
       
    }
    
}
