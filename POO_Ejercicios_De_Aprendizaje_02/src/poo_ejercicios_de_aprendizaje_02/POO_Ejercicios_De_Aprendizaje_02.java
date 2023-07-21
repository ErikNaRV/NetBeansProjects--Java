/*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package poo_ejercicios_de_aprendizaje_02;
import Circunferencia.Circunferencia;

/**
 *
 * @author erik_
 */
public class POO_Ejercicios_De_Aprendizaje_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
 
        Circunferencia Circulo = new Circunferencia();
        
        Circulo.crearCircunferencia();
        Circulo.setArea(Circulo.area(Circulo.getRadio()));
        System.out.println(String.format("%.2f", Circulo.getArea()));
        Circulo.setPerimetro(Circulo.perimetro(Circulo.getRadio()));
        System.out.println(String.format("%.2f", Circulo.getPerimetro()));
        
    }
    
    
}
