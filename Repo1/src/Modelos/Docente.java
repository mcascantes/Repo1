/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author laboratorio
 */
public class Docente extends Persona{
    private String Especialidad;

    public Docente(String Especialidad, int cedula, String nombre, String apellido, String genero, int telefono, String email) {
        super(cedula, nombre, apellido, genero, telefono, email);
        this.Especialidad = Especialidad;
    }

    public Docente() {
    }
    
    

    public Docente(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    
}


