/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Edwar Velasquez
 */
public class ServicioCafeteria {

    Scanner leer = new Scanner(System.in);

    //Creamos el objeto queda GLOBAL
    Cafetera cafetera1 = new Cafetera();

    //Metodo llenar cafetera
    public void llenarCafetera() {
        cafetera1.setCantidadActual(cafetera1.getCapacidadMaxima());   
        System.out.println(cafetera1.getCantidadActual());
    }

    public void servirTaza(int tamano) {
        System.out.println("Ingrese el tamaño de la taza");
        tamano = leer.nextInt();       

        //
        if (tamano < cafetera1.getCantidadActual()) {
            cafetera1.setCantidadActual(cafetera1.getCantidadActual() - tamano);
            System.out.println(cafetera1.getCantidadActual());
        } else {
            System.out.println("No alcanza para llenar la taza");
            cafetera1.setCantidadActual(0);
        }
    }
     //Vaciar cafetera    
    public void vaciarCafetera(){
        System.out.println("Se ha vaciado la cafetera");
        cafetera1.setCantidadActual(0);
        System.out.println(cafetera1.getCantidadActual());
    }
    
    //Metodo Agregar café
    public void agregarCafe(int cantCafe){        
        System.out.println("Ingrese la cantidad de café que desea ingresar");
        cafetera1.setCantidadActual(cafetera1.getCantidadActual() + leer.nextDouble());
        System.out.println(cafetera1.getCantidadActual());
    }            
}
