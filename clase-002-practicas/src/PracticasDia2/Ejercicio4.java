package PracticasDia2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de reservas. Pulse Enter para continuar.");
        char[][] platea = new char[4][4];
        boolean finReserva = false;
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String respuestaScanner;
        String respuestaNegativa = ("N");
        String respuestaAfirmativa = ("S");
        while (!finReserva) {
            System.out.println("\nEstas son las butacas disponibles:\n");
            dibujarMapa(platea);
            int fila, butaca;
            for (int f = 1; f < 4; f++) {
                for (int c = 1; c < 4; c++) {
                    platea[f][c] = '0';
                }
            }
            System.out.println("\nIntroduzca la fila en la que desea reservar:");
            fila = scanner.nextInt();
            System.out.println("Introduzca la butaca que desea reservar:");
            butaca = scanner.nextInt();
            if (fila < 1 || fila >= 4 || butaca < 1 || butaca >= 4) {
                System.out.println("\n*****La butaca que intenta reservar no existe.***** \n ****Debe indicar una butaca y una fila desde la 1 hasta la 4.****\n");
                continue;
            }
            else if (platea[fila-1][butaca-1] == 'X') {
                System.out.println("\n*****La butaca ya esta reservada. Intentelo de nuevo.*****\n");
                continue;
            } else {
                platea[fila-1][butaca-1] = 'X';
                System.out.println("\n****Reserva completada****\n");
                dibujarMapa(platea);
            }
                System.out.println("\n¿Desea hacer otra reserva?: (S/N)");
                respuestaScanner = scanner.next();
                if (respuestaScanner.equals(respuestaNegativa)) {
                    System.out.println("\nGracias por su reserva.");
                    finReserva = true;
                }else if (!respuestaScanner.equals(respuestaAfirmativa)){
                    System.out.println("\n****Respuesta erronea. Debe indicar S (Si) o N (No)****\n");
                    System.out.println("\n ¿Desea hacer otra reserva?: (S/N)");
                    respuestaScanner = scanner.next();
                } else {
                    continue;
            }
        }
    }
    private static void dibujarMapa(char[][] platea) {
        for (int f = 0; f < 4; f++) {
            System.out.print("Fila " + (f + 1) + " ");{
                for (int c = 0; c < 4; c++) {
                    System.out.print("[" + platea[f][c] + "]");
                }
            }
            System.out.println(" ");
        }
    }
}
