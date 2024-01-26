package org.velazquez.U4.Tarea1.ej9;

public class Maquinistas {

    private String nombre_completo;

    private String DNI;

    private double sueldo_mensual;

    private String rango;

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

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinistas{" +
                "nombre_completo='" + nombre_completo + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldo_mensual=" + sueldo_mensual +
                ", rango='" + rango + '\'' +
                '}';
    }
}
