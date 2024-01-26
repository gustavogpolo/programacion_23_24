package org.velazquez.U4.Tarea1.ej9;

public class jefes {

    private String nombre_completo;

    private String DNI;

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "jefes{" +
                "nombre_completo='" + nombre_completo + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
