package org.velazquez.Gallardo_Polo_U3_Recuperacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1, 2, 3, 0};
        System.out.println("Introduzca un valor: ");
        int valor = sc.nextInt();
        System.out.println("Introduzca una posicion en la que introducir el valor en el Array: ");
        int posicion = sc.nextInt();
        insertarValor(array1, valor, posicion);
    }

    public static int[] insertarValor(int[] array1, int valor, int posicion){
        int[] ArrayNuevo = new int[array1.length ];
        for (int i = 0; i < ArrayNuevo.length; i++) {
            if (posicion != i){
                ArrayNuevo[i] = array1 [i];
            } else if (posicion == i) {
                ArrayNuevo[i] = valor;
            }
        }
        System.out.println(Arrays.toString(ArrayNuevo));
        return ArrayNuevo;
    }
}
