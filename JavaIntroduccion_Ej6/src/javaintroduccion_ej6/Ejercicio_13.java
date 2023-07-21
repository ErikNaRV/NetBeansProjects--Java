/*
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
 *define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaintroduccion_ej6;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese la cantidad de compañeros de equipo");
        int o = leer.nextInt()+1;
        int i=0;
        String[] Equipo;
        Equipo = new String[o];
        System.out.println("Ingrese los nombres de los compañeros de equipo");
    
        do{
          
          Equipo[i]=leer.nextLine();
          i++;
        }while(o>i);
    }
    
    
}
