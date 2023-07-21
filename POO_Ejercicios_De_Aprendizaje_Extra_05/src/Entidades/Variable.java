/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author erik_
 */
public class Variable {
    
    private String[] meses = new String[12];
    
    private String mesSecreto;

    public Variable() {
        
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        
        mesSecreto = meses[5];
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public boolean mesSecreto(String mesUsuario){
        
        if(mesUsuario.equalsIgnoreCase(mesSecreto)){
            System.out.println("----------------------------");
            System.out.println("El mes ingresado es correcto"); 
            System.out.println("----------------------------");
            return true;
        }else{
            System.out.println("----------------------------");
            System.out.println("El mes ingresado es incorrecto"); 
            System.out.println("Vuelve a intentar");
            System.out.println("----------------------------");
            return false;
        }
        
        
        
        
    }
    
    
}
