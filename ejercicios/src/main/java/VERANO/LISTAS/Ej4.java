package VERANO.LISTAS;

import java.util.LinkedHashSet;

// Crea un programa que gestione una lista de espera de pacientes. Debe
// permitir agregar pacientes y mostrar la lista en el orden de llegada.
public class Ej4 {
    public static void main(String[] args) {
        LinkedHashSet<String> listapacientes = new LinkedHashSet<>();
        int contador = 1;

        listapacientes.add("Gustavo");
        listapacientes.add("Curro");
        listapacientes.add("Sergio");
        listapacientes.add("Salva");
        listapacientes.add("Fernando");


        System.out.println("Lista de pacientes: " + listapacientes);
        for (String pacientes : listapacientes) {
            System.out.println("Paciente número " + contador + ": ");
            System.out.println(pacientes);
            System.out.print("Atendiendo paciente " + contador++ + " ");
            System.out.println("...");
        }
    }
}
