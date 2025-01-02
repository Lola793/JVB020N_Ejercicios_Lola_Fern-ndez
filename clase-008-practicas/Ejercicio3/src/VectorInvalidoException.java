public class VectorInvalidoException extends Throwable {

    private int vectorDia;
    private int[] temperaturaDia;

    public VectorInvalidoException(int numeroDias) {
        this.temperaturaDia = new int[numeroDias];
    }

    public void almacenarTemperatura(int i, int temperaturaDia) {
        this.temperaturaDia[i] = temperaturaDia;
        System.out.println("\u001B[36m" + "Temperatura almacenada correctamente en el sistema." + "\u001B[0m");
    }


    public void accederTemperatura(int i) {
        try {
            double temperaturaDia = this.temperaturaDia[i];
            System.out.println("La temperatura del día " + (i + 1) + " fue de: " + temperaturaDia + "ºC.\n");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\u001B[31m" + "Error: Intento de acceso a una posición inválida en el vector.\n" + "\u001B[0m");
        }
    }
}

