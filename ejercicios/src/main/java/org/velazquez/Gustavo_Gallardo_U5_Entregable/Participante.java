package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public abstract class Participante {
    protected String nombre_participante;
    private int edad;

    public Participante(String nombre_participante, int edad) {
        this.nombre_participante = nombre_participante;
        this.edad = edad;
    }

    public abstract void hacer_juramento();
}
