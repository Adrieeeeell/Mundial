/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selecciones;
 
import jugadores.Jugador;
import Entrenadores.Entrenador;
<<<<<<< HEAD
 
=======
import Jugadores.Jugador;

>>>>>>> origin/Dev
/**
 *
 * @author UTN
 */
public class Seleccion {
 
    public enum Grupo {
        A, B, C, D, E, F, G, H
    }
 
    private String nombre;
    private Grupo grupo;
    private Entrenador entrenador;
    private final Jugador[] jugadores = new Jugador[26];
 
    public Seleccion(String nombre, Grupo grupo, Entrenador entrenador) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenador = entrenador;
    }
<<<<<<< HEAD
 
    public String getNombre() { return nombre; }
    public Grupo getGrupo() { return grupo; }
    public Entrenador getEntrenador() { return entrenador; }
 
    public Jugador getJugador(int i) {
        return jugadores[i];
    }
 
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setGrupo(Grupo grupo) { this.grupo = grupo; }
    public void setEntrenador(Entrenador entrenador) { this.entrenador = entrenador; }
 
    public void setJugador(int i, Jugador jugador) {
        jugadores[i] = jugador;
    }
 
    public boolean agregarJugador(Jugador jugador) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = jugador;
                return true;
=======

    public String getNombre() {
        return nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public int getContador() {
        return contador;
    }

    public void agregarJugador(Jugador jugador) {
        if (contador < jugadores.length) {
            jugadores[contador] = jugador;
            contador++;
        }
    }

    public void eliminarJugador(Jugador jugador) {
        for (int i = 0; i < contador; i++) {
            if (jugadores[i].getNombre().equals(jugador.getNombre())) {
                jugadores[i] = jugadores[contador - 1];
                jugadores[contador - 1] = null;
                contador--;
                break;
>>>>>>> origin/Dev
            }
        }
        System.out.println("No hay espacio disponible en la seleccion.");
        return false;
    }
 
    public Jugador buscarPorNombre(String nombre) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getNombre().equalsIgnoreCase(nombre)) {
                return jugadores[i];
            }
        }
        return null;
    }
 
    public Jugador buscarPorCamiseta(int numero) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getNumero() == numero) {
                return jugadores[i];
            }
        }
        return null;
    }
 
    public int contarJugadores() {
        int cuenta = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                cuenta++;
            }
        }
        return cuenta;
    }
 
    public boolean existeCamiseta(int numero) {
        return buscarPorCamiseta(numero) != null;
    }
 
    @Override
    public String toString() {
        return "Seleccion \nNombre: " + nombre +
               "\nGrupo: " + grupo +
               "\nEntrenador: " + entrenador.getNombre() +
               "\nJugadores registrados: " + contarJugadores();
    }
<<<<<<< HEAD
}
=======

}
>>>>>>> origin/Dev
