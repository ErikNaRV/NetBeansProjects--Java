/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int [][] M1 = new int [4][4];
        int [][] M2 = new int [4][4];
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
          
                M1[i][j]= (int) (Math.random()*100+0);
            }   
        }
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
          
                System.out.print("["+M1[i][j]+"] ");
            } 
            
           System.out.println(" ");
        }
        
        System.out.println("----------------------------");
        
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
          
                M2[i][j]=  M1[j][i];
            }   
        }
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
          
                System.out.print("["+M2[i][j]+"] ");
            } 
            
           System.out.println(" ");
        }
        
    }
    
}
