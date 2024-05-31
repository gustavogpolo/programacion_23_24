package org.velazquez.Junio.Semana0;

import java.util.Arrays;

// Crea un array y di si es capicua.
public class V1Ej23 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
        int[] array_reves = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            array_reves[i] = array[j];
        }
        if (Arrays.equals(array, array_reves)) {
            System.out.println("Es capicúa");
        } else {
            System.out.println("No es capicúa");
        }
    }
}
