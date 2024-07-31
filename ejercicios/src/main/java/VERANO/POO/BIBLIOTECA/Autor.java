package VERANO.POO.BIBLIOTECA;

public class Autor {
    private String nombre;
    private String nacionalidad;

    // CONSTRUCTOR DE LA CLASE AUTOR
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // SETTER Y GETTER DE AUTOR
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void mostrarinfoautor() {
        System.out.println("------------------------------");
        System.out.println("Nombre del autor: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("------------------------------");
    }
}
