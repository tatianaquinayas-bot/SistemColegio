/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 57323
 */
public class Estudiante extends Persona {


    private String codigo;
    private String curso;
    private double promedio;



    public Estudiante(String nombre,
                      String direccion,
                      String telefono,
                      Fecha fechaNacimiento,
                      String codigo,
                      String curso,
                      double promedio){


        super(nombre,direccion,telefono,fechaNacimiento);


        this.codigo = codigo;
        this.curso = curso;
        this.promedio = promedio;

    }



    public String getCodigo(){
        return codigo;
    }


    public void setCodigo(String codigo){
        this.codigo = codigo;
    }



    public String getCurso(){
        return curso;
    }


    public void setCurso(String curso){
        this.curso = curso;
    }



    public double getPromedio(){
        return promedio;
    }


    public void setPromedio(double promedio){
        this.promedio = promedio;
    }



    @Override
    public String mostrarDatos(){


        return super.mostrarDatos()
                + "\nCodigo: " + codigo
                + "\nCurso: " + curso
                + "\nPromedio: " + promedio;

    }

}