/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import JPA.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.profissional;

/**
 *
 * @author Peterson
 */
public class profissionalJpaController implements Serializable {

    public profissionalJpaController() {
        emf = Persistence.createEntityManagerFactory("salao.belezaPU");;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(profissional profissional) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(profissional);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(profissional profissional) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            profissional = em.merge(profissional);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = profissional.getId();
                if (findprofissional(id) == null) {
                    throw new NonexistentEntityException("The profissional with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            profissional profissional;
            try {
                profissional = em.getReference(profissional.class, id);
                profissional.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The profissional with id " + id + " no longer exists.", enfe);
            }
            em.remove(profissional);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<profissional> findprofissionalEntities() {
        return findprofissionalEntities(true, -1, -1);
    }

    public List<profissional> findprofissionalEntities(int maxResults, int firstResult) {
        return findprofissionalEntities(false, maxResults, firstResult);
    }

    private List<profissional> findprofissionalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(profissional.class));
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

    public profissional findprofissional(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(profissional.class, id);
        } finally {
            em.close();
        }
    }

    public int getprofissionalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<profissional> rt = cq.from(profissional.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
