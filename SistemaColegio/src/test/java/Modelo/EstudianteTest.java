/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 57323
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    @Test
    public void testCreacionYGettersEstudiante() {
        Fecha fecha = new Fecha(15, 8, 2005);
        Estudiante estudiante = new Estudiante("Ana Maria", "Carrera 5", "3119876543", fecha, "EST-101", "10A", 4.5);

        assertEquals("EST-101", estudiante.getCodigo());
        assertEquals("10A", estudiante.getCurso());
        assertEquals(4.5, estudiante.getPromedio(), 0.001);
        assertEquals("Ana Maria", estudiante.getNombre());
    }

    @Test
    public void testMostrarDatosEstudiante() {
        Fecha fecha = new Fecha(15, 8, 2005);
        Estudiante estudiante = new Estudiante("Ana Maria", "Carrera 5", "3119876543", fecha, "EST-101", "10A", 4.5);

        String datos = estudiante.mostrarDatos();
        assertTrue(datos.contains("EST-101"));
        assertTrue(datos.contains("10A"));
        assertTrue(datos.contains("4.5"));
    }
}