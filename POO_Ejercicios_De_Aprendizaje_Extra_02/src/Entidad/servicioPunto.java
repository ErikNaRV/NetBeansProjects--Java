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
public class servicioPunto {
    
    Punto P1 = new Punto();
    Scanner leer = new Scanner(System.in);
    
    public void crearPuntos(){
        
        System.out.println("Ingrese la coordenada X1-Y1");
        P1.setX1(leer.nextDouble());
        P1.setY1(leer.nextDouble());
        System.out.println("Ingrese la coordenada X2-Y2");
        P1.setX2(leer.nextDouble());
        P1.setY2(leer.nextDouble());
            
    }
    
    public void calcularDistancia(){
        
        double d = (double) Math.sqrt(Math.pow(P1.getX2()-P1.getX1(), 2)+Math.pow(P1.getY2()-P1.getY1(), 2));
        System.out.println("La distancia entre los puntos P1 Y P2 es de :");
        System.out.println(String.format("%.2f", d));
    }
    
    
}
