package PracticasDia2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        boolean finCompra = false;
        double importeProducto;
        double importeTotal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuando finalice la compra intruzca 0.");
        while (!finCompra) {
            System.out.println("Introduzca el importe del producto:");
            importeProducto = scanner.nextDouble();
                if (importeProducto > 0) {
                    importeTotal = (importeTotal + importeProducto);
                }
                else {
                    System.out.println("El total de su compra asciende a: " + importeTotal);
                    finCompra = true;
                }
            }
        }
    }

