public class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria;
    private int autonomia;

    public Auto(int id, String placa, String marca, String modelo, int agno, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, agno, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int calcularAntiguedad() {
        return java.time.LocalDate.now().getYear() - agno;
    }

    public void cargarEnergia() {
        System.out.println("Cargando energía del auto eléctrico.");
    }
}