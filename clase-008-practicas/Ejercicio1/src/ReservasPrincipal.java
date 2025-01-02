import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class ReservasPrincipal {

    private int numeroAsientos = 180;
    private char[][] mapaAsientos = new char[6][30];

    public void reservas() throws ReservaInvalidaException {

        inicializarMapa();
        boolean finReserva = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de reservas de vuelos. Pulse Enter para continuar.");
        scanner.nextLine();

        while (!finReserva) {
            System.out.println("\nEstos son los asientos disponibles:\n");
            dibujarMapa();


            System.out.print("\nIntroduzca destino del vuelo: ");
            String destino = scanner.nextLine();
            ReservaInvalidaException.validarCampoCompleto(destino, "Destino");

            System.out.print("Introduzca fecha de salida (formato: yyyy-MM-dd HH:mm): ");
            LocalDateTime fechaSalida = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            ReservaInvalidaException.validarFechaPosterior(fechaSalida);

            System.out.print("Introduzca número de plazas que desea reservar: ");
            int numeroPlazas = scanner.nextInt();
            scanner.nextLine();
            ReservaInvalidaException.validarNumeroPlazasLibres(numeroPlazas, numeroAsientos);

            System.out.print("\nIntroduzca nombre y apellidos del pasajero: ");
            String nombreApellidos = scanner.nextLine();
            ReservaInvalidaException.validarCampoCompleto(nombreApellidos, "Nombre y Apellidos");

            System.out.println("\nPor favor, seleccione los asientos:");

            for (int i = 0; i < numeroPlazas; i++) {
                System.out.printf("\nSeleccione un número de plaza (plaza %d de %d):\n", i + 1, numeroPlazas);
                System.out.print("Fila (1-6): ");
                int fila = scanner.nextInt();
                System.out.print("Columna (1-30): ");
                int columna = scanner.nextInt();
                scanner.nextLine();

                try {
                    if (reservarAsiento(fila - 1, columna - 1)) {
                        System.out.println("Asiento reservado con éxito.");
                    }
                } catch (ReservaInvalidaException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            numeroAsientos -= numeroPlazas;

            System.out.println("\nReserva exitosa:");
            System.out.println("Pasajero: " + nombreApellidos);
            System.out.println("Destino: " + destino);
            System.out.println("Fecha de salida: " + fechaSalida);
            System.out.println("Número de plazas: " + numeroPlazas);


            System.out.print("\n¿Desea hacer otra reserva? (S/N): ");
            String respuesta = scanner.nextLine().trim().toUpperCase();
            if (respuesta.equals("N")) {
                System.out.println("Gracias por utilizar nuestro sistema de reservas. ¡Buen viaje!");
                finReserva = true;
            }
        }
        scanner.close();
    }

    private void inicializarMapa() {
        for (int i = 0; i < mapaAsientos.length; i++) {
            for (int j = 0; j < mapaAsientos[i].length; j++) {
                mapaAsientos[i][j] = '0';
            }
        }
    }

    private void dibujarMapa() {
        System.out.println("   " + "  ".repeat(30));
        for (int i = 0; i < mapaAsientos.length; i++) {
            System.out.printf("Fila ", i + 1);
            for (int j = 0; j < mapaAsientos[i].length; j++) {
                System.out.print("[" + mapaAsientos[i][j] + "]");
            }
            System.out.println();
        }
    }

    private boolean reservarAsiento(int fila, int columna) throws ReservaInvalidaException {

        ReservaInvalidaException.validarRangoAsiento(fila, columna, mapaAsientos.length, mapaAsientos[0].length);
        ReservaInvalidaException.validarAsientoDisponible(mapaAsientos[fila][columna]);

        mapaAsientos[fila][columna] = 'X';
        return true;
    }
}