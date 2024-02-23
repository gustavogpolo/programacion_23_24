package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public class LanzaTroncosPelaos extends Deportes {
    private int numero_pruebas;

    public LanzaTroncosPelaos(DEPORTES nombre_deporte, String nombre_pabellon, int numero_pruebas) {
        super(nombre_deporte, nombre_pabellon);
        this.numero_pruebas = numero_pruebas;
    }
}
