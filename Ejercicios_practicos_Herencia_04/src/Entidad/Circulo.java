/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author erik_
 */
public class Circulo implements calculosFormas {
    
    protected double diametro;
    protected double radio;

    public Circulo() {
    }

    public Circulo(double diametro, double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        
      return calculosFormas.PI * Math.pow(radio, 2);
        


    }

    @Override
    public double calcularPerimetro() {
        
        return calculosFormas.PI * diametro;

    }
    
    
    
}
