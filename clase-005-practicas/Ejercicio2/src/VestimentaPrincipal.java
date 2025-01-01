import entities.Vestimenta;

public class VestimentaPrincipal {
    public static void main(String[] args) {
        Vestimenta[] vectorVestimenta = new Vestimenta[9];

        vectorVestimenta[0] = new Zapato(1, "Deportivas", 47.0, "Puma", "37", "Blanoo", "Goma", "Cordones");
        vectorVestimenta[1] = new Zapato(2, "Oxford", 95.0, "Camper", "39", "Granate", "Piel", "Hebilla");
        vectorVestimenta[2] = new Zapato(3, "Botas", 110.0, "Converse", "40", "Rojo", "Tela", "Cordones");

        vectorVestimenta[3] = new Pantalon(4, "Chinos", 30.0, "Docker's", "M", "Beig", "Skinny", "Algodón");
        vectorVestimenta[4] = new Pantalon(5, "Jeans", 40.0, "Lee", "L", "Azul claro", "Regular", "Mezclilla");
        vectorVestimenta[5] = new Pantalon(6, "Traje", 35.0, "Armani", "S", "Marron", "Slim Fit", "Paño");

        vectorVestimenta[6] = new Camiseta(7, "T-Shirt", 30.0, "Zara", ",M", "Rosa", "Manga larga", "Cuello redondo");
        vectorVestimenta[7] = new Camiseta(8, "Panadera", 25.0, "Springfield", "XL", "Gris", "Sin mangas", "Cuello con botones");

        vectorVestimenta[8] = new Sombrero(9, "Gorra", 15.0, "Mango", "Única", "Blanca", "Beisball", "Mediano");

        for (Vestimenta vestimenta : vectorVestimenta) {
            if (vestimenta instanceof Zapato) {
                ((Zapato) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Pantalon) {
                ((Pantalon) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Camiseta) {
                ((Camiseta) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Sombrero) {
                ((Sombrero) vestimenta).mostrarMensaje();
            }
        }
    }
}