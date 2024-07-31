package VERANO.LISTAS;

import java.util.LinkedList;

//Crea un programa que gestione la fila en un banco. Debe permitir agregar
//        personas a la fila, atender a la primera persona y mostrar la fila actual.
public class Ej2 {
    public static void main(String[] args) {
        LinkedList<String> fila_banco = new LinkedList<>();

        fila_banco.addLast("Salvador");
        fila_banco.addLast("Fernando");
        fila_banco.addLast("Curro");
        fila_banco.addLast("Sergio");
        fila_banco.addLast("Gustavo");

        System.out.println("Fila actual: " + fila_banco);
        System.out.println(" ");
        for (int i = 1; i < 6; i++) {
            System.out.println("Atendiendo a la primera persona...");
        }

        fila_banco.removeFirst();
        System.out.println(" ");
        System.out.println("Fila actual: " + fila_banco);
    }
}
