/*
 *  Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de cuadro");
        int tamaño = leer.nextInt();
        
    
        String [][] cuadro = new String [tamaño][tamaño];
        
        for(int i = 0 ;i < tamaño;i++){
            
            for(int j =0 ;j < tamaño;j++){
                
                if(i == 0 || j == tamaño-1 ||i == tamaño-1 || j == 0 ){
                    
                    cuadro[i][j]= "*";   
                }else{
                    cuadro[i][j]= " "; 
                }
            
            }
        }
        for(int i = 0 ;i < tamaño;i++){
            
            for(int j =0 ;j < tamaño;j++){
                
                System.out.print(cuadro[i][j]+" ");
            
            }
            System.out.println(" "); 
        }
        
    }
    
}
