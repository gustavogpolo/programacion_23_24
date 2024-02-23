package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public class Baloncesto extends Deportes {
    private int numero_equipos;

    public Baloncesto(DEPORTES nombre_deporte, String nombre_pabellon, int numero_equipos) {
        super(nombre_deporte, nombre_pabellon);
        this.numero_equipos = numero_equipos;
    }

    public void encestar() {
        System.out.println("2 puntos !!!!!");
    }
}
