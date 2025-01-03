import Persistence.Empleado;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpleadoPrincipal {
    public static void main(String[] args) {

        String verde = "\u001B[32m";
        String azul = "\u001B[34m";
        String amarillo = "\u001B[33m";
        String resetColor = "\u001B[0m";

        List<Empleado> empleados = Arrays.asList(
                new Empleado("Marta Martinez Gomez", 30000, "Analista de ADN"),
                new Empleado("Carlos Perez Lopez", 45000, "Investigador Principal"),
                new Empleado("Ana Garcia Fernandez", 35000, "Bioinformatica"),
                new Empleado("Lola Fernandez Fuentes", 20000, "Administrativo"));

        List<Empleado> filtroEmpleadosPorSalario = empleados.stream()
                .filter(empleado -> empleado.getSalario() > 30000)
                .toList();
        System.out.println(verde + "\nEmpleados con salario mayor a 30000: ");
        filtroEmpleadosPorSalario.forEach(empleado ->
                System.out.println("\n" + empleado.toString().substring(1, empleado.toString().length() - 1)));


        Map<String, Double> salarioMedioPorCargo = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCargo,
                        Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println(resetColor + azul + "\nSalario medio por cargo: ");
        salarioMedioPorCargo.forEach((cargo, salarioMedio) ->
                System.out.println(cargo + ": " + salarioMedio));

        Optional<Empleado> empleadosConMayorSalario = empleados.stream()
                .max(java.util.Comparator.comparing(Empleado::getSalario));
        if (empleadosConMayorSalario.isPresent()) {
            System.out.println(resetColor + amarillo + "\nLos empleados con el salario más alto son: " + empleadosConMayorSalario.get());
        } else {
            System.err.println(resetColor + "Actualmente no hay empleados en la Base de Datos.");
        }
    }

}