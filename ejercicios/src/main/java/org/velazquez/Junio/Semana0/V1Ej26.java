package org.velazquez.Junio.Semana0;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Crea una función que guarde en un array números aleatorios entre un mínimo y un máximo.
public class V1Ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un máximo: ");
        int max = sc.nextInt();

        System.out.println("Introduzca un mínimo: ");
        int min = sc.nextInt();

        int[] array = new int[10];

        rellenarArrayAleatorios(array, max, min);

        System.out.println("Array aleatorio: " + Arrays.toString(array));
    }

    public static int guardasNumerosaleatorios(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }

    public static void rellenarArrayAleatorios(int[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            array[i] = guardasNumerosaleatorios(min, max);
        }

    }
}
