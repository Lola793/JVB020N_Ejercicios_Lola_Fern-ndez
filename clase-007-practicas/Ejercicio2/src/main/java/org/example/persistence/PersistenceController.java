package org.example.persistence;

import jakarta.persistence.EntityManager;
import org.example.logica.Platillo;
import java.util.List;


public class PersistenceController {
    PlatilloJpaController platilloJpa;

    public PersistenceController() {
        platilloJpa = new PlatilloJpaController();
    }

    public void crearPlatillo(Platillo platillo) {
        platilloJpa.create(platillo);
    }

    public void eliminarPlatillo(int id) {
        platilloJpa.destroy(id);
    }

    public List<Platillo> listarPlatillos() {

        return platilloJpa.findPlatilloEntities();
    }

    public void editarPlatillo(Platillo platillo) {

        platilloJpa.edit(platillo);
    }

    public Platillo findPlatilloById(int id) {
        EntityManager em = platilloJpa.getEntityManager();
        return em.find(Platillo.class, id);
    }

    public void resetearTabla() {
        EntityManager em = platilloJpa.getEntityManager();
        em.getTransaction().begin();
        em.createNativeQuery("TRUNCATE TABLE Platillo").executeUpdate();
        em.getTransaction().commit();
    }

    public void guardarPlatillos(List<Platillo> platillos) {
        EntityManager em = platilloJpa.getEntityManager();
            em.getTransaction().begin(); // Iniciar una transacción
            for (Platillo platillo : platillos) {
                Platillo existente = em.find(Platillo.class, platillo.getId());
                if (existente == null) {
                    em.persist(platillo);
                } else {
                    em.merge(platillo);
                }
            }
            em.getTransaction().commit();
        }
    }