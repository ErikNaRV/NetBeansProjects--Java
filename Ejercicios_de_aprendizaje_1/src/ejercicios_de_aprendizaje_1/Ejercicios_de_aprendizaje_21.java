/*
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
 * 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
 * dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
 * que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
 * menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
 * columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
         int [][] M = new int [10][10];
         int [][] P = new int [3][3];
         int [][] v = new int [9][2];
         int e = 1 ;
         int f = 0, c=0;
         int F = 0, C=0;
         boolean b= true;
        for(int i = 0 ; i <= 9 ; i++){
            for(int j = 0 ; j <= 9 ; j++){
          
                M[i][j]= (int) (Math.random()*101+0);
            }   
        }
        for(int i = 0 ; i <= 9 ; i++){
            for(int j = 0 ; j <= 9 ; j++){
          
                if(M[i][j] >= 10){
                    
                    System.out.print("["+M[i][j]+"] "); 
                    
                }else if(M[i][j] >= 100){
                    System.out.print("["+M[i][j]+"]"); 
                }else{
                    System.out.print("["+M[i][j]+"]  "); 
                }
            } 
            
           System.out.println(" ");
        }
        System.out.println("Ingrese los valores de la matriz a buscar");
        
        for(int i = 0 ; i <= 2 ; i++){
            for(int j = 0 ; j <= 2 ; j++){
                
                System.out.print("Ingrese el valor de ["+i+","+j+"]:");
          
                P[i][j]= leer.nextInt();
            }   
        }
        
        for(int i = 0 ; i <= 2; i++){
            for(int j = 0 ; j <= 2 ; j++){
          
                if(P[i][j] >= 10){
                    
                    System.out.print("["+P[i][j]+"] "); 
                    
                }else if(P[i][j] >= 100){
                    System.out.print("["+P[i][j]+"]"); 
                }else{
                    System.out.print("["+P[i][j]+"]  "); 
                }
            } 
            
           System.out.println(" ");
           
        }
        
        for(int i = 0 ; i <= 9 ; i++){
            for(int j = 0 ; j <= 9 ; j++){
          
               if(M[i][j]== P[0][0] ){
                   F = i;
                   C= j;
                    for(int u = i ; u <= i+2 ; u++){
                       
                        for(int o = j ; o <= j+2 ; o++){
                            
                            if(M[u][o] == P[f][c]){
                                
                             c++;   
                            }else{
                                b = false;
                                break;
                            }    
                        }  
                        if(b==false){

                         break;   
                        }else{
                            
                          f++;
                        }
                    }
                }
                if(b==true){
  
                }else{

                  i = 10;
                  j = 10;
                }
               
               
            }   
        }
        System.out.println("Las posiciones de la matriz se encontraron en");
        for(int i=0;i<=F+3;i++){
            for(int j=0;j<=C+3;j++){
                
                System.out.println("("+i+","+j+")");
                
           
            }
        }
        
        
       
    }
    
}
