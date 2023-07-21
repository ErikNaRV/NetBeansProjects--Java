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
import libreria.entidades.Autor;
import libreria.entidades.Libro;
import libreria.persistencia.exceptions.NonexistentEntityException;
import libreria.persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Vane Proaño
 */
public class AutorJpaController1 implements Serializable {

    public AutorJpaController1(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
      public AutorJpaController1 (){
        emf = Persistence.createEntityManagerFactory("Ejercicio1_JDAPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Autor autor) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAutor(autor.getId()) != null) {
                throw new PreexistingEntityException("Autor " + autor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Autor autor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            autor = em.merge(autor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = autor.getId();
                if (findAutor(id) == null) {
                    throw new NonexistentEntityException("The autor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

public void destroy(Integer id) throws NonexistentEntityException {
    EntityManager em = null;
    try {
        em = getEntityManager();
        em.getTransaction().begin();

        Autor autor = em.getReference(Autor.class, id);
        if (autor != null) {
            Query query = em.createQuery("UPDATE Libro l SET l.autor = null WHERE l.autor = :autor");
            query.setParameter("autor", autor);
            query.executeUpdate();

            em.remove(autor);
            em.getTransaction().commit();
            System.out.println("Autor eliminado correctamente.");
        } else {
            throw new NonexistentEntityException("The autor with id " + id + " no longer exists.");
        }
    } catch (EntityNotFoundException enfe) {
        throw new NonexistentEntityException("The autor with id " + id + " no longer exists.", enfe);
    } finally {
        if (em != null) {
            em.close();
        }
    }
}


    public List<Autor> findAutorEntities() {
        return findAutorEntities(true, -1, -1);
    }

    public List<Autor> findAutorEntities(int maxResults, int firstResult) {
        return findAutorEntities(false, maxResults, firstResult);
    }

    private List<Autor> findAutorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Autor.class));
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

    public Autor findAutor(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Autor.class, id);
        } finally {
            em.close();
        }
    }
    
        public Autor findAutorN(String nombre) {
        EntityManager em = getEntityManager();
       
        try {
        TypedQuery<Autor> query = em.createQuery("SELECT l FROM Autor l WHERE l.nombre = :nombre", Autor.class);
        query.setParameter("nombre", nombre);
            return (Autor) query.getSingleResult();
        } finally {
            em.close();
        }
        }

    public int getAutorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Autor> rt = cq.from(Autor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
