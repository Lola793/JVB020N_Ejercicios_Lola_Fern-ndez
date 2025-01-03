package org.example;

import java.util.List;

public class CochePrincipal {
    public static void main(String[] args) {

        String amarillo = "\u001B[33m";
        String azul = "\u001B[34m";
        String morado = "\u001B[35m";
        String verde = "\u001B[32m";
        String cian = "\u001B[36m";

        InventarioCoches<Coche> inventarioCoches = new InventarioCoches<>();

        inventarioCoches.incluirCoche(new Coche("VOLKSWAGEN", "GOLF", 2005, 8000));
        inventarioCoches.incluirCoche(new Coche("FORD", "TRANSIT", 2021, 20000));
        inventarioCoches.incluirCoche(new Coche("Lexus", "UX", 2019, 35000));
        inventarioCoches.incluirCoche(new Coche("Ford", "Focus", 2005, 125000));
        inventarioCoches.incluirCoche(new Coche("Peugeot", "208", 2018, 15000));
        inventarioCoches.incluirCoche(new Coche("Toyota", "Corolla", 2020, 20000));
        inventarioCoches.incluirCoche(new Coche("Citroen", "Xara", 2003, 2500));

        System.out.println(azul + "\nActualmente disponemos de estos coches: ");
        inventarioCoches.listarInventario().forEach(System.out::println);

        Coche coche = new Coche("Citroen", "C15", 1980, 1000);
        System.out.println(amarillo + "\nCoche incluido en el inventario:\n" + coche);
        inventarioCoches.incluirCoche(coche);

        System.out.println(cian + "\nDisponemos de estos coches que responden de la marca Citroen: ");
        List<Coche> cochesPorMarca = inventarioCoches.buscarPorMarca("Citroen");
        cochesPorMarca.forEach(System.out::println);

        System.out.println(verde + "\nDisponemos de estos coches del año 2005:");
        List<Coche> cochesPorAgno = inventarioCoches.buscarPorAgno(2005);
        cochesPorAgno.forEach(System.out::println);

        System.out.println(azul + "\nActualmente disponemos de estos coches: ");
        inventarioCoches.listarInventario().forEach(System.out::println);

        System.out.println(morado + "\nEl valor total del inventario de coches es de: "
                + inventarioCoches.precioTotalInventario() + " €");
    }
}