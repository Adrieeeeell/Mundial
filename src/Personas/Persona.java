/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Aaron
 */
public abstract class Persona {
    protected String nombre;
    protected String nacionalidad;
    protected String Fecha;

    public Persona(String nombre, String nacionalidad, String Fecha) {
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

    public String getFecha() {
        return Fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}
