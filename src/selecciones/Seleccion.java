/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selecciones;

import Entrenadores.Entrenador;
import Jugadores.Jugador;


/**
 *
 * @author HP
 */
public class Seleccion {

    public enum Grupo {
        A, B, C, D, E, F, G, H
    }

    private String nombre;
    private Grupo grupo;
    private Entrenador entrenador;
    private Jugador[] jugadores;
    private int contador;

    public Seleccion(String nombre, Grupo grupo, Entrenador entrenador, int capacidad) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenador = entrenador;
        this.jugadores = new Jugador[capacidad];
        this.contador = 0;
    }

    public void agregarJugador(Jugador jugador) {
        if (contador < jugadores.length) {
            jugadores[contador] = jugador;
            contador++;
        }
    }

    public void eliminarJugador(Jugador jugador) {
        for (int i = 0; i < contador; i++) {
            if (jugadores[i].equals(jugador)) {
                jugadores[i] = jugadores[contador - 1];
                jugadores[contador - 1] = null;
                contador--;
                break;
            }
        }
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    @Override
    public String toString() {
        return "Seleccion{" + "nombre=" + nombre + ", grupo=" + grupo + ", entrenador=" + entrenador + ", jugadores=" + jugadores + ", contador=" + contador + '}';
    }
    
}