package org.example.persistence;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.logica.Platillo;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

import static jakarta.persistence.Persistence.createEntityManagerFactory;

public class PlatilloJpaController implements Serializable {

    public PlatilloJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PlatilloJpaController() {
        emf = createEntityManagerFactory("restaurantePU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Platillo platillo) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.merge(platillo);
        em.getTransaction().commit();

    }

    public void edit(Platillo platillo) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        platillo = em.merge(platillo);
        em.getTransaction().commit();

    }

    public void destroy(int id) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Platillo platillo = em.getReference(Platillo.class, id);
        em.remove(platillo);
        em.getTransaction().commit();

    }

    public List<Platillo> findPlatilloEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Platillo.class));
        Query q = em.createQuery(cq);
        return q.getResultList();

    }
}