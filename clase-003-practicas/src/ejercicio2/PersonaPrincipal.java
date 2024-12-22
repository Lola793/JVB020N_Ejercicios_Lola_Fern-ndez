package ejercicio2;

import ejercicio2.entidades.Persona;

public class PersonaPrincipal {
    public static void main(String[] args) {//Crear un vector de tipo Persona cinco posiciones.
        // Crea cinco personas y guárdalas en él.
        Persona[] vectorPersonas = new Persona[5];

        vectorPersonas[0] = new Persona(1, "Maria Perez", 16, "Calle Fuendetods, 59", "+34678952134");
        vectorPersonas[1] = new Persona(2, "Isabel Garcia", 45, "Paseo de Gracia, 12", "+34679252157");
        vectorPersonas[2] = new Persona(3, "Paula Martinez", 37, "Calle General Herrera Oria, 73", "+34632569415");
        vectorPersonas[3] = new Persona(4, "Inmaculada Gomez", 30, "Calle Jose del Pino, 1", "+34679326128");
        vectorPersonas[4] = new Persona(5, "Marta Fernandez", 24, "Avenida de los Reyes Magos, 6", "+34632695147");

        //Recorrer el vector creado y mostrar por pantalla
        // el nombre y edad de cada persona almacenada.
        System.out.println("\nNombre y edad de cada persona:\n");
        for (Persona persona : vectorPersonas) {
            System.out.println("Persona " + persona.getId() + ": " + persona.getNombre() + ", " + persona.getEdad() + " años.");
        }

        //Cambiar el nombre de dos personas. Mostrar por pantalla el antes
        System.out.println("\nPersonas a cambiar:\n ");
        System.out.println("Persona " + vectorPersonas[2].getId() + ": " + vectorPersonas[2].getNombre());
        System.out.println("Persona " + vectorPersonas[4].getId() + ": " + vectorPersonas[4].getNombre());

        //realizar el cambio
        vectorPersonas[2].setNombre("Samuel Carrascosa");
        vectorPersonas[4].setNombre("Beatriz Gonzalez");

        // mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados
        System.out.println("\nNombre y edad de las personas cambiadas:\n");
        System.out.println("Persona " + vectorPersonas[2].getId() + ": " + vectorPersonas[2].getNombre() + ", " + vectorPersonas[2].getEdad() + " años.");
        System.out.println("Persona " + vectorPersonas[4].getId() + ": " + vectorPersonas[4].getNombre() + ", " + vectorPersonas[4].getEdad() + " años.");


        //Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        System.out.println("\nPersonas mayores de 30 años:\n");
        for (Persona persona : vectorPersonas) {
            if (persona.getEdad() > 30) {
                System.out.println("Persona " + persona.getId() + ": " + persona.getNombre() + ", " + persona.getEdad() + " años.");
            }
        }
    }
}
