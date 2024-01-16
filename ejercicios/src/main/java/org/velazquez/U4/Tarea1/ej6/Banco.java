package org.velazquez.U4.Tarea1.ej6;

import java.util.Objects;

public class Banco {
    //Declaración de variables.
    private final String nombre;

    private long capital;

    private String direccion;

    public Banco(String nombre, long capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCapital() {
        return capital;
    }

    public void setCapital(long capital) {
        this.capital = capital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", capital=" + capital +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
