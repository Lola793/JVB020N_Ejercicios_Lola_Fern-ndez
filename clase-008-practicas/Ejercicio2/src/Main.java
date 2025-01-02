public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        try {
            inventario.incluirProducto();
        }catch (InventarioInvalidoException e){
            String rojo = "\u001B[31m";
            String resetColor = "\u001B[0m";
            System.out.println(rojo + "Error en el inventario: " + e.getMessage()+ resetColor);
        }
    }
}