package ejercicio1.entidades;

public class Electrodomestico {

    Integer cod;
    String marca;
    String modelo;
    String consumo;
    String color;

    public Electrodomestico(Integer cod, String marca, String modelo, String consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public Electrodomestico() {
    }

    public Integer getCod() {
        return cod;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getConsumo() {
        return consumo;
    }
    public String getColor() {
        return consumo;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
