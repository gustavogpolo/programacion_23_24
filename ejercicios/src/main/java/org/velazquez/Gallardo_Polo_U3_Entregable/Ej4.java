package org.velazquez.Gallardo_Polo_U3_Entregable;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = sc.nextLine();

        int numFilas = (int) Math.ceil((double) cadena.length() / 5);
        String matriz[][] = new String[numFilas][5];

        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < 5; j++) {
                if (i * 5 + j < cadena.length()) {
                    matriz[i][j] = String.valueOf(cadena.charAt(i * 5 + j));
                } else {
                    matriz[i][j] = " ";
                }
            }
        }

        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

