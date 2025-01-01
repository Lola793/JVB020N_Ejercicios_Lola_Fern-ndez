public class Camioneta extends Vehiculo implements Combustion {
    private double capacidadTanque; // En litros
    private double consumoCombustible; // Km/L

    public Camioneta(int id, String placa, String marca, String modelo, int agno, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, agno, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int calcularAntiguedad() {
        return java.time.LocalDate.now().getYear() - agno;
    }

    public void recargarCombustible() {
        System.out.println("Recargando combustible de la camioneta.");
    }
}
