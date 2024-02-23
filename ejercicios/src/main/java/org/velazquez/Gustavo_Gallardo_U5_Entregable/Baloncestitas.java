package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public class Baloncestitas extends Participante {
    private double estatura;

    public Baloncestitas(String nombre_participante, int edad) {
        super(nombre_participante, edad);
    }

    @Override
    public void hacer_juramento() {
        System.out.println("Yo XXXXXXX, como jugador de baloncesto, juro los valores deportivos mundiales");
    }
}
