/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author 57323
 */

import Modelo.Estudiante;
import Modelo.Fecha;
import Modelo.Profesor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorColegioTest {

    @Test
    public void testReporteEstudiantesVacio() {
        ControladorColegio controlador = new ControladorColegio();
        assertEquals("No hay estudiantes registrados.", controlador.reporteEstudiantes());
    }

    @Test
    public void testReporteProfesoresOrdenadosPorSalario() {
        ControladorColegio controlador = new ControladorColegio();
        Fecha fecha = new Fecha(1, 1, 1990);

        // Profesor 1: Salario Total = 10000 * 10 * 1.30 = 130.000
        Profesor profGanaMenos = new Profesor("Pedro", "Calle 1", "111", fecha, "101", "Sistemas", 10000.0, 10);
        
        // Profesor 2: Salario Total = 20000 * 40 * 1.30 = 1.040.000
        Profesor profGanaMas = new Profesor("Lucia", "Calle 2", "222", fecha, "102", "Física", 20000.0, 40);

        controlador.registrarProfesor(profGanaMenos);
        controlador.registrarProfesor(profGanaMas);

        String reporte = controlador.reporteProfesores();

        // El reporte debe listar primero al profesor con mayor salario (Lucía) antes que Pedro
        int posLucia = reporte.indexOf("Lucia");
        int posPedro = reporte.indexOf("Pedro");

        assertTrue(posLucia < posPedro, "El profesor con mayor salario debe aparecer primero en el reporte");
    }
}