/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        int [] vector = new int [20];
        int D1 = 0;
        int D2 = 0;
        int D3 = 0;
        int D4 = 0;
        int D5 = 0;
        int t=0;
        for(int i = 0 ; i <= 19 ; i++){
          
            vector[i]= (int) (Math.random()*99999+0);
             
        }
        for(int i = 0 ; i <= 19 ; i++){
          
          System.out.println("["+vector[i]+"] ");
             
        }
        
       
        
        
        
        do{
            
            for( int i = 0 ; i <= 19 ; i++){
                
                if( vector[i] > 0 && vector[i] < 9 ){
                    
                    D1 = D1 + 1;
                    
                }else if(vector[i] >= 100  && vector[i] <= 999){
                    
                    D3 = D3 + 1;
                }else if(vector[i] >= 1000  && vector[i] <= 9999){
                    
                    D4 = D4 + 1;
                }else if(vector[i] >= 10000  && vector[i] <= 99999){
                    
                    D5 = D5 + 1;
                }
                
                
                t=t + 1;
            }
            
        }while(t < 19 );
        
        
        System.out.println("La cantidad de numeros de 1 digito son de "+D1);
        System.out.println("La cantidad de numeros de 2 digitos son de "+D2);
        System.out.println("La cantidad de numeros de 3 digitos son de "+D3);
        System.out.println("La cantidad de numeros de 4 digitos son de "+D4);
        System.out.println("La cantidad de numeros de 5 digitos son de "+D5);
        
    }
    
}
