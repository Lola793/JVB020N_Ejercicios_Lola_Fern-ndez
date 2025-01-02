public class InventarioInvalidoException extends RuntimeException {

    public InventarioInvalidoException(String message) {
        super(message);
    }

    public static void validarStringCampoCompleto(String nombreProducto, String nombreCampo) throws
            InventarioInvalidoException {
        if (nombreProducto == null || nombreProducto.trim().isEmpty()) {
            throw new InventarioInvalidoException("El " + nombreCampo + " no puede estar vacío.");
        }
    }

    public static void validarDoubleCompleto(Double precioProducto, String nombreCampo) throws
            InventarioInvalidoException {
        if (precioProducto <= 0) {
            throw new InventarioInvalidoException("El precio " + nombreCampo + " debe ser mayor de 0.");
        } else if (precioProducto == null) {
            throw new InventarioInvalidoException("El precio " + nombreCampo + " no puede ser nulo.");
        }
    }

    public static void validarIntegerCompleto(int stockProducto, String nombreCampo) throws
            InventarioInvalidoException {
        if (stockProducto < 0) {
            throw new InventarioInvalidoException("El " + nombreCampo + " debe ser un número mayor de 0."
            );
        } else if (stockProducto == 0) {
            throw new InventarioInvalidoException("El " + nombreCampo + " no puede ser negativo."
            );
        }
    }
}