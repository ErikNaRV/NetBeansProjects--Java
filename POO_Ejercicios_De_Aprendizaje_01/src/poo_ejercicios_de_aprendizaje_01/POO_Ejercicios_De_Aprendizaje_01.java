/*
 *  Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.
 */
package poo_ejercicios_de_aprendizaje_01;
import Libros_ejercicio.Libro;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class POO_Ejercicios_De_Aprendizaje_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los datos del libro:");
        
        Libro l1 = new Libro();
     
        System.out.println("ISBN:");
        l1.ISBM = leer.next();
        
        System.out.println("Titulo:");
        l1.Titulo = leer.next();
        
        System.out.println("Autor:");
        l1.Autor = leer.next();
        
        System.out.println("No de Paginas :");
        l1.NumeroDePaginas = leer.nextInt();
        
        //System.out.println("El autor :"+l1.Autor+" El ISBM :"+l1.ISBM+" EL Titulo: "+l1.Titulo+" El No de paginas: "+l1.NumeroDePaginas+" se a registrado");
        
        System.out.println(l1.toString());
        
        
    }
    
}
