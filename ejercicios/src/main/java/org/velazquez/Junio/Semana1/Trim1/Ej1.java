package org.velazquez.Junio.Semana1.Trim1;

// Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número n: ");
        int n = 3; //sc.nextInt();
        imprimirPiramide(n);
    }

    public static void imprimirPiramide(int n) {
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir números ascendentes
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Imprimir números descendentes
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
    }
}
