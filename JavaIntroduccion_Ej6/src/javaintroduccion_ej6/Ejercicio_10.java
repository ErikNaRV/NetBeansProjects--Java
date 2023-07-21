/*
 *Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
 *ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 5 *****
 3 ***
 11 ***********
 2 **
 */
package javaintroduccion_ej6;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros entre 1 - 20 ");
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        
        do {
            
           numero1 = leer.nextInt();
           
        }while(numero1 <1 || numero1>20);
       
        
        do {
            
           numero2 = leer.nextInt();
           
        }while(numero2 <1 || numero2>20);
              
        do {
            
           numero3 = leer.nextInt();
           
        }while(numero3 <1 || numero3>20);
                
        do {
            
           numero4 = leer.nextInt();
           
        }while(numero4 <1 || numero4>20);
                
        
        for (int i = numero1;i>0;i--){
            
            if (i == numero1){
                
                System.out.print(numero1+" " ); 
            }
          System.out.print("*"); 
        }
     System.out.println(" ");
        
         for (int i = numero2 ; i>0; i--){
            
            if (i == numero2){
                
                System.out.print(numero2 + " " ); 
            }
          System.out.print("*"); 
        }
        System.out.println(" ");
        
         for (int i = numero3 ; i>0; i--){
            
            if (i == numero3){
                
                System.out.print(numero3 + " " ); 
            }
          System.out.print("*"); 
        }  
        System.out.println(" ");
        
        for (int i = numero4 ; i>0; i--){
            
            if (i == numero4){
                
                System.out.print(numero4 + " " ); 
            }
          System.out.print("*"); 
        }
        System.out.println(" ");
    }
    
}
