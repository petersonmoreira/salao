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
import model.equipamento;

/**
 *
 * @author aluno
 */
public class equipamentoJpaController implements Serializable {

    public equipamentoJpaController() {
        emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(equipamento equipamento) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(equipamento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(equipamento equipamento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            equipamento = em.merge(equipamento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = equipamento.getId();
                if (findequipamento(id) == null) {
                    throw new NonexistentEntityException("The equipamento with id " + id + " no longer exists.");
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
            equipamento equipamento;
            try {
                equipamento = em.getReference(equipamento.class, id);
                equipamento.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The equipamento with id " + id + " no longer exists.", enfe);
            }
            em.remove(equipamento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<equipamento> findequipamentoEntities() {
        return findequipamentoEntities(true, -1, -1);
    }

    public List<equipamento> findequipamentoEntities(int maxResults, int firstResult) {
        return findequipamentoEntities(false, maxResults, firstResult);
    }

    private List<equipamento> findequipamentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(equipamento.class));
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

    public equipamento findequipamento(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(equipamento.class, id);
        } finally {
            em.close();
        }
    }

    public int getequipamentoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<equipamento> rt = cq.from(equipamento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
   public equipamento getEquipamento (String Id){
       EntityManager em = getEntityManager();
       return (equipamento)em.createQuery("select e from Equipamento e where e.Id like = " + Id + "%").getSingleResult();
    } 
}
