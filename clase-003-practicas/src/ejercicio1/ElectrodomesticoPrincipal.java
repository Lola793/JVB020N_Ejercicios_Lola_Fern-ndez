package ejercicio1;

import ejercicio1.entidades.Electrodomestico;

public class ElectrodomesticoPrincipal {
    public static void main(String[] args) {

        //Crea 3 objetos de la clase Electrodoméstico utilizando parámetros

        Electrodomestico microondas = new Electrodomestico(32663, "BOSCH", "NJ798", "A++", "Negro");
        Electrodomestico lavadora = new Electrodomestico(25632,"BENAVENT", "BL-600", "A+", "Blanco");
        Electrodomestico televisor = new Electrodomestico(32653, "THOMPSON", "LMN456", "B", "Gris Plomo");

        //Crea 1 objeto de la clase Electrodomestico sin parámetros.
        Electrodomestico electrodomesticoSinParametros = new Electrodomestico();

        //Muestra por pantalla la marca, modelo y consumo energético de los 3
        // electrodomésticos creados con parámetros.
        System.out.println("\nMicroondas: Marca = " + microondas.getMarca() +
                ", Modelo = " + microondas.getModelo() +
                ", Consumo = " + microondas.getConsumo());
        System.out.println("Lavadora: Marca = " + lavadora.getMarca() +
                ", Modelo = " + lavadora.getModelo() +
                ", Consumo = " + lavadora.getConsumo());
        System.out.println("Televisor: Marca = " + televisor.getMarca() +
                ", Modelo = " + televisor.getModelo() +
                ", Consumo = " + televisor.getConsumo());

        //Intenta obtener la marca del electrodoméstico creado sin parámetros.
        //¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
        //Se obtiene el valor null para cada atributo ya que hemos usado el constructor vacio
        // y no hemos asignado valores a los atributos

        System.out.println("\nElectrodoméstico sin parametros: Marca = " + electrodomesticoSinParametros.getMarca());
    }
}