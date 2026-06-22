/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partidos;

import Arbitros.Arbitro;
import Resultados.Resultado;
import selecciones.Seleccion;

/**
 *
 * @author Student
 */
public class Partido {

    private Seleccion seleccionLocal;
    private Seleccion seleccionVisitante;
    private String estadio;
    private String fecha;
    private String hora;

    private Arbitro[] arbitros;
    private int contadorArbitros;

    private Resultado resultado;

    public Partido(Seleccion seleccionLocal,
                   Seleccion seleccionVisitante,
                   String estadio,
                   String fecha,
                   String hora,
                   int cantidadArbitros) {

        this.seleccionLocal = seleccionLocal;
        this.seleccionVisitante = seleccionVisitante;
        this.estadio = estadio;
        this.fecha = fecha;
        this.hora = hora;

        this.arbitros = new Arbitro[cantidadArbitros];
        this.contadorArbitros = 0;

        this.resultado = new Resultado();
    }
    public Seleccion getSeleccionLocal() {
        return seleccionLocal;
    }

    public Seleccion getSeleccionVisitante() {
        return seleccionVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    
    public int agregarArbitro(Arbitro arbitro,int contarArbitros){
        if (contadorArbitros < arbitros.length) {
            arbitros[contadorArbitros] = arbitro;
            contadorArbitros++;
        }return contarArbitros;
    }

    public void eliminarArbitro(Arbitro arbitro) {
        for (int i = 0; i < contadorArbitros; i++) {
            if (arbitros[i].getNombre().equals(arbitro.getNombre())) {
                arbitros[i] = arbitros[contadorArbitros - 1];
                arbitros[contadorArbitros - 1] = null;
                contadorArbitros--;
                break;
            }
        }
    }
    public int ContarArbitros(int contarArbitros){
        int contador=0;
        for (int i = 0; i < contadorArbitros; i++) {
            if (arbitros!=null) {
                contador++;
            }
        }
        return contador;
    }
     public Arbitro buscarArbitroPorNombre(String nombre) {
        for (int i = 0; i < contadorArbitros; i++) {
            if (arbitros[i].getNombre().equals(nombre)) {
                return arbitros[i];
            }
        }
        return null;
    }
     public boolean existeArbitro(String nombre){
         return buscarArbitroPorNombre(nombre)!=null;
     }
    
    //* buscar un arbitro por nombre,contar la cantidad de arbitros asignados, verificar si un arbitro ya se encuentra registrado en el partido*//

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "seleccionLocal=" + seleccionLocal +
                ", seleccionVisitante=" + seleccionVisitante +
                ", estadio='" + estadio + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", resultado=" + resultado +
                '}';
    }
}
