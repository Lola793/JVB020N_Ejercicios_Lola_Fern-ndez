package org.example;

public class RepartoTareas implements Runnable {

    private int id;

    public RepartoTareas(int id) {
        this.id = id;
    }

    String verde = "\u001B[32m";
    String amarillo = "\u001B[33m";
    String cian = "\u001B[36m";
    String morado = "\u001B[35m";

    @Override
    public void run() {
        try {
            System.out.println(verde + "El trabajador " + id + " está listo para trabajar.\n");

            System.out.println(cian + "El trabajador " + id + " está ensamblando.\n");
            Thread.sleep(2000);
            System.out.println(cian + "Trabajador " + id + " ha ensamblado un producto.\n");

            System.out.println(amarillo + "El trabajador " + id + " está realizando controles de calidad.\n");
            Thread.sleep(1000);
            System.out.println(amarillo + "El trabajador " + id + " ha completado un control de calidad.\n");


            System.out.println(morado + "El trabajador " + id + " está embalando productos.\n");
            Thread.sleep(1500); // Simulación de tiempo de embalaje
            System.out.println(morado + "El trabajador " + id + " ha embalado un producto.\n");

            System.out.println(verde + "Trabajador " + id + " ha terminado su jornada.\n");

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
            System.err.println("El trabajador " + id + " ha sido interrumpido.");
        }
    }
}
