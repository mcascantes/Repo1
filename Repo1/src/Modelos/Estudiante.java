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
public class Estudiante extends Persona{
    private int CarnetNumero;
    private int AnosEstudio;

    public Estudiante(int CarnetNumero, int AnosEstudio, int cedula, String nombre, String apellido, String genero, int telefono, String email) {
        super(cedula, nombre, apellido, genero, telefono, email);
        this.CarnetNumero = CarnetNumero;
        this.AnosEstudio = AnosEstudio;
    }

   
    public Estudiante() {
        
    }
    
    

    

    public int getCarnetNumero() {
        return CarnetNumero;
    }

    public void setCarnetNumero(int CarnetNumero) {
        this.CarnetNumero = CarnetNumero;
    }

    public int getAnosEstudio() {
        return AnosEstudio;
    }

    public void setAnosEstudio(int AnosEstudio) {
        this.AnosEstudio = AnosEstudio;
    }
    
    
    
}
