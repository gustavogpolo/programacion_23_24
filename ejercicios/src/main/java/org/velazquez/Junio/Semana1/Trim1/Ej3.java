package org.velazquez.Junio.Semana1.Trim1;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que introduzca la altura de la U
        System.out.println("Introduzca la altura de la U: ");
        int altura = 7;

        // Valida la altura ingresada
        if (altura < 3) {
            System.out.println("La altura debe ser al menos 3.");
            return;
        }

        // Pinta los lados de la U
        for (int i = 0; i < altura - 1; i++) {
            System.out.print("*"); // Primer asterisco de la fila
            for (int j = 0; j < altura; j++) {
                System.out.print(" "); // Espacios entre asteriscos
            }
            System.out.println("*"); // Último asterisco de la fila
        }

        // Pinta la base de la U con curvatura
        System.out.print(" "); // Espacio al inicio
        for (int i = 0; i < altura - (altura - 2); i++) {
            System.out.print("* "); // Asteriscos en la base con espacios entre ellos
        }
        System.out.println("*"); // Último asterisco sin espacio adicional
    }
}