/*
 *  Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
    para los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
 */
package ejercicios_extra;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int monto ;
        System.out.println("Ingrese la categoria del socio");
        String tipo = leer.next();
        
        switch(tipo.toUpperCase()){
            
            case "A":
                System.out.println("Ingrese un monto a pagar el tratamiento de 1000 dolares");
                monto = leer.nextInt();
                while(monto < 1000){
                    
                  System.out.println("El monto es menor al permitido en esta categoria");   
                  monto =leer.nextInt();
                }
                 int descuento = (int) (monto * 0.50);
                 int total = monto - descuento; 
                 System.out.println("Se a acreditado con exito " +total+" dolares con un descuento de 50% correspondiente a "+descuento+" dolares");
                
                        
               break;
            case "B":
                System.out.println("Ingrese un monto a pagar el tratamiento de 500 dolares");
                monto = leer.nextInt();
                while(monto < 500){
                    
                  System.out.println("El monto es menor al permitido en esta categoria");   
                  monto =leer.nextInt();
                }
                  descuento = (int) (monto * 0.35);
                  total = monto - descuento; 
                 System.out.println("Se a acreditado con exito " +total+" dolares con un descuento de 35% correspondiente a "+descuento+" dolares");
               break;
            case "C":
                System.out.println("Ingrese un monto a pagar el tratamiento de 200 dolares");
                monto = leer.nextInt();
                System.out.println("Se a acreditado 200 dolares ");
               break;
            
        }
    }
    
}
