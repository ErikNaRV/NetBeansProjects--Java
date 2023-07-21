/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroduccion_ej6;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicio_9_nuevaforma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, contador, suma;
        contador=1;
        suma=0;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese el número de la posición "+contador);
        numero=leer.nextInt();
        if (numero==0){
            System.out.println("Se ha capturado el cero");
            break;
        }
        else {
            if (numero>0){
                suma=suma+numero;
                contador=contador+1;
            }
        }
    } while (contador<=20);
    
        System.out.println("La suma total de los números ingresados es "+suma);
}
}
