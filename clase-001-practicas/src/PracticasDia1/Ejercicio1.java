package PracticasDia1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("¡Bienvenide al sistema!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Bienevenide,al sistema " + nombreUsuario);
}}
