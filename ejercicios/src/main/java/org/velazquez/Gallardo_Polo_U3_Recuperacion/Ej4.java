package org.velazquez.Gallardo_Polo_U3_Recuperacion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Escribe un numero entero: ");
        int dimension = 4;
        int[][] matriz = new int[dimension][dimension];

        // Rellenar la matriz con números aleatorios entre 100 y 200
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(100,200) ; // Números aleatorios entre 100 y 200
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz de: " + dimension + " x " + dimension );
        System.out.println("---------------");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------");
        eliminarFilasPares(matriz);
        System.out.println("---------------");
        eliminarFilasImpares(matriz);
        System.out.println("---------------");
    }

    public static int[][] eliminarFilasPares(int[][] matriz){
        int[][] nueva_matriz = new int[matriz.length][matriz.length];

        System.out.println("Eliminar filas Pares: ");
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i % 2 == 0 ){
                    nueva_matriz[i][j] = matriz[i][j] ;
                }
            }
        }


        for (int i = 0; i < nueva_matriz.length; i++) {
            for (int j = 0; j < nueva_matriz.length; j++) {
                System.out.print(nueva_matriz[i][j] + "\t");
            }
            System.out.println();
        }

        return nueva_matriz;
    }

    public static int[][] eliminarFilasImpares(int[][] matriz){
        int[][] nueva_matriz = new int[matriz.length][matriz.length];

        System.out.println("Eliminar filas Impares: ");
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i % 2 != 0 ){
                    nueva_matriz[i][j] = matriz[i][j] ;
                }
            }
        }


        for (int i = 0; i < nueva_matriz.length; i++) {
            for (int j = 0; j < nueva_matriz.length; j++) {
                System.out.print(nueva_matriz[i][j] + "\t");
            }
            System.out.println();
        }

        return nueva_matriz;
    }
}
