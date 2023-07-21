/*
 *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
 *pedirá de nuevo hasta que la nota sea correcta.
 */
package javaintroduccion_ej6;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Java_Ej_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 - 10");
        int nota = leer.nextInt();
        
        
        while (nota < 0 || nota > 10){
            
            System.out.println(" La nota ingresada no esta entre 0 - 10 ");
            nota = leer.nextInt();   
        }
        
        
        
        
    }
    
}
