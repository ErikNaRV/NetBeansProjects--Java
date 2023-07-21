/*
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
 *que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
 *segundo, sino informe que no lo son.
 */
package javaintroduccion_ej6;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer numero :");
        int  num1= leer.nextInt();
        System.out.print("Ingrese el segundo numero :");
        int  num2 = leer.nextInt();
        EsMultiplo(num1,num2);
    }
    
    
      public static void EsMultiplo(int num1,int num2 ){
          
          
          if (num1 % num2 == 0){
              System.out.print("El numero "+ num1 + " es multiplo del numeor "+num2);
          }else{
              System.out.print("El numero "+ num1 + " no es multiplo del numeor "+num2);
          }
          System.out.println(" ");
    }
}
  