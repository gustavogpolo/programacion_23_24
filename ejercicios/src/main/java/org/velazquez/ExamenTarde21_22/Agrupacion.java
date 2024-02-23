package org.velazquez.ExamenTarde21_22;

public abstract class Agrupacion {
    private String nombre;
    private String autor;
    private String autor_musicas;
    private String autor_letras;
    private String tipo;


    public Agrupacion(String nombre, String autor, String autor_musicas, String autor_letras, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_musicas = autor_musicas;
        this.autor_letras = autor_letras;
        this.tipo = tipo;
    }

    public void cantar_la_presentacion(String nombre) {
        System.out.println("Cantando la presentacion de la" /*Chirigota/coro/lo que sea*/ + " con nombre:" + nombre);
    }

    public void hacer_tipo(String nombre, String tipo) {
        System.out.println(/*La chirigota/coro/ lo que sea*/ nombre + " va de " + tipo);
    }
}
