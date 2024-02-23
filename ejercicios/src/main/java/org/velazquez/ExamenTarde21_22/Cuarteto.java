package org.velazquez.ExamenTarde21_22;

public class Cuarteto extends Agrupacion {
    private int numero_miembros;
    private int puntos_obtenidos;

    public Cuarteto(String nombre, String autor, String autor_musicas, String autor_letras, String tipo) {
        super(nombre, autor, autor_musicas, autor_letras, tipo);
    }

    @Override
    public void cantar_la_presentacion(String nombre) {
        super.cantar_la_presentacion(nombre);
    }

    @Override
    public void hacer_tipo(String nombre, String tipo) {
        super.hacer_tipo(nombre, tipo);
    }
}
