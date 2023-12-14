package org.velazquez.Gallardo_Polo_U3_Entregable;

import java.util.Arrays;

public class Ej2 {
    public static void main(String[] args) {

        System.out.println(duplicados(new int[]{12, 10, 12, 45, 67})); // devuelve true
        System.out.println(duplicados(new int[]{11, 12, 13, 14, 15, 16})); // devuelve false
        System.out.println(Arrays.toString(eliminaDuplicados(new int[]{12, 10, 12, 45, 67}))); // devuelve [12,10,45,67]
        System.out.println(Arrays.toString(eliminaDuplicados(new int[]{11, 12, 11, 14, 15, 11}))); // devuelve [11,12,14,15]
    }

    public static boolean duplicados(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] eliminaDuplicados(int[] numeros) {
        boolean[] duplicados = new boolean[numeros.length];
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicados[i] = true;
                    contador++;
                    break;
                }
            }
        }
        int[] numerosSinDuplicados = new int[numeros.length - contador];
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (!duplicados[i]) {
                numerosSinDuplicados[indice++] = numeros[i];
            }
        }
        return numerosSinDuplicados;
    }
}