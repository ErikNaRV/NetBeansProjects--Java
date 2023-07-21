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
import libreria.entidades.Editorial;
import libreria.persistencia.exceptions.NonexistentEntityException;
import libreria.persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Vane Proaño
 */
public class EditorialJpaController implements Serializable {

    public EditorialJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public EditorialJpaController(){
        emf = Persistence.createEntityManagerFactory("Ejercicio1_JDAPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Editorial editorial) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEditorial(editorial.getId()) != null) {
                throw new PreexistingEntityException("Editorial " + editorial + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Editorial editorial) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            editorial = em.merge(editorial);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = editorial.getId();
                if (findEditorial(id) == null) {
                    throw new NonexistentEntityException("The editorial with id " + id + " no longer exists.");
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

        Editorial editorial = em.getReference(Editorial.class, id);
        if (editorial != null) {
            Query query = em.createQuery("UPDATE Libro l SET l.editorial = null WHERE l.editorial = :editorial");
            query.setParameter("editorial", editorial);
            query.executeUpdate();

            em.remove(editorial);
            em.getTransaction().commit();
            System.out.println("Editorial eliminado correctamente.");
        } else {
            throw new NonexistentEntityException("The editorial with id " + id + " no longer exists.");
        }
    } catch (EntityNotFoundException enfe) {
        throw new NonexistentEntityException("The editorial with id " + id + " no longer exists.", enfe);
    } finally {
        if (em != null) {
            em.close();
        }
    }
}

    public List<Editorial> findEditorialEntities() {
        return findEditorialEntities(true, -1, -1);
    }

    public List<Editorial> findEditorialEntities(int maxResults, int firstResult) {
        return findEditorialEntities(false, maxResults, firstResult);
    }

    private List<Editorial> findEditorialEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Editorial.class));
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

    public Editorial findEditorial(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Editorial.class, id);
        } finally {
            em.close();
        }
    }

    public int getEditorialCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Editorial> rt = cq.from(Editorial.class);
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

            String updateQuery = "UPDATE Editorial l SET l.alta = true";
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

        public Editorial findEditorialN(String nombre) {
        EntityManager em = getEntityManager();
       
        try {
        TypedQuery<Editorial> query = em.createQuery("SELECT l FROM Editorial l WHERE l.nombre = :nombre", Editorial.class);
        query.setParameter("nombre", nombre);
            return (Editorial) query.getSingleResult();
        } finally {
            em.close();
        }
        }
}
