/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resultados;

import selecciones.Seleccion;

public class Resultado {

    private Seleccion seleccionGanadora;
    private String marcador;

    public Resultado() {
        this.seleccionGanadora = null;
        this.marcador = "0-0";
    }

    public Resultado(Seleccion seleccionGanadora, String marcador) {
        this.seleccionGanadora = seleccionGanadora;
        this.marcador = marcador;
    }

    public Seleccion getSeleccionGanadora() {
        return seleccionGanadora;
    }

    public void setSeleccionGanadora(Seleccion seleccionGanadora) {
        this.seleccionGanadora = seleccionGanadora;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "seleccionGanadora=" + seleccionGanadora +
                ", marcador='" + marcador + '\'' +
                '}';
    }
}
