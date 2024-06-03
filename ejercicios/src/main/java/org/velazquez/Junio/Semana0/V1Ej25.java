package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Indica si un elemento existe en un array usando una función
public class V1Ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Introduce un valor: ");
        int elemento = sc.nextInt();

        if (existeElemento(array, elemento)) {
            System.out.println("El elemento " + elemento + " existe");
        } else {
            System.out.println("El elemento " + elemento + " no existe");
        }
    }

    public static boolean existeElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {

                return true;
            }
        }
        return false;
    }
}
