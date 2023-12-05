package org.velazquez.U3.Examen_U3_GustavoGallardoPolo;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        System.out.println("Introduce los elementos de la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.next();
            }
            System.out.println();
        }
        System.out.print("Matriz: ");
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("Introduce los elementos de la fila: ");
        String[] fila = new String[3];
        for (int i = 0; i < 3; i++) {
            fila[i] = sc.next();
        }

        System.out.print("Fila: ");
        System.out.println(Arrays.deepToString(fila));

        System.out.print("Indique en que pocion quiere insertar la fila: ");
        int pos = sc.nextInt();

        insertarFilaEnMatriz(matriz, fila, pos);
    }

    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
        matriz = new String[4][3];
        for (int i = 0; i < pos; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = fila[i];
            }

        }

        return matriz;
    }
}
