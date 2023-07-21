/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class servicioNIF {
    
    NIF n1 = new NIF();
    Scanner leer = new Scanner(System.in);
    
// Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    
    public String crearNif(){
        
        n1.getLetra()[0] = "T";
        n1.getLetra()[1] = "R";
        n1.getLetra()[2] = "W";
        n1.getLetra()[3] = "A";
        n1.getLetra()[4] = "G";
        n1.getLetra()[5] = "M";
        n1.getLetra()[6] = "Y";
        n1.getLetra()[7] = "F";
        n1.getLetra()[8] = "P";
        n1.getLetra()[9] = "D";
        n1.getLetra()[10] = "X";
        n1.getLetra()[11] = "B";
        n1.getLetra()[12] = "N";
        n1.getLetra()[13] = "J";
        n1.getLetra()[14] = "Z";
        n1.getLetra()[15] = "S";
        n1.getLetra()[16] = "Q";
        n1.getLetra()[17] = "V";
        n1.getLetra()[18] = "H";
        n1.getLetra()[19] = "L";
        n1.getLetra()[20] = "C";
        n1.getLetra()[21] = "K";
        n1.getLetra()[22] = "E";
        
       
        System.out.println("Ingrese su DNI : ");
        n1.setDNI(leer.nextLong());
        
        double calculoLetra = n1.getDNI()%23;
        
        String letra = n1.getLetra()[(int)calculoLetra];
        
        return letra ;
 
    }
    
// Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).
    
    public void  mostrar(String letra){
        
        System.out.println("El NIF es : "+n1.getDNI() + "-"+letra);
        
        
    }
    
    
}
