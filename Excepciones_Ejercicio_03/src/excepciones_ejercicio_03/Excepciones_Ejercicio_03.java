/*
3.-Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package excepciones_ejercicio_03;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Excepciones_Ejercicio_03 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        DivisionNumero Dn = new DivisionNumero();
        
        System.out.println("Ingrese un numero entero");
        
        String numero = leer.next();
        
        try {
            
            Dn.comprobarDato(numero);
            
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println("Ingrese el num 1");
            String num1 = leer.next();
            System.out.println("Ingrese el num 2");
            String num2 = leer.next();
            Dn.comprobarLetras(num1, num2);
            Dn.division();
            
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
//        try {
//            Dn.division();
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
        
        
//        try {
//            Dn.division();
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
        
    }
    
}
