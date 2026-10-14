/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 57323
 */
public class Persona {


    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected Fecha fechaNacimiento;



    public Persona(String nombre,
                   String direccion,
                   String telefono,
                   Fecha fechaNacimiento){


        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;

    }



    public String getNombre(){
        return nombre;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public String getDireccion(){
        return direccion;
    }


    public void setDireccion(String direccion){
        this.direccion = direccion;
    }


    public String getTelefono(){
        return telefono;
    }


    public void setTelefono(String telefono){
        this.telefono = telefono;
    }


    public Fecha getFechaNacimiento(){
        return fechaNacimiento;
    }


    public void setFechaNacimiento(Fecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }



    public String mostrarDatos(){

        return "Nombre: " + nombre +
                "\nDireccion: " + direccion +
                "\nTelefono: " + telefono +
                "\nNacimiento: " + fechaNacimiento;

    }

}