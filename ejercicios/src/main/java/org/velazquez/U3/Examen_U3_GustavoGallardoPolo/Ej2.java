package org.velazquez.U3.Examen_U3_GustavoGallardoPolo;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {6, 7, 8, 9};
        System.out.println("v1 = " + Arrays.toString(v1));
        System.out.println("v2 = " + Arrays.toString(v2));
        System.out.println("Introduzca en la posición en la que quiere introducir el vector 2 en el vector 1: ");
        int pos = sc.nextInt();
        insertarEnVector(v1, v2, pos);
    }

    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        int[] vectorinsertado = new int[10];
        if (pos < 0) {
            System.out.println("El resultado de insertarvector será: ");
            System.out.println(Arrays.toString(v1));
        } else if (pos > 5) {
            System.out.println("El resultdo de insertarvector será: ");
            System.out.println(Arrays.toString(v2));
        } else if (pos == 5) {
            System.out.println("El resultado de intertarvector será: ");
            int[] v3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(Arrays.toString(v3));
        }
        return vectorinsertado;
    }
}
