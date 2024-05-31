package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// pide una frase por teclado y cuenta cuántas mayúsculas y minúsculas hay.
public class V1Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        int contador_mayus = 0;
        int contador_minus = 0;
        char caracter;
        // tabla ascii
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);

            if (caracter >= 'A' && caracter <= 'Z') {
                contador_mayus++;
            } else if (caracter >= 'a' && caracter <= 'z') {
                contador_minus++;
            }
        }
        System.out.println("Hay " + contador_mayus + " mayúsculas");
        System.out.println("Hay " + contador_minus + " minúsculas");
    }
}
