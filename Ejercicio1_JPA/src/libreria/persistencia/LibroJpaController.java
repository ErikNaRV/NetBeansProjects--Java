/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import libreria.entidades.Libro;
import libreria.persistencia.exceptions.NonexistentEntityException;
import libreria.persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Vane Proaño
 */
public class LibroJpaController implements Serializable {

    public LibroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public LibroJpaController(){
        emf = Persistence.createEntityManagerFactory("Ejercicio1_JDAPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Libro libro) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLibro(libro.getIsbn()) != null) {
                throw new PreexistingEntityException("Libro " + libro + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Libro libro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            libro = em.merge(libro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = libro.getIsbn();
                if (findLibro(id) == null) {
                    throw new NonexistentEntityException("The libro with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

public void destroy(Long id) throws NonexistentEntityException {
    EntityManager em = null;
    try {
        em = getEntityManager();
        em.getTransaction().begin();

        Libro libro = em.getReference(Libro.class, id);
        if (libro != null) {
            Query query = em.createQuery("UPDATE Libro l SET l.autor = null WHERE l = :libro");
            query.setParameter("libro", libro);
            query.executeUpdate();

            em.remove(libro);
            em.getTransaction().commit();
            System.out.println("Libro eliminado correctamente.");
        } else {
            throw new NonexistentEntityException("The book with id " + id + " no longer exists.");
        }
    } catch (EntityNotFoundException enfe) {
        throw new NonexistentEntityException("The book with id " + id + " no longer exists.", enfe);
    } finally {
        if (em != null) {
            em.close();
        }
    }
}
 
    public List<Libro> findLibroEntities() {
        return findLibroEntities(true, -1, -1);
    }

    public List<Libro> findLibroEntities(int maxResults, int firstResult) {
        return findLibroEntities(false, maxResults, firstResult);
    }

    private List<Libro> findLibroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Libro.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Libro findLibro(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Libro.class, id);
        } finally {
            em.close();
        }
    }

        public Libro findLibroN(String nombre) {
        EntityManager em = getEntityManager();
       
        try {
        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo", Libro.class);
        query.setParameter("titulo", nombre);
            return (Libro) query.getSingleResult();
        } finally {
            em.close();
        }
        }
    
    public int getLibroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Libro> rt = cq.from(Libro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public void corregir(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            String updateQuery = "UPDATE Libro l SET l.alta = true";
            Query query = em.createQuery(updateQuery);
            int updatedRows = query.executeUpdate();

            em.getTransaction().commit();
            System.out.println("Se actualizaron " + updatedRows + " filas.");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

/*public List<Libro> buscarAutor(String nombre) throws Exception {

        //se conecta a la base
        conectar();

        //hacemos una query
        List<Libro> libros = em.createQuery("SELECT m FROM Libro m WHERE m.autor.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();

        //nos desconectamos de la base
        desconectar();

        return libros;
    }*/ 
    
    }
            
    

