package org.example;

import org.example.entities.Estudiante;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.EstudianteConexionBD.connect;

public class EstudianteJDBC{

        public static void agregarEstudiante(Estudiante estudiante) {
        String query = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
        try (Connection conexion = connect();
             PreparedStatement pstmt = conexion.prepareStatement(query)) {
            pstmt.setString(1, estudiante.getNombre());
            pstmt.setInt(2, estudiante.getEdad());
            pstmt.setDouble(3, estudiante.getCalificacion());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public static List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String query = "SELECT * FROM estudiantes";
        try (Connection con = connect();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setId(rs.getInt("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setEdad(rs.getInt("edad"));
                estudiante.setCalificacion(rs.getDouble("calificacion"));
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
}