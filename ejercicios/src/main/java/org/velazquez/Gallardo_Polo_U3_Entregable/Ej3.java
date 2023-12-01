package org.velazquez.Gallardo_Polo_U3_Entregable;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado mágico: ");
        int tam = sc.nextInt();

        int[][] matriz = new int[tam][tam];
        System.out.println("Introduce los elementos del cuadrado mágico: ");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println((cuadradoMagico(matriz) ? "es" : "no es") + " un cuadrado mágico.");
    }

    public static boolean cuadradoMagico(int[][] matriz) {
        int sumaMagica = 0;
        boolean filasMagicas[] = new boolean[matriz.length];
        boolean columnasMagicas[] = new boolean[matriz[0].length];

        // Obtener la suma mágica y almacenar las sumas de las filas y columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaMagica += matriz[i][j];
            }
            filasMagicas[i] = true;
            sumaMagica = 0;
        }

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaMagica += matriz[j][i];
            }
            columnasMagicas[i] = true;
            sumaMagica = 0;
        }

        // Comprobar si la matriz es un cuadrado mágico
        for (int i = 1; i < filasMagicas.length; i++) {
            if (filasMagicas[i] != filasMagicas[0]) {
                return false;
            }
        }

        for (int i = 1; i < columnasMagicas.length; i++) {
            if (columnasMagicas[i] != columnasMagicas[0]) {
                return false;
            }
        }

        return true;
    }
}

