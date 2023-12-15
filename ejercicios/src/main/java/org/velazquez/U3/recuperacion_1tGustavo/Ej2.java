package org.velazquez.U3.recuperacion_1tGustavo;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(v1));
        System.out.println("Introduzca el entero que quiere introducir");
        int numero = sc.nextInt();
        int[] v2 = {numero};
        System.out.println("Introduzca la posición en la que quiere introducir el número");
        int pos = sc.nextInt();
        int[] resultado = insertarEnVector(v1, v2, pos);
        // Imprimir resultado
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        int[] resultado = new int[v1.length + v2.length];

        if (pos < 0) {
            return v1;
        } else if (pos > v1.length) {
            return v2;
        } else {
            int ind_resu = 0;
            for (int i = 0; i < pos; i++) {
                resultado[ind_resu] = v1[i];
                ind_resu++;
            }

            for (int j = 0; j < v2.length; j++) {
                resultado[ind_resu] = v2[j];
                ind_resu++;
            }

            for (int j = pos; j < v1.length; j++) {
                resultado[ind_resu] = v1[j];
                ind_resu++;
            }
        }
        return resultado;
    }
}