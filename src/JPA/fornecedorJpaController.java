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
import model.clientenovo;
import model.fornecedor;

/**
 *
 * @author aluno
 */
public class fornecedorJpaController implements Serializable {

    public fornecedorJpaController() {
        emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(fornecedor fornecedor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(fornecedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(fornecedor fornecedor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            fornecedor = em.merge(fornecedor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = fornecedor.getId();
                if (findfornecedor(id) == null) {
                    throw new NonexistentEntityException("The fornecedor with id " + id + " no longer exists.");
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
            fornecedor fornecedor;
            try {
                fornecedor = em.getReference(fornecedor.class, id);
                fornecedor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The fornecedor with id " + id + " no longer exists.", enfe);
            }
            em.remove(fornecedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<fornecedor> findfornecedorEntities() {
        return findfornecedorEntities(true, -1, -1);
    }

    public List<fornecedor> findfornecedorEntities(int maxResults, int firstResult) {
        return findfornecedorEntities(false, maxResults, firstResult);
    }

    private List<fornecedor> findfornecedorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(fornecedor.class));
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

    public fornecedor findfornecedor(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(fornecedor.class, id);
        } finally {
            em.close();
        }
    }

    public int getfornecedorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<fornecedor> rt = cq.from(fornecedor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    public fornecedor getFornecedor (String Id){
       EntityManager em = getEntityManager();
       return (fornecedor)em.createQuery("select f from Fornecedor f where f.Id like = " + Id + "%").getSingleResult();
    }
}
