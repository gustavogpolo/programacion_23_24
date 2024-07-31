package VERANO.LISTAS;

import java.util.ArrayList;
import java.util.Arrays;

//Crea un programa que gestione una lista de tareas. Debería permitir
//agregar, eliminar y mostrar tareas.
public class Ej1 {
    public static void main(String[] args) {
        ArrayList<String> listadetareas = new ArrayList<>() ;

        listadetareas.add("Tarea1");
        listadetareas.add("Tarea1");
        listadetareas.add("Tarea2");
        listadetareas.add("Tarea3");

        System.out.println("Lista de tareas: " + listadetareas);

        listadetareas.remove("Tarea1");

        System.out.println("Lista de tareas actualizada: " + listadetareas);
    }
}
