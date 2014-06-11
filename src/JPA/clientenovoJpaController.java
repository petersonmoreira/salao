/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import JPA.exceptions.NonexistentEntityException;
import JPA.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.clientenovo;

/**
 *
 * @author Peterson
 */
public class clientenovoJpaController implements Serializable {

    public clientenovoJpaController() {
        emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(clientenovo clientenovo) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(clientenovo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findclientenovo(clientenovo.getId()) != null) {
                throw new PreexistingEntityException("clientenovo " + clientenovo + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(clientenovo clientenovo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            clientenovo = em.merge(clientenovo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = clientenovo.getId();
                if (findclientenovo(id) == null) {
                    throw new NonexistentEntityException("The clientenovo with id " + id + " no longer exists.");
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
            clientenovo clientenovo;
            try {
                clientenovo = em.getReference(clientenovo.class, id);
                clientenovo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clientenovo with id " + id + " no longer exists.", enfe);
            }
            em.remove(clientenovo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<clientenovo> findclientenovoEntities() {
        return findclientenovoEntities(true, -1, -1);
    }

    public List<clientenovo> findclientenovoEntities(int maxResults, int firstResult) {
        return findclientenovoEntities(false, maxResults, firstResult);
    }

    private List<clientenovo> findclientenovoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(clientenovo.class));
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

    public clientenovo findclientenovo(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(clientenovo.class, id);
        } finally {
            em.close();
        }
    }

    public int getclientenovoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<clientenovo> rt = cq.from(clientenovo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
     public clientenovo getclientenovo (String id){
       EntityManager em = getEntityManager();
       return (clientenovo)em.createQuery("select c from clientenovo c where c.id =" + id).getSingleResult();
    } 
     

    /**
     *
     * @param mes
     * @return
     */
    public List getclienteaniversario (){
              
       EntityManager em = getEntityManager();
     
       //select p from produto p where p.qtd <=2
       //SELECT DATE_PART('MONTH', CURRENT_TIMESTAMP) AS mes;
       //return em.createQuery("select c from clientenovo c where c.data_nasc = 12").getResultList();
       
      // return em.createQuery("select c from clientenovo c where c.data_nasc.MONTH = 12").getResultList();
       //return em.createQuery("select c from clientenovo c where date_part ('month',c.data_nasc) = 1").getResultList();
       return em.createQuery("select c from clientenovo c where Extract ('month' from c.data_nasc) = 1").getResultList();
    } 
      
}
