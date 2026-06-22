/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial;

import Partidos.Partido;
import selecciones.Seleccion;

/**
 *
 * @author Student
 */
public class Mundial {

    private String Nombre;
    private String Ano;
    private String Pais;

    private Seleccion[] selecciones;
    private int contadorSelecciones;

    private Partido[] partidos;
    private int contadorPartidos;

    public String getNombre() {
        return Nombre;
    }

    public String getAno() {
        return Ano;
    }

    public String getPais() {
        return Pais;
    }

    public Mundial(int capacidadSelecciones, int capacidadPartidos) {
        this.Nombre = "Fifa World Cup";
        this.Ano = "2026";
        this.Pais = "Estados unidos/Canada/Mexico";

        this.selecciones = new Seleccion[capacidadSelecciones];
        this.contadorSelecciones = 0;

        this.partidos = new Partido[capacidadPartidos];
        this.contadorPartidos = 0;
    }



    public void agregarSeleccion(Seleccion seleccion) {
        if (contadorSelecciones < selecciones.length) {
            selecciones[contadorSelecciones] = seleccion;
            contadorSelecciones++;
        }
    }

    public void eliminarSeleccion(Seleccion seleccion) {
        for (int i = 0; i < contadorSelecciones; i++) {
            if (selecciones[i].getNombre().equals(seleccion.getNombre())) {
                selecciones[i] = selecciones[contadorSelecciones - 1];
                selecciones[contadorSelecciones - 1] = null;
                contadorSelecciones--;
                break;
            }
        }
    }

    public Seleccion buscarSeleccionPorNombre(String nombre) {
        for (int i = 0; i < contadorSelecciones; i++) {
            if (selecciones[i].getNombre().equals(nombre)) {
                return selecciones[i];
            }
        }
        return null;
    }

    public int contarSelecciones() {
        return contadorSelecciones;
    }

    public boolean seleccionInscrita(Seleccion seleccion) {
        for (int i = 0; i < contadorSelecciones; i++) {
            if (selecciones[i].getNombre().equals(seleccion.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public Seleccion[] obtenerSeleccionesPorGrupo(Seleccion.Grupo grupo) {
        int cantidad = 0;
        for (int i = 0; i < contadorSelecciones; i++) {
            if (selecciones[i].getGrupo() == grupo) {
                cantidad++;
            }
        }

        Seleccion[] resultado = new Seleccion[cantidad];
        int indice = 0;
        for (int i = 0; i < contadorSelecciones; i++) {
            if (selecciones[i].getGrupo() == grupo) {
                resultado[indice] = selecciones[i];
                indice++;
            }
        }
        return resultado;
    }



    public void agregarPartido(Partido partido) {
        if (contadorPartidos < partidos.length) {
            partidos[contadorPartidos] = partido;
            contadorPartidos++;
        }
    }

    public void eliminarPartido(Partido partido) {
        for (int i = 0; i < contadorPartidos; i++) {
            if (partidos[i].getSeleccionLocal().getNombre().equals(partido.getSeleccionLocal().getNombre())
                    && partidos[i].getSeleccionVisitante().getNombre().equals(partido.getSeleccionVisitante().getNombre())
                    && partidos[i].getFecha().equals(partido.getFecha())) {
                partidos[i] = partidos[contadorPartidos - 1];
                partidos[contadorPartidos - 1] = null;
                contadorPartidos--;
                break;
            }
        }
    }

    public int contarPartidos() {
        return contadorPartidos;
    }

    public Partido[] obtenerPartidosPorSeleccion(Seleccion seleccion) {
        int cantidad = 0;
        for (int i = 0; i < contadorPartidos; i++) {
            if (partidos[i].getSeleccionLocal().getNombre().equals(seleccion.getNombre())
                    || partidos[i].getSeleccionVisitante().getNombre().equals(seleccion.getNombre())) {
                cantidad++;
            }
        }

        Partido[] resultado = new Partido[cantidad];
        int indice = 0;
        for (int i = 0; i < contadorPartidos; i++) {
            if (partidos[i].getSeleccionLocal().getNombre().equals(seleccion.getNombre())
                    || partidos[i].getSeleccionVisitante().getNombre().equals(seleccion.getNombre())) {
                resultado[indice] = partidos[i];
                indice++;
            }
        }
        return resultado;
    }

    public Partido[] buscarPartidosPorFecha(String fecha) {
        int cantidad = 0;
        for (int i = 0; i < contadorPartidos; i++) {
            if (partidos[i].getFecha().equals(fecha)) {
                cantidad++;
            }
        }

        Partido[] resultado = new Partido[cantidad];
        int indice = 0;
        for (int i = 0; i < contadorPartidos; i++) {
            if (partidos[i].getFecha().equals(fecha)) {
                resultado[indice] = partidos[i];
                indice++;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Mundial{" + "Nombre=" + Nombre + ", Año=" + Ano + ", Pais=" + Pais + ", Selecciones=" + contadorSelecciones + ", Partidos=" + contadorPartidos + '}';
    }

}
