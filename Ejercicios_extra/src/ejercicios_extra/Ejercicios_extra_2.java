/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
 * una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
 * C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
 * iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejercicios_extra;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int A = 1; 
        int B = 2; 
        int C = 3; 
        int D = 4; 
        int aux ;
        System.out.println("Los valores iniciales son A="+A+" ,B="+B+" ,C="+C+" ,D="+D);
        
            aux = B ;
            B = C;
            C = A;
            A = D;
            D = aux;
            
        System.out.println("Los valores finales son A="+A+" ,B="+B+" ,C="+C+" ,D="+D); 
        
        
        
        
    }
    
}
