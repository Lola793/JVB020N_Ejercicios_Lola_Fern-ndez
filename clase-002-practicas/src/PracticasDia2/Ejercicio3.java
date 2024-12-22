package PracticasDia2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Double[] temperaturaDiaria = new Double[7];
        double promedioTemperatura;
        double temperaturaTotal = 0.0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < temperaturaDiaria.length; i++) {
            System.out.println("¿Cual fue la temperatura el día " + (i+1) +"?");
            temperaturaDiaria[i] = scanner.nextDouble();
            temperaturaTotal = (temperaturaDiaria [i] + temperaturaTotal);
        }
        promedioTemperatura = temperaturaTotal / temperaturaDiaria.length;
        System.out.println("El promedio de temperatura de los ultimos 7 días ha sido de: " + promedioTemperatura);
    }
}

