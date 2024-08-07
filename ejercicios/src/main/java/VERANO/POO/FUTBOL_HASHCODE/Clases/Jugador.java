package VERANO.POO.FUTBOL_HASHCODE.Clases;

import java.io.Serializable;
import java.util.Objects;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String posicion;
    private int numeroCamiseta;

    public Jugador() {
    }
    public Jugador(String nombre, String posicion, int numero_camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroCamiseta = numero_camiseta;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numeroCamiseta=" + numeroCamiseta +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return numeroCamiseta == jugador.numeroCamiseta &&
                Objects.equals(nombre, jugador.nombre) &&
                Objects.equals(posicion, jugador.posicion);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre, posicion, numeroCamiseta);
    }
}
