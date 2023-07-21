package ejercicio6;

import Entidades.Cafetera;
import Service.ServicioCafeteria;

/**
 *
 * @author Edwar Velasquez
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioCafeteria s1 = new ServicioCafeteria();

       // Cafetera cafetera1 = new Cafetera();
        
        
        //System.out.println(s1.llenarCafetera());
        s1.llenarCafetera();
        //System.out.println(cafetera1.getCantidadActual());
        s1.servirTaza(0);
        //System.out.println(cafetera1.getCantidadActual());
        s1.vaciarCafetera();
        //System.out.println(cafetera1.getCantidadActual());
        s1.agregarCafe(0);
        //System.out.println(cafetera1.getCantidadActual());
    }

    

}
