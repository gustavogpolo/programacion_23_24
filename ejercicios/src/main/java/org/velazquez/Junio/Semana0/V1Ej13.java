package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Pide una frase por teclado, guarda los espacios e introducelos en una variable.
public class V1Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        String frase_sin_espacios = "";
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            if (caracter != ' ') {
                frase_sin_espacios += caracter;
            }
        }

        System.out.println("La frase sin espacios es: " + frase_sin_espacios);
    }
}
