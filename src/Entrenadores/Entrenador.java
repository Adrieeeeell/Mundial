/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrenadores;

import Personas.Persona;
import java.time.LocalDate;
/**
 *
 * @author Student
 */
public abstract class Entrenador extends Persona{
    
    private int Experiencia;

public Entrenador(int Experiencia, String nombre, String nacionalidad, LocalDate Fecha) {
        super(nombre,nacionalidad,Fecha);
        this.Experiencia = Experiencia;
    }
  
    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    @Override
    public String toString() {
        return "Entrenador"+getNombre()+"Nacionalidad"+getNacionalidad()+"Edad"+getEdad()+"Experiencia"+Experiencia;
    }
    
}
