package org.example;

public class TareasPrincipal {
    public static void main(String[] args) {
        int numTrabajadores = 4;

        for (int i = 1; i <= numTrabajadores; i++) {
            Thread repartoTareas = new Thread(new RepartoTareas(i));
            repartoTareas.start();
        }
    }
}