package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public class PeladoDeGambas extends Deportes {
    private int numero_puestos;

    public PeladoDeGambas(DEPORTES nombre_deporte, String nombre_pabellon, int numero_puestos) {
        super(nombre_deporte, nombre_pabellon);
        this.numero_puestos = numero_puestos;
    }
}
