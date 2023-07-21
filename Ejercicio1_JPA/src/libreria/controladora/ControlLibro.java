/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.controladora;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.AutorJpaController1;
import libreria.persistencia.LibroJpaController;
import libreria.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Vane Proaño
 */
public class ControlLibro {

    LibroJpaController librojpa = new LibroJpaController(); // crear las tablas
    AutorJpaController1 autorjpa = new AutorJpaController1();
    ControlAutor ca = new ControlAutor();
    ControlEditorial ce = new ControlEditorial();
    Scanner leer = new Scanner(System.in);

public Libro crearLibro() {
    Libro libro = new Libro();
    boolean librocreado = false;
    
    do {
        try {
            System.out.println("Ingrese el nombre del libro: ");
            String titulo = leer.nextLine().trim();

            System.out.println("Ingrese el año del libro: ");
            int anio = leer.nextInt();
            leer.nextLine(); // Consumimos la nueva línea después del nextInt()

            System.out.println("Ingrese el nombre del autor: ");
            Autor autor = ca.crearAutor();

            System.out.println("Ingrese el nombre de la editorial: ");
            Editorial editorial = ce.crearEditorial();

            if (titulo.isEmpty() || anio == 0 || autor == null || editorial == null) {
                System.out.println("Alguno de los campos está vacío, ingrese nuevamente");
            } else {
                libro.setTitulo(titulo);
                libro.setAnio(anio);
                libro.setAutor(autor);
                libro.setEditorial(editorial);

                librojpa.create(libro);
                librocreado = true;
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error. Inténtalo nuevamente.");
            leer.nextLine(); // Limpiamos el búfer después de la excepción para evitar un ciclo infinito.
        }
    } while (!librocreado || libro.getAutor() == null || libro.getEditorial() == null);

    return libro;
}

//public void crearLibro() {
//    Libro libro = new Libro();
//    boolean librocreado = false;
//    do {
//        try {
//            System.out.println("Ingrese el nombre del libro: ");
//            libro.setTitulo(leer.nextLine());
//            System.out.println("Ingrese el año del libro: ");
//            libro.setAnio(leer.nextInt());
//            System.out.println("Ingrese el nombre del autor: ");
//            libro.setAutor(ca.crearAutor());
//            System.out.println("Ingrese el nombre de la editorial: ");
//            libro.setEditorial(ce.crearEditorial());
//            librojpa.create(libro);
//            librocreado = true;
//
////            if (libro.getTitulo().isEmpty() || libro.getAnio() == null || libro.getAutor() == null || libro.getEditorial() == null) {
////                System.out.println("Campo vacío, ingrese nuevamente");
////            }
//        } catch (Exception e) {
//        }
//    } while (!librocreado);
//
//    //return libro;
//}


    public void eliminarLibro() throws Exception {
        System.out.println("Ingrese el nombre del libro que va a eliminar: ");
        String titulo = leer.nextLine();

        System.out.println("Ingrese el año del libro que va a eliminar: ");
        int anio = leer.nextInt();
        leer.nextLine(); // Consumir el carácter de nueva línea

        System.out.println("Ingrese el nombre del autor del libro que va a eliminar (dejar en blanco si no hay autor): ");
        String nombreAutor = leer.nextLine();

        System.out.println("Ingrese el nombre de la editorial del libro que va a eliminar: ");
        String nombreEditorial = leer.nextLine();

        List<Libro> libros = librojpa.findLibroEntities();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.getAnio().equals(anio)
                    && (libro.getAutor() == null || libro.getAutor().getNombre().equalsIgnoreCase(nombreAutor))
                    && libro.getEditorial().getNombre().equalsIgnoreCase(nombreEditorial)) {
                librojpa.destroy(libro.getIsbn());
                System.out.println("Libro eliminado correctamente.");
                return; // Sale del método después de eliminar el libro
            }
        }

        System.out.println("No se encontró el libro especificado.");
    }

    public void eliminarLibroSegundaParte(String nombre) {
        List<Libro> libros = librojpa.findLibroEntities();

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(nombre)) {
                try {
                    librojpa.destroy(libro.getIsbn());
                    System.out.println("Libro eliminado correctamente.");
                    return; // Sale del método después de eliminar el autor
                } catch (NonexistentEntityException e) {
                    System.out.println("Error al eliminar el libro: " + e.getMessage());
                    return; // Sale del método en caso de error
                }
            }
        }

        System.out.println("Libro no encontrado."); // Si no se encuentra el autor
    }

    public void buscarLibroporISBN(Long isbn) throws Exception {
        Libro libros = librojpa.findLibro(isbn);

        if (libros != null) {
            System.out.println("ISBN existentes:");

            System.out.println("ID: " + libros.getIsbn() + ", Nombre: " + libros.getTitulo());

        } else {
            System.out.println("No hay libros registrados en la base de datos.");
        }
    }

    public void buscarLibroporTitulo(String nombre) throws Exception {
        Libro libros = librojpa.findLibroN(nombre);

        if (libros != null) {
            System.out.println("titulos existentes:");

            System.out.println("ID: " + libros.getIsbn() + ", Nombre: " + libros.getTitulo());

        } else {
            System.out.println("No hay libros registrados en la base de datos.");
        }
    }

    public void buscarLibroporAutor(String nombre) throws Exception {
        List<Libro> libros = librojpa.findLibroEntities();


        for (Libro libro : libros) {
            if (libro.getAutor().getNombre().equalsIgnoreCase(nombre)) {
              System.out.println(libro.toString());
            }
        }

    }

        public void buscarLibroporEditorial(String nombre) throws Exception {
        List<Libro> libros = librojpa.findLibroEntities();


        for (Libro libro : libros) {
            if (libro.getEditorial().getNombre().equalsIgnoreCase(nombre)) {
              System.out.println(libro.toString());
            }
        }

    }
    
    
}
