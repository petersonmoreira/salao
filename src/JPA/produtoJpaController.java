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
import javax.swing.JOptionPane;
//import javax.transaction.UserTransaction;
import model.produto;

/**
 *
 * @author Peterson
 */
public class produtoJpaController implements Serializable {

    public produtoJpaController() {
         emf = Persistence.createEntityManagerFactory("salao.belezaPU");
    }
   
    private EntityManagerFactory emf = null;

   

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(produto produto) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findproduto(produto.getCodigo()) != null) {
                throw new PreexistingEntityException("produto " + produto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(produto produto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            produto = em.merge(produto);
            em.getTransaction().commit();
           // System.out.println("SUCESSO");
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = produto.getCodigo();
                if (findproduto(id) == null) {
                    throw new NonexistentEntityException("The produto with id " + id + " no longer exists.");
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
            produto produto;
            try {
                produto = em.getReference(produto.class, id);
                produto.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The produto with id " + id + " no longer exists.", enfe);
            }
            em.remove(produto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<produto> findprodutoEntities() {
        return findprodutoEntities(true, -1, -1);
    }

    public List<produto> findprodutoEntities(int maxResults, int firstResult) {
        return findprodutoEntities(false, maxResults, firstResult);
    }

    private List<produto> findprodutoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(produto.class));
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

    public produto findproduto(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(produto.class, id);
        } finally {
            em.close();
        }
    }

    public int getprodutoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<produto> rt = cq.from(produto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    /*
    
    public int entradaproduto (int qtd){
        EntityManager em = getEntityManager();
        return (produto)em.createQuery("Select p from produto p where p.qtd");
        
    }*/
    
     public produto getProduto (String codigo){
       EntityManager em = getEntityManager();
       return (produto)em.createQuery("select p from produto p where p.codigo like '" + codigo + "%'" ).getSingleResult();
    }

    public List checarestoque() {
       EntityManager em = getEntityManager();
       //return (produto)em.createQuery("select descriÇÃo p from produto p where p.qtd <= 2").getSingleResult();
       return em.createQuery("select p from produto p where p.qtd <=2").getResultList();
    }
    
       
    
}
