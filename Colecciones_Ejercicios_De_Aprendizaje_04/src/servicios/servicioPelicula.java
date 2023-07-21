/*
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
 */
package servicios;

import clases.Pelicula;
import comparado.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class servicioPelicula {

    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> biblioteca = new ArrayList<>();

//    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//    crear otra Pelicula o no.
    public void crearPelicula() {
        String op;

        do {

            Pelicula pelicula = new Pelicula();
            System.out.println("**********************************");
            System.out.println("*Ingrese el titulo de la pelicula*");
            System.out.println("**********************************");
            System.out.println(" ");
            pelicula.setTitulo(leer.nextLine());
            System.out.println("**********************************");
            System.out.println("*Ingrese el director de la pelicula*");
            System.out.println("**********************************");
            System.out.println(" ");
            pelicula.setDirector(leer.nextLine());
            System.out.println("*********************************************");
            System.out.println("*Ingrese la duracion de la pelicula en horas*");
            System.out.println("*********************************************");
            System.out.println(" ");
            pelicula.setDuracion(leer.nextInt());
            leer.nextLine();
            biblioteca.add(pelicula);
            System.out.println("******************************************");
            System.out.println("*Desea ingresar una nueva pelicual(Si/No)*");
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

        mostrarPeliculas();

    }

//    Después de ese bucle realizaremos las siguientes acciones:
//    • Mostrar en pantalla todas las películas.
//    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//    pantalla.
//    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//    pantalla.
//    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void mostrarPeliculas() {

        System.out.println("////La Biblioteca de peliculas es////");

        for (Pelicula pelicula : biblioteca) {
            String titulo = pelicula.getTitulo();
            String director = pelicula.getDirector();
            Integer horas = pelicula.getDuracion();
            System.out.println("*************************");
            System.out.println(" Titulo : " + titulo);
            System.out.println(" Director : " + director);
            System.out.println(" Duracion : " + horas);
            System.out.println("*************************");

        }
        //  • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

        System.out.println("////Las películas con una duración mayor a 1 hora////");

        for (Pelicula pelicula : biblioteca) {
            if (pelicula.getDuracion() > 1) {
                String titulo = pelicula.getTitulo();
                String director = pelicula.getDirector();
                Integer horas = pelicula.getDuracion();
                System.out.println("*************************");
                System.out.println(" Titulo : " + titulo);
                System.out.println(" Director : " + director);
                System.out.println(" Duracion : " + horas);
                System.out.println("*************************");
            }

        }

        //    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
        //    pantalla.
        System.out.println("////Las películas de acuerdo a su duración (de mayor a menor)////");
        Collections.sort(biblioteca, Comparador.compararDuracionMayorAMenor);
        for (Pelicula pelicula : biblioteca) {
            String titulo = pelicula.getTitulo();
            String director = pelicula.getDirector();
            Integer horas = pelicula.getDuracion();
            System.out.println("*************************");
            System.out.println(" Titulo : " + titulo);
            System.out.println(" Director : " + director);
            System.out.println(" Duracion : " + horas);
            System.out.println("*************************");

        }

        // • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
        // pantalla.
        System.out.println("////Las películas de acuerdo a su duración (de menor a mayor)////");
        Collections.sort(biblioteca, Comparador.compararDuracionMenorAMayor);
        for (Pelicula pelicula : biblioteca) {
            String titulo = pelicula.getTitulo();
            String director = pelicula.getDirector();
            Integer horas = pelicula.getDuracion();
            System.out.println("*************************");
            System.out.println(" Titulo : " + titulo);
            System.out.println(" Director : " + director);
            System.out.println(" Duracion : " + horas);
            System.out.println("*************************");

        }

        //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
        System.out.println("////Las películas por título, alfabéticamente////");
        Collections.sort(biblioteca, Comparador.compararPorTitulo);
        for (Pelicula pelicula : biblioteca) {
            String titulo = pelicula.getTitulo();
            String director = pelicula.getDirector();
            Integer horas = pelicula.getDuracion();
            System.out.println("*************************");
            System.out.println(" Titulo : " + titulo);
            System.out.println(" Director : " + director);
            System.out.println(" Duracion : " + horas);
            System.out.println("*************************");

        }

        // • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
        System.out.println("////Las películas por director, alfabéticamente////");
        Collections.sort(biblioteca, Comparador.compararPorDirector);
        for (Pelicula pelicula : biblioteca) {
            String titulo = pelicula.getTitulo();
            String director = pelicula.getDirector();
            Integer horas = pelicula.getDuracion();
            System.out.println("*************************");
            System.out.println(" Titulo : " + titulo);
            System.out.println(" Director : " + director);
            System.out.println(" Duracion : " + horas);
            System.out.println("*************************");

        }

    }

}
