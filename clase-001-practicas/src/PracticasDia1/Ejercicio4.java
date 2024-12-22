package PracticasDia1;


import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        String respuestaNegativa =("N");
        String respuestaAfirmativa = ("S");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Te apetece jugar?: (S/N)");
        while (true) {
            String respuestaScanner = scanner.nextLine();
            if (respuestaScanner.equals(respuestaNegativa)) {
                System.out.println("¡Oh, lastima!");
                break;
            } else if (respuestaScanner.equals(respuestaAfirmativa)) {
                System.out.println("¡Genial!. Dime un número entero: ");
                int primerNumero = Integer.parseInt(scanner.nextLine());
                System.out.println("Dime otro número entero: ");
                int segundoNumero = scanner.nextInt();
                int suma = primerNumero + segundoNumero;
                int resta = primerNumero - segundoNumero;
                int multiplicacion = primerNumero * segundoNumero;
                double division = (double) primerNumero / segundoNumero;
                System.out.println("Tus numeros sumados: " + suma + "\nTus numeros restados: " + resta + "\nTus numeros multiplicados: " + multiplicacion + "\nTus numeros divididos: " + division);
                break;
            } else {
                System.out.println("Respuesta erronea. Intentalo de nuevo.");
                System.out.println("¿Te apetece jugar?: (S/N)");
            }
        }
    }
}