package VERANO.LISTAS;

import java.util.HashSet;

//Crea un programa que gestione una lista de contactos únicos. Debe
//permitir agregar contactos y mostrar la lista sin duplicados
public class Ej3 {
    public static void main(String[] args) {
        HashSet<String> agenda = new HashSet<>();

        agenda.add("Curro");
        agenda.add("Fernando");
        agenda.add("Sergio");
        agenda.add("Salva");

        System.out.println("Agenda: ");
        int contador = 1;
        for ( String persona: agenda) {
            System.out.println("Contacto "+ contador++ +": " + persona);
        }


    }
}
