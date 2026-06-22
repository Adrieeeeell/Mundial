/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resultados;
import selecciones.Seleccion;

public class Resultado {

    private Seleccion seleccionLocal;
    private Seleccion seleccionVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Resultado() {
        this.seleccionLocal = null;
        this.seleccionVisitante = null;
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }

    public Resultado(Seleccion seleccionLocal,Seleccion seleccionVisitante, int golesLocal, int golesVisitante ) {
        this.seleccionLocal = seleccionLocal;
        this.seleccionVisitante = seleccionVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Seleccion getSeleccionLocal(){ 
        return seleccionLocal; 
    }
    
    public void setSeleccionLocal(Seleccion seleccionLocal){
        this.seleccionLocal = seleccionLocal;
    }

    public Seleccion getSeleccionVisitante(){ 
        return seleccionVisitante; 
    }
    
    public void setSeleccionVisitante(Seleccion seleccionVisitante) {
        this.seleccionVisitante = seleccionVisitante;
    }

    public int getGolesLocal(){ 
        return golesLocal; 
    }
    
    public void setGolesLocal(int golesLocal){
        this.golesLocal = golesLocal; 
    }

    public int getGolesVisitante(){
        return golesVisitante; 
    }
    
    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
    public boolean esEmpate(){
        return golesLocal == golesVisitante;
    }
    
    public int diferenciaGoles(){
        return Math.abs(golesLocal - golesVisitante);
    }
    
    public int totalGoles(){
        return golesLocal + golesVisitante;
    }
    
    public boolean ambosMarcaron(){
        return golesLocal > 0 && golesVisitante > 0;
    }
    
    public Seleccion getSeleccionGanadora() {
        if (esEmpate()) return null;
        return golesLocal > golesVisitante ? seleccionLocal : seleccionVisitante;
    }
    
    public String getMarcador() {
        return golesLocal + "-" + golesVisitante;
    }

    @Override
    public String toString() {
        String ganador = esEmpate()
                ? "Empate"
                : "Ganador: " + getSeleccionGanadora();

        return "Resultado{" +
                "marcador=" + getMarcador() +
                ", totalGoles=" + totalGoles() +
                ", diferencia=" + diferenciaGoles() +
                ", ambosMarcaron=" + ambosMarcaron() +
                ", " + ganador +
                '}';
    }
}
