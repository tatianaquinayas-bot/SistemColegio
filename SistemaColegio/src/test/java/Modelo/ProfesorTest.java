/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest {

    @Test
    public void testCalcularSalarioSinHorasExtra() {
        Fecha fecha = new Fecha(10, 5, 1985);
        
        // 8 parámetros: nombre, dirección, teléfono, fecha, cédula, área, salarioHora (double), horasMes (int)
        Profesor profesor = new Profesor("Carlos", "Calle 10", "3001234567", fecha, "123456", "Matemáticas", 10000.0, 40);

        // Salario Base:10.000*40=400.000
        // Preparación(30%):400.000*0.30=120.000
        // Salario Total Esperado:520.000
        double salarioEsperado = 520000.0;

        assertEquals(salarioEsperado, profesor.calcularSalario(), 0.001);
    }

    @Test
    public void testCalcularPrestaciones() {
        Fecha fecha = new Fecha(10, 5, 1985);
        Profesor profesor = new Profesor("Carlos", "Calle 10", "3001234567", fecha, "123456", "Matemáticas", 10000.0, 40);

        // Salario Total=520.000
        // Prestaciones(19%):520.000*0.19=98.800
        double prestacionesEsperadas = 98800.0;

        assertEquals(prestacionesEsperadas, profesor.calcularPrestaciones(), 0.001);
    }
}