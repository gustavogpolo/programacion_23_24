package org.velazquez.U3.Examen_U3_GustavoGallardoPolo;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public class ej4 {
        public static void main(String[] args) {
            //
            String[][] matriz = {
                    {"a", "b", "c"},
                    {"d", "e", "f"},
                    {"g", "h", "i"}
            };
            String[] fila = {"j", "k", "l"};
            int pos = 1;

            mostrarMatriz(matriz);

            System.out.println();

            String[][] resultado = insertarFilaEnMatriz(matriz, fila, pos);

            // mostrar matriz
            mostrarMatriz(resultado);
        }

        public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {

            String[][] resultado = new String[matriz.length + 1][matriz[0].length];
            int j = 0;
            for (int i = 0; i < resultado.length; i++) {
                if (i == pos) {
                    resultado[i] = fila;
                } else {
                    resultado[i] = matriz[j];
                    j++;
                }
            }
            return resultado;
        }

        public static void mostrarMatriz(String[][] matriz) {
            for (String[] strings : matriz) {
                System.out.println(Arrays.toString(strings));
            }
        }
    }
}