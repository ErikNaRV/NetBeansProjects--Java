/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.controladora;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialJpaController;
import libreria.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Vane Proaño
 */
public class ControlEditorial {
    
    EditorialJpaController editorialjpa = new EditorialJpaController(); // crear tablas
    Scanner leer = new Scanner(System.in);
    
    public Editorial crearEditorial() throws Exception{
        Editorial editorial = new Editorial();
    
        editorial.setNombre(leer.nextLine());
        editorialjpa.create(editorial);
        return editorial;
        
    }
    
    public void eliminarEditorial(String nombre) {
    List<Editorial> editoriales = editorialjpa.findEditorialEntities();

    for (Editorial editorial : editoriales) {
        if (editorial.getNombre().equalsIgnoreCase(nombre)) {
            try {
                editorialjpa.destroy(editorial.getId());
                System.out.println("Editorial eliminado correctamente.");
                return; // Sale del método después de eliminar el autor
            } catch (NonexistentEntityException e) {
                System.out.println("Error al eliminar la editorial: " + e.getMessage());
                return; // Sale del método en caso de error
            }
        }
    }

    System.out.println("Editorial no encontrado."); // Si no se encuentra el autor
}

 public void buscarEditorial(String nombre) throws Exception {
        Editorial editoriales =  editorialjpa.findEditorialN(nombre);

    if (editoriales != null) {
        System.out.println("editoriales existentes:");

            System.out.println("ID: " + editoriales.getId()+ ", Nombre: " + editoriales.getNombre());
        
    } else {
        System.out.println("No hay editoriales registrados en la base de datos.");
    }
}   
    

}
