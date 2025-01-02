package Logic;

import java.util.concurrent.BlockingQueue;

public class Agentes extends Thread {

    private String nombre;
    private BlockingQueue<Consultas> llamadasQueue;

    public Agentes(String nombre, BlockingQueue<Consultas> llamadasQueue) {
        this.nombre = nombre;
        this.llamadasQueue = llamadasQueue;
    }

    @Override
    public void run() {
        while (true) {
            Consultas llamada = null;
            try {
                llamada = llamadasQueue.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            atenderLlamada(llamada);
                if (llamadasQueue.isEmpty()) {
                    printInRed(nombre + " NO tiene llamadas.");
                    break;
                }
            }
        }


    private void atenderLlamada(Consultas llamada) {
        System.out.println(nombre + " atendiendo llamada de " + llamada.getCliente() +
                " - Consulta: " + llamada.getConsulta());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println(nombre + ": Error durante la atención de la llamada.");
        }
        System.out.println(nombre + " ha finalizado la llamada de " + llamada.getCliente());
    }

    private void printInRed(String mensaje) {
        String rojo = "\u001B[31m";
        String resetColor = "\u001B[0m";
        mensaje = mensaje.replace("\u001B[35m", "")
                .replace("\u001B[32m", "")
                .replace("\u001B[33m", "")
                .replace("\u001B[0m", "");

        System.out.println(rojo + mensaje + resetColor);
    }
}
