package org.example;

public class ClinicaVeterinaria {

    public static void main(String[] args) {

        RegistroMascotas registroMascotas = new RegistroMascotas();

        registroMascotas.registrarMascota(1, "Otto", 3, "Perro");
        registroMascotas.registrarMascota(2, "Mecha", 2, "Gato");
        registroMascotas.registrarMascota(3,"Midori", 4, "Ave");


        System.out.println("\nListado de todas las mascotas:");
        registroMascotas.mostrarListadoMascotas();

        registroMascotas.generarMascotasAleatorias(4);

        System.out.println("\nBuscar por nombre:");
        System.out.println(registroMascotas.buscarPorNombre("Otto"));

        System.out.println("\nBuscar por especie:");
        System.out.println(registroMascotas.buscarPorEspecie("Ave"));

        System.out.println("\nCantidad total de mascotas registradas: " + registroMascotas.contarTotalMascotas());
    }
}