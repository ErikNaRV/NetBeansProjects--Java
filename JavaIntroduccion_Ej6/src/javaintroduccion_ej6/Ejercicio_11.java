/*
 *Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
 *en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
 *reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
 *vocales acentuadas) se mantienen sin cambios
 */
package javaintroduccion_ej6;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
       String frase = leer.nextLine();
       
       int tamaño = frase.length();
       int i = tamaño; 
       int u = 1;
       int o = 0;
       String letra;  
    
       
       do {
           
           letra = frase.substring(o,u);
           
         switch(letra){
             
             case "a" :
                 System.out.print("@");
                 break;
             case "e" :
                 System.out.print("#");
                 break;
             case "i" :
                 System.out.print("$");
                 break;
             case "o" :
                 System.out.print("%");
                 break;
             case "u" :
                 System.out.print("*");
                 break;
             default :
                 System.out.print(letra);  
                 
                 
         }  
         o++;
         u++;
         i--;
       }while(i>0);
       
       System.out.println(" ");
    }
    
}
