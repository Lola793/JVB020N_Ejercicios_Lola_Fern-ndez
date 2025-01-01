import entities.Animal;

public class AnimalesPrincipal {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero(1, "Chimpance", 3, "Pelo", "Omnivoro",
                4, "Vivíparo", "Marron", "Jungla");
        Ave ave = new Ave(2, "Buitre", 30, "Plumas", "Carroñero",
                2.8, "Planeo", "Marrón", "Gancho");
        Reptil reptil = new Reptil(3, "Vibora", 10, "Escamas", "Carnívoro",
                0.95, "Queratinizadas", "Citotóxco", "Bosque");

        Animal animal = new Animal();
        animal = reptil;

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();
    }
}


