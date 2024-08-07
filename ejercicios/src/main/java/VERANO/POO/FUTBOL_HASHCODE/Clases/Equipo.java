package VERANO.POO.FUTBOL_HASHCODE.Clases;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private List<Jugador> jugadores;
    private Entrenador entrenador;

    public Equipo() {
    }

    public Equipo(String nombre, List<Jugador> jugadores, Entrenador entrenador) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", jugadores=" + jugadores +
                ", entrenador=" + entrenador.getNombre() +
                '}';
    }
}
