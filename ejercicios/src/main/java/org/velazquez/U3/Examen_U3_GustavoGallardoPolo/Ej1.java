package org.velazquez.U3.Examen_U3_GustavoGallardoPolo;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra que va a ser adivinada.");
        String cadena_a_adivinar = sc.next();

        System.out.println("Introduce una letra: ");
        String letra1 = sc.next();

        String resultado_parcial = "-----------";

        char letra = letra1.charAt(0);
//        do {
//            palabraAhorcado(cadena_a_adivinar, resultado_parcial, letra);
//        } while (String cadena_a_adivinar != resultado_parcial);

    }

    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra) {

        return resultado_parcial;
    }
}
