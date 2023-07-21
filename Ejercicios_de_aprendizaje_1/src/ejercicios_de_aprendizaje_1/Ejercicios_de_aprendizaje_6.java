/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero para comprobar si es par o impar");
        int num;
        
        num = leer.nextInt();
        
        if(num % 2 == 0 ){
            
            System.out.println("El numero "+num+" es par  ");
            
        }else{
            System.out.println("El numero "+num+" no es par  ");
        }
        
        
    }
    
}
