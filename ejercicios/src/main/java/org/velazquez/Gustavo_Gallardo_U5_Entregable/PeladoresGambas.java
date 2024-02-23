package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public class PeladoresGambas extends Participante {
    private int peso_categoria;

    public PeladoresGambas(String nombre_participante, int edad) {
        super(nombre_participante, edad);
    }

    @Override
    public void hacer_juramento() {
        System.out.println("Yo XXXXXX, como pelador, juro los valores deportivos mundiales");
    }

    public void pelar() {
        System.out.println("Voy a pelar mis gambas");
    }
}
