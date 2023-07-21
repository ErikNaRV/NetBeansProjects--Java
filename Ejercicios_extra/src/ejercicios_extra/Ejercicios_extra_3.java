/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
 * String.
 */
package ejercicios_extra;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una vocal");
      
        String vocal = leer.next();
        if(vocal.equals("a")|| vocal.equals("e")||vocal.equals("i")||vocal.equals("o")||vocal.equals("u")){
            System.out.println("Se ingreso una vocal");
        }else{
            System.out.println("No es vocal");
        }
        
    }
    
}
