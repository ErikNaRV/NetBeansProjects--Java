/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author erik_
 */
public class carta {
    
    private int numero;
    private String PaloCarta;

    public carta() {
    }

    public carta(int numero, String PaloCarta) {
        this.numero = numero;
        this.PaloCarta = PaloCarta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPaloCarta() {
        return PaloCarta;
    }

    public void setPaloCarta(String PaloCarta) {
        this.PaloCarta = PaloCarta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCarta");
        sb.append("\nNumero =").append(numero);
        sb.append("\nPaloCarta =").append(PaloCarta);
       
        return sb.toString();
    }

    

   
    
    
    
    
    
    
    
}
