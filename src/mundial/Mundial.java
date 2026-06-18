/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial;

/**
 *
 * @author Student
 */
public class Mundial {
    private String Nombre;
    private String Ano;
    private String Pais;

    public String getNombre() {
        return Nombre;
    }

    public String getAno() {
        return Ano;
    }

    public String getPais() {
        return Pais;
    }

    public Mundial(String Nombre, String Ano, String Pais) {
        this.Nombre = "Fifa World Cup";
        this.Ano = "2026";
        this.Pais = "Estados unidos/Canada/Mexico";
    }

    @Override
    public String toString() {
        return "Mundial{" + "Nombre=" + Nombre + ", Año=" + Ano + ", Pais=" + Pais + '}';
    }
    
}
