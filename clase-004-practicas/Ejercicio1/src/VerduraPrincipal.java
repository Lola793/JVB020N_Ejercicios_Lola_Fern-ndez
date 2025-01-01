public class VerduraPrincipal {
    public static void main(String[] args) {

        //Cree un vector (array) de tipo Verdura que pueda almacenar 5 verduras.
        Verdura[] arrayVerduras = new Verdura[5];

        //Crea 5 verduras y guárdalas en el vector.
        arrayVerduras[0] = new Verdura(1, "Esparragos", "Blanco", 27, true);
        arrayVerduras[1] = new Verdura(2, "Lechuga", "Verde", 19, false);
        arrayVerduras[2] = new Verdura(3, "Zanahoria", "Naranja", 42, false);
        arrayVerduras[3] = new Verdura(4, "Lombarda", "Morado", 20, true);
        arrayVerduras[4] = new Verdura(5, "Pimiento", "Rojo", 22, true);

        //Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las verduras almacenadas.
        System.out.println("\nCantidad de calorias por 100 gramos de: \n");
        for (Verdura verdura : arrayVerduras) {
            System.out.println(verdura.getId() + ". " + verdura.getNombre() + " - " + verdura.getCalorias() + " Kcal.");
        }
        //Cambiar todos los datos de dos verduras.
        for (Verdura verdura : arrayVerduras) {
            arrayVerduras[2].setNombre("Calabacin");
            arrayVerduras[2].setColor("Verde");
            arrayVerduras[2].setCalorias(16);
            arrayVerduras[2].setDebeCocinarse(true);

            arrayVerduras[4].setNombre("Endivia");
            arrayVerduras[4].setColor("Verde");
            arrayVerduras[4].setCalorias(17);
            arrayVerduras[4].setDebeCocinarse(false);
        }
        //Mostrar por pantalla los datos de todas las verduras luego del cambio.
        System.out.println("\nDatos de las verduras almacenadas tras el cambio \n");
        for (Verdura verdura : arrayVerduras) {
            System.out.println(verdura.getId() + ". " + verdura.getNombre() + " - " + verdura.getColor() + " - "
                    + verdura.getCalorias() + " - " + verdura.isDebeCocinarse() + ".");
        }


        System.out.println("\nVerduras de color verde:\n");
        for (Verdura verdura : arrayVerduras) {
            if (verdura.getColor() == "Verde") {
                System.out.println(verdura.getId() + ". " + verdura.getNombre() +".");
            }
    }
}
}

