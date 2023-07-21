/*
2.-Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package excepciones_ejercicio_02;

import Entidad.Array;

/**
 *
 * @author erik_
 */
public class Excepciones_Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array lista = new Array();
        
        
        try {
          lista.llernarVector();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice de arreglo fuera de rango");
            
        }
    }
    
}
