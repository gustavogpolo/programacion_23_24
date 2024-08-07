package VERANO.POO.FUTBOL_HASHCODE.Clases;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Entrenador implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;
    private int anosExperiencia;
    private Equipo equipo;

    public Entrenador(String nombre, int edad, int anosExperiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.anosExperiencia = anosExperiencia;

    }


    public Entrenador(String nombre, int edad, int anosExperiencia, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.anosExperiencia = anosExperiencia;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", anosExperiencia=" + anosExperiencia +
                 "entrenador " + equipo.getNombre();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrenador that = (Entrenador) o;
        return edad == that.edad &&
                anosExperiencia == that.anosExperiencia &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre,edad, anosExperiencia);
    }


}
