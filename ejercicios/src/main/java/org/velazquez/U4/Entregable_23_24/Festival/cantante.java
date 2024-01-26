package org.velazquez.U4.Entregable_23_24.Festival;

public class cantante {
    private String nombre_cantante;

    private String nombre_artistico;

    private int edad;

    private String ciudad_de_origen;

    private cancion cancion1;
    private cancion cancion2;

    public cantante(String nombre_cantante, String nombre_artistico, int edad, String ciudad_de_origen) {
        this.nombre_cantante = nombre_cantante;
        this.nombre_artistico = nombre_artistico;
        this.edad = edad;
        this.ciudad_de_origen = ciudad_de_origen;
        this.cancion1 = new cancion("Diamonds", 3, "Trap");
        this.cancion2 = new cancion("Marea", 4, "Neoperreo");
    }

    public String getNombre_cantante() {
        return nombre_cantante;
    }

    public void setNombre_cantante(String nombre_cantante) {
        this.nombre_cantante = nombre_cantante;
    }

    public String getNombre_artistico() {
        return nombre_artistico;
    }

    public void setNombre_artistico(String nombre_artistico) {
        this.nombre_artistico = nombre_artistico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad_de_origen() {
        return ciudad_de_origen;
    }

    public void setCiudad_de_origen(String ciudad_de_origen) {
        this.ciudad_de_origen = ciudad_de_origen;
    }
}
