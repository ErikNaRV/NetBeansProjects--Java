/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio3;

import numeros.Operacion;

/**
 *
 * @author LENOVO
 */
public class POOejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion oper = new Operacion();
        oper.crearOperacion();
        System.out.println("La suma es: "+oper.sumar());
        System.out.println("La resta es: "+oper.restar());
        System.out.println("La multiplicación es: "+oper.multiplicar());
        System.out.println("La división es: "+String.format("%.2f",oper.dividir()));                
        
        
        
    }
    
}
