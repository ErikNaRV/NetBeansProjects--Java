/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroduccion_ej6;

/**
 *
 * @author erik_
 */
public class Clases_de_utilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String sCadena = "Esto es una cadena de texto";
        char[] aCaracteres = sCadena.toCharArray();

        for (int x=0;x<aCaracteres.length;x++)
          System.out.println("[" + x + "] " + aCaracteres[x]);
        }
    
}
