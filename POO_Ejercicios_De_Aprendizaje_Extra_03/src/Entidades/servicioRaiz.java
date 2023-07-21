/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class servicioRaiz {

    Raices R1 = new Raices();
    Scanner leer = new Scanner(System.in);

    public void crearRaiz() {

        System.out.println(" Ingrese el coeficiente A");
        R1.setA(leer.nextDouble());
        System.out.println(" Ingrese el coeficiente B");
        R1.setB(leer.nextDouble());
        System.out.println(" Ingrese el coeficiente C");
        R1.setC(leer.nextDouble());
    }

    public double getDiscriminante() {
        System.out.println("El discriminante es :");

        double D = (Math.pow(R1.getB(), 2)) - (4 * R1.getA()) * (R1.getC());
        System.out.println(D);

        return (double) D;

    }

    public boolean tieneRaices(double D) {

        if (D > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean tieneRaiz(double D) {

        if (D == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void obtenerRaices(double D) {

        if (tieneRaices(D)) {
            System.out.print("Raiz 1 : ");
            System.out.println((-R1.getB() + Math.sqrt(D)) / (2 * R1.getA()));
            System.out.print("Raiz 2 : ");
            System.out.println((-R1.getB() - Math.sqrt(D)) / (2 * R1.getA()));
        } else {
            System.out.println("No hay raices");
        }
    }

    public void obtenerRaiz(double D) {

        if (tieneRaiz(D)) {
            System.out.print("La Raiz es : ");
            System.out.println(-R1.getB() / (2 * R1.getA()));
        }

    }

    public void calcular(double D) {

        if (D == 0) {

            obtenerRaiz(D);
        } else if (D > 0) {

            obtenerRaices(D);

        } else {

            System.out.println("No existen raices");

        }

    }

}
