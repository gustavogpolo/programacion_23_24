package VERANO.LISTAS;

import java.util.TreeMap;
import java.util.TreeSet;

//: Crea un programa que gestione una lista de libros y los muestre ordenados
//        alfabéticamente.
public class Ej5 {
    public static void main(String[] args) {
        TreeSet<String> librosordenados = new TreeSet<>();
        int contador = 1;

        librosordenados.add("La Sombra del Futuro");
        librosordenados.add("Luces de bohemia");
        librosordenados.add("Crimen y castigo");
        librosordenados.add("100 años de Soledad");
        librosordenados.add("La casa de los espíritus");
        librosordenados.add("Preludio a la fundación");
        librosordenados.add("La colmena");
        librosordenados.add("La tierra baldías");
        librosordenados.add("Don Quijote de la mancha");
        librosordenados.add("La divina comedia");

        System.out.println("Libros odenador alfabéricamente. ");
        for (String libro: librosordenados) {
            System.out.println(contador++ + ". " + libro);
        }
    }
}
