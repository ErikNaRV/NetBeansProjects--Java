/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
 * usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejercicios_extra;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("Ingrese un tiempo en minutos");
        int min = leer.nextInt();
        int dia = 0;
        int hora = 0;
        int min1 = 0;
        int h = min;
        
        
        while(min >= 1440){
            dia++;
            min = min - 1440;
        }
        while(min >= 60){
            hora++;
            min = min - 60;
        }
        
        System.out.println("Se a calculado un total de "+dia+" dias y "+hora+" horas");
        
        
        
    }
    
}
