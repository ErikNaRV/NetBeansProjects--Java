/*
4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicios_practicos_herencia_04;

import Entidad.Circulo;
import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Ejercicios_practicos_Herencia_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Circulo Circulo1 = new Circulo();

        Rectangulo Rectangulo1 = new Rectangulo();

        System.out.println("**************Circulo************");
        System.out.print("*Ingrese el diametro del circulo:");
        Circulo1.setDiametro(leer.nextDouble());
        System.out.print("*Ingrese el radio del circulo:");
        Circulo1.setRadio(leer.nextDouble());
        
        System.out.print("*El Area del circulo es : ");
        System.out.println(Circulo1.calcularArea());

        System.out.print("*El Perimetro del circulo es : ");
        System.out.println(Circulo1.calcularPerimetro());
        
        System.out.println("**************Rectangulo**************");
        System.out.print("*Ingrese la base del rectangulo:");
        Rectangulo1.setBase(leer.nextDouble());
        System.out.print("*Ingrese la altura del rectangulo:");
        Rectangulo1.setAltura(leer.nextDouble());
        
        System.out.print("*El Area del rectangulo es : ");
        System.out.println(Rectangulo1.calcularArea());

        System.out.print("*El Perimetro del rectangulo es : ");
        System.out.println(Rectangulo1.calcularPerimetro());

    }

}
