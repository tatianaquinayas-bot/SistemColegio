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

public class FechaTest {

    @Test
    public void testToStringFecha() {
        Fecha fecha = new Fecha(27, 10, 2026);
        assertEquals("27/10/2026", fecha.toString());
    }
}