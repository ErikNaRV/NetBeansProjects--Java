/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
 * al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner (System.in);
      
      System.out.println("Ingrese el tamaño del vetor");
      
      int N = leer.nextInt();
      int num;
      int repetir = 0;
      int [] vector = new int [N]; 
      
      
      for(int i = 0 ; i <= N-1; i++){
          
        vector[i]= (int) (Math.random()*100+0);
             
      }
      for(int i = 0 ; i <= N-1; i++){
          
          System.out.println(vector[i]+" ");
             
      }
        System.out.println("Ingrese el numero a buscar");
        
        num = leer.nextInt();
        int i=0;
        
        do{
           for( i = 0 ; i <= N-1; i++){
          
                if(vector[i] == num){
                 
                    System.out.println("El numero "+num+" se encuentra en el espacion de vector [ "+i+"]");
                    
                    repetir = repetir + 1;
                    
                } 
            }   
           
        }while(i<N);
      
        if (repetir > 1 ){
            
            System.out.println("Se a repetido "+repetir+" veces");
            
        }
    
        
        
    }
    
}
