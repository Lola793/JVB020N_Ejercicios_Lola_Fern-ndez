import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import Logic.Consultas;
import Logic.Agentes;

public class CentroAtencionClienteHilos {

    public static void main(String[] args) {
        String morado = "\u001B[35m";
        String verde = "\u001B[32m";
        String amarillo = "\u001B[33m";

        BlockingQueue<Consultas> llamadasQueue = new LinkedBlockingQueue<>();


        Agentes agente1 = new Agentes(morado + "Lola", llamadasQueue);
        Agentes agente2 = new Agentes(verde + "Gemma", llamadasQueue);
        Agentes agente3 = new Agentes(amarillo + "Salome", llamadasQueue);


        agente1.start();
        agente2.start();
        agente3.start();


        String[] consultas = {
                "Quiero saber si ya están los resultados de mis análisis.",
                "¿Puedo reprogramar mi cita para mis análisis?",
                "Necesito información sobre el tiempo de entrega de resultados.",
                "¿Cuál es el precio de TrisoNIM Plus?",
                "Tengo dudas sobre cómo prepararme para la amniocentesis.",
                "¿Como debo realizar el pago?",
                "¿Ofrecen servicio a domicilio para la toma de muestras?",
                "¿Los resultados se entregan online?"
        };

        for (int i = 0; i < consultas.length; i++) {
            Consultas llamada = new Consultas("Cliente" + (i + 1), consultas[i]);
            try {
                llamadasQueue.put(llamada);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            try {
                agente1.join();
                agente2.join();
                agente3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("0 llamadas en cola.");
        }
}

