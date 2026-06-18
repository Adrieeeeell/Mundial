/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugadores;
import java.time.LocalDate;
import Personas.Persona;

/**
 *
 * @author UTN
 */
public class Jugador extends Persona {
    private final int numero;
    private String posicion;

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Jugador(String nombre, String nacionalidad, LocalDate fecha, int numero, String posicion) {
        super(nombre, nacionalidad, fecha);
        this.numero = numero;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador \nNombre: " + getNombre() +
               "\nNacionalidad: " + getNacionalidad() +
                "\nEdad: " + getEdad() + "\nNumero: " +
                this.numero + "\nPosicion: " + this.posicion;
    }
    
    
    
    
}
