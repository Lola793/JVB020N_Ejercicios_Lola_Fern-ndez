package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas<T> {
    private final List<Mascota<T>> registroNuevaMacosta = new ArrayList<>();

    public void registrarMascota(int id, String nombre, int edad, T especie) {
        Mascota<T> mascota = new Mascota<>(id, nombre, edad, especie);
        registroNuevaMacosta.add(mascota);
    }

    public List<Mascota<T>> buscarPorNombre(String nombre) {
        List<Mascota<T>> resultadoBusquedaPorNombre = new ArrayList<>();
        for (Mascota<T> mascota : registroNuevaMacosta) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                resultadoBusquedaPorNombre.add(mascota);
            }
        }
        return resultadoBusquedaPorNombre;
    }

    public List<Mascota<T>> buscarPorEspecie(Object especie) {
        List<Mascota<T>> resultadoBusquedaPorEspecie = new ArrayList<>();
        for (Mascota<T> mascota : registroNuevaMacosta) {
            if (mascota.getEspecie().equals(especie)) {
                resultadoBusquedaPorEspecie.add(mascota);
            }
        }
        return resultadoBusquedaPorEspecie;
    }

    public int contarTotalMascotas() {
        return registroNuevaMacosta.size();
    }

    public void mostrarListadoMascotas() {
        for (Mascota<T> mascota : registroNuevaMacosta) {
            System.out.println(mascota);
        }
    }

    public void generarMascotasAleatorias(int cantidad) {
        Random aleatorio = new Random();
        String[] nombres = {"Chispa", "Gus", "Ka", "Pua", "Trosky", "Mico", "Kira"};
        String[] especies = {"Uron", "Conejo", "Reptil", "Ave"};
        for (int i = 0; i < cantidad; i++) {
            int id = registroNuevaMacosta.size() + 1;
            String nombre = nombres[aleatorio.nextInt(nombres.length)];
            int edad = aleatorio.nextInt(3) + 1;
            T especie = (T) especies[aleatorio.nextInt(especies.length)];
            registrarMascota(id, nombre, edad, especie);
            System.out.println("Mascota generada con los siguientes datos: " + registroNuevaMacosta.get(registroNuevaMacosta.size() - 1));
        }
    }
}
