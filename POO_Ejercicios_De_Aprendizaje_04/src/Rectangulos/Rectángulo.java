/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulos;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Rectángulo {
    private double base;
    private double altura;

    Scanner leer = new Scanner (System.in);
    public Rectángulo() {
    }

    public Rectángulo(double base, double altura) {
       
        this.base = base;
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        
      //Rectángulo R1 = new Rectángulo();
      System.out.println("Ingrese la base del Rectángulo");
      base = leer.nextDouble();
      System.out.println("Ingrese la altura del Rectángulo");
      altura = leer.nextDouble(); 
    }
    
    public double calcularSuperficie(){
       
        return base*altura;
    }
    public double calcularPerimetro(){
       
        return (base+altura)*2;
    }
    
    public void dibujar(){
        
        for (int i = 0; i < (int)altura; i++) {
            
            for (int j = 0; j < (int)base; j++) {
                if(i==0 || j==0 || i==(int)altura-1|| j==(int)base-1){
                    
                    System.out.print(" *");  
                }else{
                    System.out.print("  ");
                }
                    
            }
            System.out.println("");
        }
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}

