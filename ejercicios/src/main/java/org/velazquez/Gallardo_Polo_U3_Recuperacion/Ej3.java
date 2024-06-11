package org.velazquez.Gallardo_Polo_U3_Recuperacion;

import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Escribe un numero entero: ");
        int dimension = sc.nextInt();
        int[][] matriz = new int[dimension][dimension];

        // Rellenar la matriz con números aleatorios entre 100 y 200
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(100,200) ; // Números aleatorios entre 100 y 200
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz de: " + dimension + " x " + dimension );
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(" ");

        numPicos(matriz);
    }
    public static void numPicos (int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > matriz[i++][j] && matriz[i][j] > matriz[i++][j++] && matriz[i][j] > matriz[i][j++] && matriz[i][j] > matriz[i--][j] && matriz[i][j] > matriz[i--][j--] && matriz[i][j] > matriz[i][j--]){
                    System.out.println("Números mayores que todos sus adyacentes: ");
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
