package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// pide una frase un cuenta cuántas vocales tiene
public class V1Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase. ");
        String frase = sc.nextLine().toLowerCase();

        char caracter;
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            switch (caracter) {
                case 'a', 'e', 'i', 'o', 'u' -> contador++;
            }
        }
        System.out.println("Hay " + contador + " vocales");
    }
}
