/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Circunferencia {
    private double radio ;
    
    private double area ;
    private double perimetro ;
   
    Scanner leer = new Scanner(System.in);

    public Circunferencia() {
        
    }

    public Circunferencia(double radio) {
   
        this.radio = radio;
        
    }
    
    public void crearCircunferencia(){
        
       // Circunferencia C1 = new Circunferencia();
        
        System.out.println("Ingrese el radio:");
        
        this.radio = leer.nextInt();
        
       
    }
    
    public double area( double radio ){
        
        return Math.PI*Math.pow(radio,2) ;
        
        
    }
     public double perimetro(double radio){
        
        return 2*Math.PI*radio ;
        
        
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
    
}
