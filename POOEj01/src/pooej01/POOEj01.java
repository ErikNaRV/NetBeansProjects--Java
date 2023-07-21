/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;
import Entidad.Persona;

/**
 *
 * @author erik_
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Persona primeraPersona = new Persona("Erik","Narvaez", 1751071604);
       
       
        System.out.println(primeraPersona.Nombre+" "+primeraPersona.Apellido+" "+primeraPersona.Cedula);
    }
    
}
