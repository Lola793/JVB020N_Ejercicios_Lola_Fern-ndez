import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    private ArrayList<Producto> inventario = new ArrayList<>();

    public void incluirProducto() throws InventarioInvalidoException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el nombreCampo del producto: ");
        String nombreProducto = scanner.nextLine();
        //InventarioInvalidoException.validarStringCampoCompleto(nombreProducto, "nombre del producto");

        System.out.print("Introduzca el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        //InventarioInvalidoException.validarDoubleCompleto(precioProducto, "precio del producto");


        System.out.print("Introduzca el stock disponible del producto: ");
        int stockProducto = scanner.nextInt();
        //InventarioInvalidoException.validarIntegerCompleto(stockProducto, "stock del producto");


        Producto producto = new Producto(nombreProducto, precioProducto, stockProducto);
        inventario.add(producto);

        System.out.println("Producto incluido con éxito");
        scanner.close();
    }
}
