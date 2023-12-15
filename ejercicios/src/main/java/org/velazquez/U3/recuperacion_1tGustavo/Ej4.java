package org.velazquez.U3.recuperacion_1tGustavo;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la posición que quiere buscar ");
        int posicion = sc.nextInt();
        int[][] n = {};
        System.out.println(nEsimo(n, posicion));
    }

    public static int nEsimo(int[][] n, int posicion) {
        // contador ++; if contador == posicion {
        Scanner teclado = new Scanner(System.in);
        int max = 100;
        int min = 10;
        int contador = 0;
        System.out.println("Introduce las filas del array: ");
        int filas = teclado.nextInt();
        System.out.println("Introduce las columnas del array: ");
        int columnas = teclado.nextInt();
        n = new int[filas][columnas];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = (int) (Math.random() * (max + 1) - min) + min;
                System.out.print(n[i][j]);
                System.out.print(" | ");
            }

            System.out.println();
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                contador++;
                if (contador == posicion) {
                    n[i][j] = contador;
                }
            }
            System.out.println();
        }
        return contador;
    }
}
