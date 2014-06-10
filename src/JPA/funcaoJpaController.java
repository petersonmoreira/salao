/*
 * To change this template, choose Tools | Templates
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
import model.funcao;
import model.profissional;

/**
 *
 * @author Peterson
 */
public class funcaoJpaController implements Serializable {

    public funcaoJpaController() {
        emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(funcao funcao) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(funcao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(funcao funcao) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            funcao = em.merge(funcao);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = funcao.getId();
                if (findfuncao(id) == null) {
                    throw new NonexistentEntityException("The funcao with id " + id + " no longer exists.");
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
            funcao funcao;
            try {
                funcao = em.getReference(funcao.class, id);
                funcao.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The funcao with id " + id + " no longer exists.", enfe);
            }
            em.remove(funcao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<funcao> findfuncaoEntities() {
        return findfuncaoEntities(true, -1, -1);
    }

    public List<funcao> findfuncaoEntities(int maxResults, int firstResult) {
        return findfuncaoEntities(false, maxResults, firstResult);
    }

    private List<funcao> findfuncaoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(funcao.class));
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

    public funcao findfuncao(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(funcao.class, id);
        } finally {
            em.close();
        }
    }
    
    
    public List getListfuncaoprofissional(profissional p) {
        EntityManager em = getEntityManager();
        List funcao = em.createQuery("select f from funcao f where f.profissional.id = " + p.getId().toString()).getResultList();
        return funcao;
    
    }

    public int getfuncaoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<funcao> rt = cq.from(funcao.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public funcao getfuncao(Long Id) {
        EntityManager em = getEntityManager();
        return (funcao) em.createQuery("select f from funcao f where f.Id like '" + Id + "%'").getSingleResult();
    }
    
}
