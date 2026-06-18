/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aaron
 */
public abstract class Persona {
    protected String nombre;
    protected String nacionalidad;
    protected LocalDate Fecha;

    public Persona(String nombre, String nacionalidad, LocalDate Fecha) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFecha() {
        return Fecha;
    }
    public int getEdad(){
        return Period.between(Fecha, LocalDate.now()).getYears();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha =Fecha ;
    }
    
}
