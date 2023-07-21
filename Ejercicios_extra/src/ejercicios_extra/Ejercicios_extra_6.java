/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
 * por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejercicios_extra;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Ejercicios_extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner leer = new Scanner (System.in);
        
        int m1 = 0;
        int m2 = 0;
        int promedio;
        int i ;
        System.out.println("Ingrese de cuantas personas se desea tomar la estatura");
        
        int N = leer.nextInt();
        
        
      
        
       
       
        for( i = N;i >= 0;i--){
           
            System.out.println("Ingrese la estatura de la persona "+i);
            double persona = leer.nextDouble();
            
            if(persona < 1.60){
                m1++;
            }else{
                m2++;
            }
            
        }
         
        promedio = m1*10;
        System.out.println("El promedio de personas con una estatura por debajo de 1.60 es de "+promedio+" %");
    }
    
}
