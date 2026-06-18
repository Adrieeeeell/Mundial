/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrenadores;

import Personas.Persona;

/**
 *
 * @author Student
 */
public abstract class Entrenador extends Persona{
    
    private String Experiencia;

public Entrenador(String Experiencia, String nombre, String nacionalidad, String Fecha) {
        super(nombre, nacionalidad, Fecha);
        this.Experiencia = Experiencia;
    }
  
    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String Experiencia) {
        this.Experiencia = Experiencia;
    }

    @Override
    public String toString() {
        return "Entrenador"+getNombre()+"Nacionalidad"+getNacionalidad()+"Edad"+getFecha()+"Experiencia"+Experiencia;
    }
    
}
