package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public class Lanzadores_Troncos extends Participante {
    private PRUEBA nombre_prueba;

    public Lanzadores_Troncos(String nombre_participante, int edad) {
        super(nombre_participante, edad);
    }

    @Override
    public void hacer_juramento() {
        System.out.println("Yo XXXXXX, como lanzador, juro los valores deportivos mundiales");
    }

    public void lanzar() {
        System.out.println("Voy a lanzar");
    }

    public enum PRUEBA {
        PINO, ROBLE, OLIVO
    }
}
