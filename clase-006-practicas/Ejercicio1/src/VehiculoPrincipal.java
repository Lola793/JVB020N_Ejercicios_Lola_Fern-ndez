import java.util.ArrayList;

public class VehiculoPrincipal{
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto(1, "7429LKR", "VOLKSWAGEN", "GOLF",
                2023, 8000, 74, 24));
        vehiculos.add(new Camioneta(2, "1807GFL", "FORD", "TRANSIT",
                2021, 20000, 75, 10));
        vehiculos.add(new Moto(3, "2036ADFA", "DUCATI", "MONSTER 821",
                2014, 6190, 821, "Desmodromico"));

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\nMarca: " + vehiculo.marca + ", Modelo: " + vehiculo.modelo + ", Antigüedad: "
                    + vehiculo.calcularAntiguedad() + " años.");
            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }
        }
    }
}