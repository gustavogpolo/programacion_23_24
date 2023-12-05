package org.velazquez.U3.Examen_U3_GustavoGallardoPolo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Realiza un programa que muestre por pantalla un array bidimensional con tantas filas y columnas como indique el usuario.
        // Deberá rellenarse la matriz con números aleatorios entre 14 y 78 (ambos incluidos).

        //Definimos la clase scanner
        Scanner sc = new Scanner(System.in);
        int pares[];
        int impares[];
        //Pedimos al usuario qe introduzca los valores de filas y de columnas
        System.out.println("Introduzca el número de filas: ");
        int filas = sc.nextInt();
        System.out.println("Introduzca el número de columnas: ");
        int columnas = sc.nextInt();

        //Definimos los límites de los números aleatórios.
        int limite_superior = 78;
        int limite_inferior = 14;

        //Conduce a la funcion llamada generar matriz.
        int[][] matriz = generarMatriz(filas, columnas, limite_superior, limite_inferior);
        System.out.println("Matriz: " + Arrays.deepToString(matriz));
        System.out.println();

//        matriz
//        System.out.println("Pares: " + pares());
//        System.out.println("Impares: " + impares());
        System.out.println("Suma de pares: ");
        System.out.println("Suma de impares: ");
        System.out.println("Media de pares: ");
        System.out.println("Media de impares: ");
        System.out.println("Máximo de pares: ");
        System.out.println("Mínimo de pares: ");
        System.out.println("Máximo de impares: ");
        System.out.println("Mínimo de impares: ");


    }

    public static int[][] generarMatriz(int filas, int columnas, int limite_superior, int limite_inferior) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(limite_superior - limite_inferior + 1) + limite_inferior;
            }
        }
        return matriz;


    }
}
