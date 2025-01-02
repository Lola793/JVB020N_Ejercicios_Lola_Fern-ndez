import java.time.LocalDateTime;

public class ReservaInvalidaException extends Exception {

    public ReservaInvalidaException(String mensaje) {
        super(mensaje);
    }

    public static void validarCampoCompleto(String campo, String nombreCampo) throws ReservaInvalidaException {
        if (campo == null || campo.trim().isEmpty()) {
            throw new ReservaInvalidaException("El campo '" + nombreCampo + "' no puede estar vacío.");
        }
    }

    public static void validarNumeroPlazasLibres(int numeroPlaza, int asientosDisponibles) throws ReservaInvalidaException {
        if (numeroPlaza <= 0 || numeroPlaza > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles para esta reserva.");
        }
    }

    public static void validarFechaPosterior(LocalDateTime fechaSalida) throws ReservaInvalidaException {
        if (fechaSalida.isBefore(LocalDateTime.now())) {
            throw new ReservaInvalidaException("La fecha de salida debe ser posterior a la fecha y hora actual.");
        }
    }

        public static void validarRangoAsiento ( int fila, int columna, int maxFilas, int maxColumnas) throws
        ReservaInvalidaException {
            if (fila < 0 || fila >= maxFilas || columna < 0 || columna >= maxColumnas) {
                throw new ReservaInvalidaException("Error: El asiento seleccionado está fuera de rango.");
            }
        }

        public static void validarAsientoDisponible ( char asiento) throws ReservaInvalidaException {
            if (asiento == 'X') {
                throw new ReservaInvalidaException("Error: El asiento ya está reservado.");
            }
        }
    }