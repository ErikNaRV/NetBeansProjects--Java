/*
 El programa pedirá un país en un bucle, se guardará el país en el
    conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    los servicios en la clase correspondiente)
 */
package servicioPais;



import Paises.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class serviciosPais {

    Scanner leer = new Scanner(System.in);
    Pais pais1 = new Pais();

    public void crearPais() {
        String op;
        

        do {

            
            System.out.println("********************");
            System.out.println("*Ingrese el pais*");
            System.out.println("********************");
            System.out.println(" ");

            pais1.setPaises(leer.nextLine());

            System.out.println("******************************************");
            System.out.println("*Desea ingresar un nuevo pais (Si/No)*");
            System.out.println("******************************************");
            System.out.println(" ");
            op = leer.nextLine();
            do {
                if (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no")) {
                    System.out.println("La opcion no es valida ingresela de nuevo");
                    op = leer.nextLine();
                }
            } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));

        } while (op.equalsIgnoreCase("si"));

        mostrarPais();
    }

    public void mostrarPais() {

        System.out.println("////La Biblioteca de paises////");
        
        for (String p : pais1.getPaises()) {
            System.out.println(p.toString());
        }
        

       
//    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//    cómo se ordena un conjunto.
        System.out.println("////Paises ordenados alfabeticamente////");
        ArrayList<String>Paisess = new ArrayList(pais1.getPaises());
        Collections.sort(Paisess);
        for (String p : Paisess) {
            System.out.println(p.toString());
        }
        
        
        
//    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//    al usuario.

        System.out.println("///////Ingrese un pais a eliminar///////");
        
        String pEliminar = leer.nextLine();
        
        Iterator i = pais1.getPaises().iterator();
        
        while (i.hasNext()) {
            
           if(i.next().equals(pEliminar)){
               i.remove();
           }
        }
        
        System.out.println("////////Lista de paises NUEVA///////");
        for (String pa2 : pais1.getPaises()) {

            System.out.println("Pais :" + pa2.toString());
        }

//      while (it2.hasNext()) {
//            String next = it2.next();
//            if (next.equalsIgnoreCase(pEliminar)) {
//                it2.remove();
//                System.out.println("País eliminado exitosamente.");
//                encontrado = true;
//                break;
//            }
//        }

    }
    

    
   
    

}
