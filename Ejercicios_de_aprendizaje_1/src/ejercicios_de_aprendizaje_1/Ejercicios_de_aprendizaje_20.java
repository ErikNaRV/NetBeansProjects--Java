/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
 * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
 * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir,
 * están entre el 1 y el 9.
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
       
        int [][] A = new int [3][3];
        int [] v = new int [8];
        int suma = 0;
        int t = 0 ;
        int magica = 0;
        for(int i = 0 ; i <= 2 ; i++){
            for(int j = 0 ; j <= 2 ; j++){
                
                System.out.print("Ingrese el valor de ["+i+","+j+"]:");
          
                A[i][j]= leer.nextInt();
                
                while(A[i][j]<1 || A[i][j]>9 ){
                    System.out.println("El valor ingresado no esta entre 1-9");
                   System.out.print("Ingrese el valor de ["+i+","+j+"]:");
          
                    A[i][j]= leer.nextInt();
                }
            }   
        }
        for(int i = 0 ; i <= 2 ; i++){
            for(int j = 0 ; j <= 2 ; j++){
          
                System.out.print("["+A[i][j]+"] ");
            } 
            
           System.out.println(" ");
        }
       
        for(int i = 0 ; i <= 2 ; i++){
            
            for(int j = 0 ; j <= 2 ; j++){
                
                suma = suma+A[i][j]; 
            }  
            v[t]=suma;
            t =t+1;
            suma = 0;
        }
       
       for(int i = 0 ; i <= 2 ; i++){
            
            System.out.println("La suma de la fila N "+i+" es de "+ v[i]); 
        }
        System.out.println("///------------------------------------////");
        
       for(int i = 0 ; i <= 2 ; i++){
            
            for(int j = 0 ; j <= 2 ; j++){
                
                suma = suma+A[j][i]; 
            }  
            v[t]=suma;
            t = t + 1;
            suma = 0;
        }
       
       for(int i = 0 ; i <= 2 ; i++){
           
            System.out.println("La suma de la columna N "+i+" es de "+ v[t-3]);
            t = t +1;
        }
       
       for(int i = 0 ; i <= 2 ; i++){
           
           suma = suma + A[i][i];
          
        }
       v[6]= suma;
      
       System.out.println("///------------------------------------////");
       
        System.out.println("La suma de la primera diagonal es de "+suma);
        suma = 0;
        int j = 2;
        for(int i = 0 ; i <= 2 ; i++){
           
          suma = suma+A[i][j];
          j = j -1;
          
        }
        v[7]= suma;
       System.out.println("///------------------------------------////");
       
        System.out.println("La suma de la segunda diagonal es de "+suma);
       
      for(int i = 0 ; i <= 7 ; i++){
           
          if(v[i] == v[0]){
               magica = magica + 1;
          }
          
        }
     
       if(magica == 8 ){
           System.out.println("La matriz es magica");
       }else{
           System.out.println("La matriz no es magica");
       }
         
        
    }
    
}
