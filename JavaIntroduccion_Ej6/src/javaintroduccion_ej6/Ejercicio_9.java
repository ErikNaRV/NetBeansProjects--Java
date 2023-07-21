/*
 *Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
 *bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
 *resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
 *Nota: recordar el uso de la sentencia break.
 */
package javaintroduccion_ej6;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       
        int[] vector = new int[20];
        int i = 0;
        int u = 0 ;
      
        
        
        while (i<20){
           
            System.out.println("Ingrese el numero "  );
            System.out.println("El numeor debe se mayor a 0 " );
            vector[i] = leer.nextInt();
            if (vector[i] >= 1){
                 u = u + vector[i];
            }
            
            if (vector[i] == 0){
            
            System.out.println("Se capturó el numero 0");
            break;
     
            }
            i++;
        }
        
        System.out.println("La suma de los numero ingresado es : " + u);
        
    }
    
}
