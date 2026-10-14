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
import Modelo.Profesor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ControladorColegio {


    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> estudiantes;



    public ControladorColegio(){

        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();

    }



    // Registrar profesor

    public void registrarProfesor(Profesor profesor){

        profesores.add(profesor);

    }



    // Registrar estudiante

    public void registrarEstudiante(Estudiante estudiante){

        estudiantes.add(estudiante);

    }



    // Obtener estudiantes

    public ArrayList<Estudiante> getEstudiantes(){

        return estudiantes;

    }



    // Obtener profesores

    public ArrayList<Profesor> getProfesores(){

        return profesores;

    }




    // Reporte estudiantes

    public String reporteEstudiantes(){


        String reporte = "LISTA DE ESTUDIANTES\n\n";


        for(Estudiante e : estudiantes){


            reporte += e.mostrarDatos();
            reporte += "\n----------------------\n";

        }


        if(estudiantes.isEmpty()){

            reporte = "No hay estudiantes registrados.";

        }


        return reporte;

    }




    // Reporte profesores ordenados por salario

    public String reporteProfesores(){


        ArrayList<Profesor> listaOrdenada =
                new ArrayList<>(profesores);



        Collections.sort(listaOrdenada,
                new Comparator<Profesor>() {


            @Override
            public int compare(Profesor p1, Profesor p2) {


                return Double.compare(
                        p2.calcularSalario(),
                        p1.calcularSalario()
                );

            }

        });



        String reporte = "LISTA DE PROFESORES\n\n";



        for(Profesor p : listaOrdenada){


            reporte += p.mostrarDatos();

            reporte += "\n----------------------\n";


        }



        if(profesores.isEmpty()){

            reporte = "No hay profesores registrados.";

        }



        return reporte;

    }


}