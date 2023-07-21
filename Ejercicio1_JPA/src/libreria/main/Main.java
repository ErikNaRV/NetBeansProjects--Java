/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria.main;

import java.util.Scanner;
import libreria.controladora.ControlAutor;
import libreria.controladora.ControlEditorial;
import libreria.controladora.ControlLibro;
import libreria.persistencia.EditorialJpaController;
import libreria.persistencia.LibroJpaController;

/**
 *
 * @author Vane Proaño
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         //crear las tablas con las controladoras en sql
         Scanner leer = new Scanner (System.in);
 //ControlAutor controlautor = new ControlAutor();
    //    System.out.println("Ingrese el autor a buscar");
 //String autor = leer.nextLine();
 //controlautor.buscarAutor(autor);
 //controlautor.buscarAutor();
    //System.out.println("ingrese el nombre del autor que quiere eliminar");
     //String eliminado= leer.nextLine();
//controlautor.eliminarAutor(eliminado);
//controlautor.crearAutor();
      ControlLibro controlibro = new ControlLibro();
        //System.out.println("Ingrese el autor del libro que desea encontrar");
        //String libroencontrado = leer.nextLine();
        //controlibro.buscarLibroporAutor(libroencontrado);
        //System.out.println("Ingrese la editorial del libro a buscar");
        //String libroeditorial = leer.nextLine();
        //controlibro.buscarLibroporEditorial(libroeditorial);
        //System.out.println("ingrese el ISBN del libro");
        //Long codigo = leer.nextLong();
        //controlibro.buscarLibroporISBN(codigo);
        //System.out.println("Ingrese el titulo a buscar");
        //String titulo = leer.nextLine();
        //controlibro.buscarLibroporTitulo(titulo);
        //System.out.println("Ingrese el libro a eliminar");
        //String libroborrado = leer.nextLine();
        //controlibro.eliminarLibroSegundaParte(libroborrado);
       /* LibroJpaController libro = new LibroJpaController();
        libro.corregir();
        EditorialJpaController editorial = new EditorialJpaController();
        editorial.corregir();
        esto es un metodo para corregir el dato de alta que estaba en false y se le actualizo a true
        */
        
      controlibro.crearLibro();
      //controlibro.eliminarLibro();
       //ControlEditorial controleditorial = new ControlEditorial();
        //System.out.println("Ingrese la editorial a buscar");
        //String editorial = leer.nextLine();
        //controleditorial.buscarEditorial(editorial);
        //System.out.println("Ingrese la editorial que desea eliminar");
        //String eliminado = leer.nextLine();
       //controleditorial.eliminarEditorial(eliminado);
     

            
        }
   
    }
    

