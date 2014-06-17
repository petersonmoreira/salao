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
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.clienteXpromocao;
import static model.clienteXpromocao_.Cliente;
import model.clientenovo;
import model.promocaonovo;

/**
 *
 * @author Peterson
 */
public class promocaonovoJpaController implements Serializable {

    public promocaonovoJpaController() {
     emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(promocaonovo promocaonovo) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(promocaonovo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findpromocaonovo(promocaonovo.getCodigo()) != null) {
                throw new PreexistingEntityException("promocaonovo " + promocaonovo + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(promocaonovo promocaonovo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            promocaonovo = em.merge(promocaonovo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = promocaonovo.getCodigo();
                if (findpromocaonovo(id) == null) {
                    throw new NonexistentEntityException("The promocaonovo with id " + id + " no longer exists.");
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
            promocaonovo promocaonovo;
            try {
                promocaonovo = em.getReference(promocaonovo.class, id);
                promocaonovo.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The promocaonovo with id " + id + " no longer exists.", enfe);
            }
            em.remove(promocaonovo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<promocaonovo> findpromocaonovoEntities() {
        return findpromocaonovoEntities(true, -1, -1);
    }

    public List<promocaonovo> findpromocaonovoEntities(int maxResults, int firstResult) {
        return findpromocaonovoEntities(false, maxResults, firstResult);
    }

    private List<promocaonovo> findpromocaonovoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(promocaonovo.class));
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

    public promocaonovo findpromocaonovo(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(promocaonovo.class, id);
        } finally {
            em.close();
        }
    }

    public int getpromocaonovoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<promocaonovo> rt = cq.from(promocaonovo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List getListPromocaoCliente(clientenovo c){
        EntityManager em = getEntityManager();
        List promocoes;
        promocoes = em.createQuery("select p from clientenovo p where p.id = " + c.getId()).getResultList();
        return promocoes;
    }
    
      /*  public List getListCidadeEstado(Estado e) {
        EntityManager em = getEntityManager();
        List cidades = em.createQuery("select c from Cidade c where c.estado.id = " + e.getId().toString()).getResultList();
        return cidades;
    }*/
    
    /**
     *
     * @return
     */
    public promocaonovo getpromocao(String codigo) {
        EntityManager em = getEntityManager();
        return (promocaonovo) em.createQuery("select pro from promocao pro where pro.Id like '" + codigo + "%'").getSingleResult();
    }
    
}
