/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import JPA.exceptions.NonexistentEntityException;
import JPA.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.servicoNovo;

/**
 *
 * @author Peterson
 */
public class servicoNovoJpaController implements Serializable {

    public servicoNovoJpaController() {
        emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(servicoNovo servicoNovo) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(servicoNovo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findservicoNovo(servicoNovo.getCodigo()) != null) {
                throw new PreexistingEntityException("servicoNovo " + servicoNovo + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(servicoNovo servicoNovo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            servicoNovo = em.merge(servicoNovo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = servicoNovo.getCodigo();
                if (findservicoNovo(id) == null) {
                    throw new NonexistentEntityException("The servicoNovo with id " + id + " no longer exists.");
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
            servicoNovo servicoNovo;
            try {
                servicoNovo = em.getReference(servicoNovo.class, id);
                servicoNovo.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The servicoNovo with id " + id + " no longer exists.", enfe);
            }
            em.remove(servicoNovo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<servicoNovo> findservicoNovoEntities() {
        return findservicoNovoEntities(true, -1, -1);
    }

    public List<servicoNovo> findservicoNovoEntities(int maxResults, int firstResult) {
        return findservicoNovoEntities(false, maxResults, firstResult);
    }

    private List<servicoNovo> findservicoNovoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(servicoNovo.class));
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

    public servicoNovo findservicoNovo(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(servicoNovo.class, id);
        } finally {
            em.close();
        }
    }

    public int getservicoNovoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<servicoNovo> rt = cq.from(servicoNovo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
     /**
     *
     * @param codigo
     * @return
     */
    public servicoNovo getServico (String codigo){
       EntityManager em = getEntityManager();
       return (servicoNovo)em.createQuery("select s from servicoNovo s where s.codigo like '" + codigo + "%'" ).getSingleResult();
    }
    
  // "select p from profissional p where p.Id like '" + Id + "%'"
}
