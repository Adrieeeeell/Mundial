 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbitros;

import Personas.Persona;
import java.time.LocalDate;



/**
 *
 * @author Aaron
 */
public class Arbitro extends Persona {
 
    private String categoria;
 
    public Arbitro(String nombre, String nacionalidad, LocalDate fecha, String categoria) {
        super(nombre, nacionalidad, fecha);
        this.categoria = categoria;
    }
 
    public String getCategoria() {
        return categoria;
    }
 
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
 
    @Override
    public String toString() {
        return "Arbitro" + getNombre() + "Nacionalidad" + getNacionalidad()
                + "Edad" + getEdad() + "Categoria" + categoria;
    }
}
 
