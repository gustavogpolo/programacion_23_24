package VERANO.POO.BIBLIOTECA;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        //Esto lo he tenido que buscar porque nunca he usado ARRAYLIST
        this.libros = new ArrayList<>();
    }

    public void agregarlibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarlibro(Libro libro) {
        libros.remove(libro);
    }

    public void mostrarinformacionlibros() {
        System.out.println("****************************** BIBLIOTECA 1 ******************************");
        for (Libro libro : libros) {
            libro.mostrarinfolibro();
        }
    }
}
