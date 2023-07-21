/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author erik_
 */
public class Array {
    
    private int numeros [] = new int[8];

    public Array() {
    }
    
    

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public void llernarVector() throws ArrayIndexOutOfBoundsException{
        
        for (int i = 0; i < 9; i++) {
            numeros[i] = (int) (Math.random()*10);
        }
        
        
     
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Array{");
        sb.append("numeros=").append(numeros);
        sb.append('}');
        return sb.toString();
    }
    
}
