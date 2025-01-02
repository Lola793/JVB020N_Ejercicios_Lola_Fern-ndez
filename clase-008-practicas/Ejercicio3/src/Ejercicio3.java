import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroDias = 7;
        int[] temperaturaDiaria = new int[numeroDias];
        double promedioTemperatura;
        double temperaturaTotal = 0.0;
        Scanner scanner = new Scanner(System.in);


        VectorInvalidoException vectorInvalidoException = new VectorInvalidoException(numeroDias);

        for (int i = 0; i < temperaturaDiaria.length; i++) {
            System.out.println("\n¿Cual fue la temperatura el día " + (i + 1) + "?");
            temperaturaDiaria[i] = scanner.nextInt();
            vectorInvalidoException.almacenarTemperatura(i, temperaturaDiaria[i]);
            temperaturaTotal = (temperaturaDiaria[i] + temperaturaTotal);
        }
        promedioTemperatura = temperaturaTotal / temperaturaDiaria.length;
        System.out.println("\u001B[33m" + "\nEl promedio de temperatura de los ultimos 7 días ha sido de: " + promedioTemperatura + "ºC." + "\u001B[0m");


        System.out.println("\n¿Deseas consultar la temperatura de un día específico? (S/N)");
        scanner.nextLine();
        String respuestaScanner = scanner.nextLine();
        if (respuestaScanner.toLowerCase().equals("n")) {
            System.out.println("*****¡Gracias por utilizar nuestro programa!***");
        } else if (respuestaScanner.toLowerCase().equals("s")) {
            System.out.print("\nIntroduce el índice del día (1-7): ");
            int vectorDia = scanner.nextInt();
            vectorInvalidoException.accederTemperatura(vectorDia - 1);
        }
        scanner.close();
    }
}
