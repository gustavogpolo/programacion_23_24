package VERANO.POO.SISTEMA_DE_BIBLIOTECA;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.getInstance();

        Libro libro1 = null;
        Libro libro2 = null;
        try {
            libro1 = new Libro(2, "El Quijote");
            libro2 = new Libro(2, "Sancho Panza");
            Revista revista1 = new Revista(2, "National Geographic");

            biblioteca.agregarElemento(libro1);
            biblioteca.agregarElemento(revista1);

            try {
                Libro libroDuplicado = new Libro(3, "dfgyhuji");
                biblioteca.agregarElemento(libroDuplicado);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            for (ElementoBiblioteca elemento : biblioteca.getElementosbiblioteca()) {
                ((Imprimible) elemento).imprimir();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operaciones de biblioteca completadas.");
        }
        ComparadorPorId comparador = new ComparadorPorId();
        int resultado = comparador.compare(libro1,libro2);
        if (resultado < 0){
            System.out.println(libro1.getTitulo() +  " tiene un id menor que " + libro2.getTitulo());
        } else{
            System.out.println(libro2.getTitulo() + " tiene un id menor que " + libro1.getTitulo());
        }
    }
}

