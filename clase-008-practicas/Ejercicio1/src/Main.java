public class Main {
    public static void main(String[] args) {
        ReservasPrincipal reservasPrincipal = new ReservasPrincipal();
        try {
            reservasPrincipal.reservas();
        } catch (ReservaInvalidaException e) {
            String rojo = "\u001B[31m";
            String resetColor = "\u001B[0m";
            System.out.println(rojo + "Error en la reserva: " + e.getMessage() + resetColor);
        }
    }
}
