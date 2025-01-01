import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class ProductoPrincipal {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList();
        productos.add(new Producto("P001", "Smart TV 55 UHD", "Samsung",
                "Televisión", (double)450.0F, (double)650.0F, 20));
        productos.add(new Producto("P002", "Smartphone Galaxy S23", "Samsung",
                "Teléfono móvil", (double)800.0F, (double)1000.0F, 15));
        productos.add(new Producto("P003", "Laptop Aspire 5", "Acer",
                "Ordenador portátil", (double)600.0F, (double)800.0F, 10));
        productos.add(new Producto("P004", "Auriculares WH-1000XM5", "Sony",
                "Accesorios de audio", (double)200.0F, (double)350.0F, 25));
        productos.add(new Producto("P005", "Consola PS5", "Sony",
                "Videojuegos", (double)450.0F, (double)550.0F, 5));
        productos.add(new Producto("P006", "Refrigerador RT38", "LG",
                "Electrodoméstico", (double)500.0F, (double)750.0F, 8));
        productos.add(new Producto("P007", "Tablet iPad Air 10.9\"", "Apple",
                "Tablet", (double)650.0F, (double)850.0F, 12));
        productos.add(new Producto("P008", "Barra de sonido HW-Q800A", "Samsung",
                "Audio", (double)300.0F, (double)450.0F, 18));
        productos.add(new Producto("P009", "Monitor UltraWide 34\"", "LG",
                "Monitor", (double)400.0F, (double)600.0F, 6));
        productos.add(new Producto("P010", "Reloj Inteligente Series 8", "Apple",
                "Wearable", (double)350.0F, (double)500.0F, 14));


        Producto mayorPrecioVenta = encontrarProductoConMayorPrecioVenta(productos);
        Producto menorPrecioCosto = encontrarProductoConMenorPrecioCosto(productos);

        String cian = "\u001B[36m";
        String verde = "\u001B[32m";
        String azul = "\u001B[34m";
        String amarillo = "\u001B[33m";
        String magenta = "\u001B[35m";
        String reset = "\u001B[0m";

        System.out.println(verde + "Producto con mayor precio de venta:\n" + mayorPrecioVenta +"\n\n" + reset);
        System.out.println(azul + "Producto con menor precio de costo:\n" + menorPrecioCosto +"\n\n" + reset);

        productos.remove(5);
        System.out.println(cian + "Producto en la posición 5 borrado." +"\n" + reset);

        Producto mayorCantidadStock = encontrarProductoConMayorCantidadStock(productos);
        if (mayorCantidadStock != null) {
            mayorCantidadStock.setCantidadStock(mayorCantidadStock.getCantidadStock() - 3);
            System.out.println(magenta + "\nActualizado el stock del producto con mayor cantidad en stock:\n" + mayorCantidadStock + "\n\n" + reset);
        }

        System.out.println(amarillo + "Listado de productos actualizado:"+ reset);
        for (Producto producto : productos) {
            System.out.println(amarillo + producto + reset);
        }
    }

    private static Producto encontrarProductoConMayorPrecioVenta(ArrayList<Producto> productos) {
        Producto productoConMayorPrecioVenta = null;

        for (Producto producto : productos) {
            if (productoConMayorPrecioVenta == null || producto.getPrecioVenta() >
                    productoConMayorPrecioVenta.getPrecioVenta()) {
                productoConMayorPrecioVenta = producto;
            }
        }

        return productoConMayorPrecioVenta;
    }

    private static Producto encontrarProductoConMenorPrecioCosto(ArrayList<Producto> productos) {
        Producto productoConMenorPrecioCosto = null;

        for (Producto producto : productos) {
            if (productoConMenorPrecioCosto == null || producto.getPrecioCosto() <
                    productoConMenorPrecioCosto.getPrecioCosto()) {
                productoConMenorPrecioCosto = producto;
            }
        }

        return productoConMenorPrecioCosto;
    }

    private static Producto encontrarProductoConMayorCantidadStock(ArrayList<Producto> productos) {
        Producto productoConMayorCantidadStock = null;

        for (Producto producto : productos) {
            if (productoConMayorCantidadStock == null || producto.getCantidadStock() >
                    productoConMayorCantidadStock.getCantidadStock()) {
                productoConMayorCantidadStock = producto;
            }
        }

        return productoConMayorCantidadStock;
    }
}
