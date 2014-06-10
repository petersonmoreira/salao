/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;
/*
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
import model.agendamento;
import model.clientenovo;

/**
 *
 * @author Peterson
 */
//public class agendamentoJpaController implements Serializable {
/*
    public agendamentoJpaController() {
        emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(agendamento agendamento) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(agendamento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findagendamento(agendamento.getClientenovo()) != null) {
                throw new PreexistingEntityException("agendamento " + agendamento + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(agendamento agendamento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            agendamento = em.merge(agendamento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                clientenovo id = agendamento.getClientenovo();
                if (findagendamento(id) == null) {
                    throw new NonexistentEntityException("The agendamento with id " + id + " no longer exists.");
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
            agendamento agendamento;
            try {
                agendamento = em.getReference(agendamento.class, id);
                agendamento.getClientenovo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The agendamento with id " + id + " no longer exists.", enfe);
            }
            em.remove(agendamento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(clientenovo id) throws NonexistentEntityException {
        destroy(id.getId());
    }

    public List<agendamento> findagendamentoEntities() {
        return findagendamentoEntities(true, -1, -1);
    }

    public List<agendamento> findagendamentoEntities(int maxResults, int firstResult) {
        return findagendamentoEntities(false, maxResults, firstResult);
    }

    private List<agendamento> findagendamentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(agendamento.class));
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

    public agendamento findagendamento(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(agendamento.class, id);
        } finally {
            em.close();
        }
    }

  
    public agendamento findagendamento(clientenovo id) {
        return findagendamento(id.getId());
    }

    public int getagendamentoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<agendamento> rt = cq.from(agendamento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
  */  
//}
