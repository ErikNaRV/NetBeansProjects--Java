/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Autor;
import javax.persistence.Query;

/**
 *
 * @author erik_
 */
public class DAOAutor extends DAO<Autor> {
    
     //METODO INSERTAR AUTOR
    
    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto);
    }

    @Override
    public void editar(Autor objeto) {
        super.editar(objeto); 
    }

 
   
    public void eliminar(Integer ID) {
        
        
        
        
        if (super.buscarAutorPorId(ID)!= null) {
            // Elimina los libros relacionados con el autor
            em.getTransaction().begin();
            Query query = em.createQuery("DELETE FROM Libro l WHERE l.autor = :autor");
            query.setParameter("autor", super.buscarAutorPorId(ID));
            query.executeUpdate();

            // Elimina el autor
            em.remove(super.buscarAutorPorId(ID));
            em.getTransaction().commit();
        } else {
            // El autor no existe
            super.eliminar(super.buscarAutorPorId(ID)); 
        }
    }
    
     
}
