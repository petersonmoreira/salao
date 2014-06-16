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
import model.clienteXpromocao;
import model.clientenovo;

/**
 *
 * @author Peterson
 */
public class clienteXpromocaoJpaController implements Serializable {

    public clienteXpromocaoJpaController() {
        emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(clienteXpromocao clienteXpromocao) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(clienteXpromocao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(clienteXpromocao clienteXpromocao) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            clienteXpromocao = em.merge(clienteXpromocao);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = clienteXpromocao.getId();
                if (findclienteXpromocao(id) == null) {
                    throw new NonexistentEntityException("The clienteXpromocao with id " + id + " no longer exists.");
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
            clienteXpromocao clienteXpromocao;
            try {
                clienteXpromocao = em.getReference(clienteXpromocao.class, id);
                clienteXpromocao.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clienteXpromocao with id " + id + " no longer exists.", enfe);
            }
            em.remove(clienteXpromocao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<clienteXpromocao> findclienteXpromocaoEntities() {
        return findclienteXpromocaoEntities(true, -1, -1);
    }

    public List<clienteXpromocao> findclienteXpromocaoEntities(int maxResults, int firstResult) {
        return findclienteXpromocaoEntities(false, maxResults, firstResult);
    }

    private List<clienteXpromocao> findclienteXpromocaoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(clienteXpromocao.class));
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

    public clienteXpromocao findclienteXpromocao(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(clienteXpromocao.class, id);
        } finally {
            em.close();
        }
    }

    public int getclienteXpromocaoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<clienteXpromocao> rt = cq.from(clienteXpromocao.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
         public clientenovo getclientenovo (String id){
       EntityManager em = getEntityManager();
             System.out.println("ENTREI GETCLIENTE");
       return (clientenovo)em.createQuery("select c from clientenovo c where c.id =" + id).getSingleResult();
    } 
}
