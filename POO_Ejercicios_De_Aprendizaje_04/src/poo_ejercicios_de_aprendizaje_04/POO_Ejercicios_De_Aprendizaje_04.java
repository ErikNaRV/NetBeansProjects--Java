/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package poo_ejercicios_de_aprendizaje_04;

import Rectangulos.Rectángulo;

/**
 *
 * @author erik_
 */
public class POO_Ejercicios_De_Aprendizaje_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectángulo Rectangulo1 = new Rectángulo(); 
        
        Rectangulo1.crearRectangulo();
        
        System.out.println("La superficie es :"+Rectangulo1.calcularSuperficie());
        System.out.println("El perimetro es : "+Rectangulo1.calcularPerimetro());
        
        Rectangulo1.dibujar();
        
    }
    
}
