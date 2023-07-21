/*
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
 * una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
 * de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
 * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
      
        
        int [][] A = new int [4][4];
        int [][] AT = new int [4][4];
        int t = 0 ;
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
                
                System.out.print("Ingrese el valor de ["+i+","+j+"]:");
          
                A[i][j]= leer.nextInt();
            }   
        }
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
          
                System.out.print("["+A[i][j]+"] ");
            } 
            
           System.out.println(" ");
        }
        
        System.out.println("-------------------");
        
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
          
                AT[i][j]=  A[j][i];
            }   
        }
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
          
                System.out.print("["+AT[i][j]+"] ");
            } 
            
           System.out.println(" ");
        }
        
        System.out.println("-------------------");
        
      
        
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
          
                if(AT[i][j] == -(A[i][j])){
                    t = t + 1;
                }
            }   
        }
        
        if(t == 16){
            
            System.out.println("La matriz A es anti simétrica a AT");
            
        }else{
            System.out.println("La matriz A no es anti simétrica a AT");
        }
        
    }
    
}
