package org.velazquez.Junio.Semana2.Trim1;

import java.util.Random;

public class Ej2 {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];
        Random random = new Random();

        // Rellenar la matriz con números aleatorios entre 200 y 300
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(100,200) ; // Números aleatorios entre 100 y 200
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz de 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Variables para la diagonal
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;

        System.out.println("\nNúmeros en la diagonal principal:");
        for (int i = 0; i < 10; i++) {
            int num = matriz[i][i];
            System.out.print(num + " ");
            suma += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        double media = suma / 10.0;

        // Mostrar el máximo, mínimo y media de la diagonal
        System.out.println("\n\nMáximo en la diagonal: " + max);
        System.out.println("Mínimo en la diagonal: " + min);
        System.out.println("Media de la diagonal: " + media);
    }
}

