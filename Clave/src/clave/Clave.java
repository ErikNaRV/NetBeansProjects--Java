/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave;

import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Clave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int clave;
        String codigo = "";
        String codigo1 = "";
        int j = 0;

        for (int i = 0; i < 5; i++) {

            clave = (int) (Math.random() * 10);
            do {
                if (codigo.contains(String.valueOf(clave))) {
                    clave = clave + 1;

                }

            } while (codigo.contains(String.valueOf(clave)));

            codigo = codigo.concat(String.valueOf(clave));

        }
        System.out.println(codigo);
        for (int i = 0; i < 5; i++) {

            clave = (int) (Math.random() * 10);

            if (codigo1.contains(String.valueOf(clave))) {
                
                j++;
                
            }
            
            if(j==0&&i==4){
                  i=5; 
            }

            codigo1 = codigo1.concat(String.valueOf(clave));
            

        }
        
        System.out.println(codigo1);
        if (j == 0) {
           
            codigo1 = codigo1.concat(String.valueOf(codigo1.substring(0, 1)));        
        }
        System.out.println(codigo1);
    }
}
