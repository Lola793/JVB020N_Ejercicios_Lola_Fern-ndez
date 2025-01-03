package Persistence;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "\nNombre = " + nombre +
                "\nSalario = " + salario +
                "\nCargo = " + cargo;
    }
}