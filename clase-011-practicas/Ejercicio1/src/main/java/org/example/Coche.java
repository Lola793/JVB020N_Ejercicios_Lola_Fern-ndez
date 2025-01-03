package org.example;

public class Coche {

    private String marca;
    private String modelo;
    private int agno;
    private double precio;

    public Coche(String marca, String modelo, int year, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.agno = year;
        this.precio = precio;
    }

    public Coche() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", agno='" + agno + '\'' +
                ", precio=" + precio;
    }

    public Object stream() {
    }
}