package org.example;
import java.util.ArrayList;
import java.util.List;

public class InventarioCoches<T extends Coche> {
    private List<T> coches;

    public InventarioCoches() {
        this.coches = new ArrayList<>();
    }

    public List<T> listarInventario() {
        return coches;
    }

    public void incluirCoche(T coche) {
        coches.add(coche);
            }

    public List<T> buscarPorMarca(String marca) {
        List<T> resultado = new ArrayList<>();
        for (T auto : coches) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                resultado.add(auto);
            }
        }
        return resultado;
    }

    public List<T> buscarPorAgno(int agno) {
        List<T> resultado = new ArrayList<>();
        for (T auto : coches) {
            if (auto.getAgno() == agno) {
                resultado.add(auto);
            }
        }
        return resultado;
    }

    public double precioTotalInventario() {
        double total = 0;
        for (T auto : coches) {
            total += auto.getPrecio();
        }
        return total;
    }

}