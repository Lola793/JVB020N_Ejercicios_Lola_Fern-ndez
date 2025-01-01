package org.example.logica;

import org.example.persistence.PersistenceController;

import java.util.List;

public class Controller {

    private static PersistenceController platilloJpa;

    public PersistenceController persistenceController;

    public Controller() {
        persistenceController = new PersistenceController();
    }


    public void crearPlatillo(Platillo plat) {
        persistenceController.crearPlatillo(plat);

    }

    public void eliminarPlatillo(int id) {
        persistenceController.eliminarPlatillo(id);
    }

    public List<Platillo> listarPlatillos() {
        return persistenceController.listarPlatillos();
    }

    public void editarPlatillo(Platillo platillo) {
        persistenceController.editarPlatillo(platillo);
    }

    public void resetearTabla() {persistenceController.resetearTabla();}

    public void guardarPlatillos(List<Platillo> platillos) {persistenceController.guardarPlatillos(platillos);}
    }

