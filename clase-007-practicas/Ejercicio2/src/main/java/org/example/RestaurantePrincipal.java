package org.example;

import org.example.logica.Platillo;
import org.example.logica.Controller;

import java.util.List;

public class RestaurantePrincipal {
    public static void main(String[] args) {

        Controller controller = new Controller();


        Platillo platillo1 = new Platillo(1, "Tortilla de camarones", "Camarones, harina de garbanzo, agua, perejil, cebolla", 10.00);
        Platillo platillo2 = new Platillo(2, "Patatas revolconas", "Patatas, pimentón, aceite, ajo, panceta", 7.00);
        Platillo platillo3 = new Platillo(3, "Sepia a la plancha", "Sepia, ajo, perejil, aceite de oliva, limón", 12.00);

        String cian = "\u001B[36m";
        String verde = "\u001B[32m";
        String azul = "\u001B[34m";
        String magenta = "\u001B[35m";
        String resetColor = "\u001B[0m";

        controller.crearPlatillo(platillo1);
        controller.crearPlatillo(platillo2);
        controller.crearPlatillo(platillo3);
        System.out.println(cian + "\nEspecialidades de la casa:");
        listarPlatillos(controller);
        System.out.println(resetColor);

        controller.eliminarPlatillo(2);
        System.out.println(verde + "\nNos quedan solo estas tapas:");
        listarPlatillos(controller);
        System.out.println(resetColor);
        controller.guardarPlatillos(List.of());


        Platillo platilloAEditar = controller.persistenceController.findPlatilloById(1);
        platilloAEditar.setPrecio(15.55);
        controller.editarPlatillo(platilloAEditar);
        System.out.println(azul + "\nHemos actualizado los precios:");
        listarPlatillos(controller);
        System.out.println(resetColor);
        controller.guardarPlatillos(List.of());

        System.out.println(magenta + "\nTapas disponibles en este momento:");
        listarPlatillos(controller);
        System.out.println(resetColor);
        controller.guardarPlatillos(List.of());

        controller.resetearTabla();
    }

    private static void listarPlatillos(Controller controller) {
        List<Platillo> platillos = controller.listarPlatillos();
        if (platillos.isEmpty()) {
            System.err.println("Se han acabado las tapas. ¡Vuelve mañana!");
        } else {
            for (Platillo platillo : platillos) {
                System.out.println("ID: " + platillo.getId() + ", Nombre: " + platillo.getNombre() + ", Ingredientes: "
                        + platillo.getReceta() + ", Precio: €" + platillo.getPrecio());
            }
        }
    }
}