package org.velazquez.U4.Tarea1.ej9;

public class mecanicos {

    private String nombre_completo;

    private String especialidad;

    private long telefono;

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "mecanicos{" +
                "nombre_completo='" + nombre_completo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
