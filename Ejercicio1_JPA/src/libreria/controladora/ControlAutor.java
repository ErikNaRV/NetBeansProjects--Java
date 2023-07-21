/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.controladora;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Libro;
import libreria.persistencia.AutorJpaController1;
import libreria.persistencia.LibroJpaController;
import libreria.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Vane Proaño
 */
public class ControlAutor {

    
    AutorJpaController1 autojpa = new AutorJpaController1(); // crear las tablas
    LibroJpaController librojpa = new LibroJpaController();
    Scanner leer = new Scanner(System.in);
    Autor autor = new Autor();
    
    public Autor crearAutor() throws Exception{
        autor.setNombre(leer.nextLine());
        autojpa.create(autor);
        
        return autor;
    }
    
public void eliminarAutor(String nombre) {
    List<Autor> autores = autojpa.findAutorEntities();

    for (Autor autor : autores) {
        if (autor.getNombre().equalsIgnoreCase(nombre)) {
            try {
                autojpa.destroy(autor.getId());
                System.out.println("Autor eliminado correctamente.");
                return; // Sale del método después de eliminar el autor
            } catch (NonexistentEntityException e) {
                System.out.println("Error al eliminar el autor: " + e.getMessage());
                return; // Sale del método en caso de error
            }
        }
    }

    System.out.println("Autor no encontrado."); // Si no se encuentra el autor
}

public void buscarAutor(String nombre) throws Exception {
        Autor autores =  autojpa.findAutorN(nombre);

    if (autores != null) {
        System.out.println("autores existentes:");

            System.out.println("ID: " + autores.getId()+ ", Nombre: " + autores.getNombre());
        
    } else {
        System.out.println("No hay autores registrados en la base de datos.");
    }
}

}
