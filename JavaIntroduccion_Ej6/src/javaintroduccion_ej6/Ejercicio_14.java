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
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese la cantidad de compañeros de equipo");
        int o = leer.nextInt()+1;
       
        String[] Equipo;
        Equipo = new String[o];
        System.out.println("Ingrese los nombres de los compañeros de equipo");
    
        
        
        
        for(int i=0;i==o;i++ ){
            
            Equipo[i]=leer.nextLine();
            
            
        }
        
    }
    
}
