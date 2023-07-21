/*
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
    promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
    números serán introducidos por el usuario. Realice dos versiones del programa, una
    usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejercicios_extra;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Ejercicios_extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int cantidad,promedio;
        int num,i=0;
        int mayor=0;
        int menor=0;
        System.out.println("Ingrese la cantidad de numeros a comparar");
        cantidad = leer.nextInt();
        
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if(num>mayor){
               mayor = num; 
            }else{
                menor = num;
            }
            i++;
            
        }while(i<=cantidad);
    
        System.out.println("El  valor maximon  es "+mayor);
        System.out.println("El  valor minimo es "+menor);
        promedio = (mayor + menor)/2;
        System.out.println("El valor promedio es "+promedio);
        
        
        
        
    }
    
}
