public class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int agno, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, agno, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int calcularAntiguedad() {
        return java.time.LocalDate.now().getYear() - agno;
    }

    public void recargarCombustible() {
        System.out.println("Recargando combustible de la moto.");
    }
}