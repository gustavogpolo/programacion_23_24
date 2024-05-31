package org.velazquez.Junio.Semana0;

import java.util.Arrays;

public class V1Ej24 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7, 8, 9, 10};
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Array uno: " + Arrays.toString(array1));
        System.out.println("Array dos: " + Arrays.toString(array2));
        System.out.println("Array fusionado: " + Arrays.toString(array3));
    }
}
