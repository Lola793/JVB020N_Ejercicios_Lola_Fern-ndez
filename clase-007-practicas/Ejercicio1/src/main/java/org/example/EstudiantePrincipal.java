package org.example;

import org.example.entities.Estudiante;

import java.util.List;

public class EstudiantePrincipal {
    public static void main(String[] args) {
        EstudianteJDBC estudianteJDBC = new EstudianteJDBC();

        Estudiante nuevoEstudiante = new Estudiante(1,"Lola Fernández", 45, 7.99);
        EstudianteJDBC.agregarEstudiante(nuevoEstudiante);

        List<Estudiante> estudiantes = EstudianteJDBC.obtenerEstudiantes();

        for (Estudiante estudiante : estudiantes) {
            System.out.println("ID: " + estudiante.getId() + "\n" + "Nombre: " + estudiante.getNombre()+ "\n" +
                    "Edad: " + estudiante.getEdad()+ "\n" + "Calificación: " + estudiante.getCalificacion()+ "\n");
        }
    }
}