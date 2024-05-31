package org.velazquez.Junio.Semana0;
// pide una frase y di si es palíndromo.

import java.util.Scanner;

// palíndromo es que se escribe de igual manera de alante hacia atrás que de atrás hacia delante
public class AV1Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = sc.nextLine();
        String frase_sin_espacios = "";
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            if (caracter != ' ') {
                frase_sin_espacios += caracter;
            }
        }

        String frase_reves = "";
        for (int i = frase_sin_espacios.length(); i > 0; i--) {
            caracter = frase_sin_espacios.charAt(i);
            frase_reves += caracter;
        }

        if (frase_sin_espacios.equalsIgnoreCase(frase_reves)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}
