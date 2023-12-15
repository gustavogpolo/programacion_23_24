package org.velazquez.U3.recuperacion_1tGustavo;

import java.util.Arrays;
import java.util.Random;

public class Ej1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] a = {111, 222, 333, 444};
        System.out.println(Arrays.toString(a));
        System.out.print("A continación se extraerá un número: ");
        int resultado = aleatorioDeArray(a);


    }

    public static int aleatorioDeArray(int[] a) {
        int aleatorio = (int) (Math.random() * 4);
        int posicion = 0;
        if (aleatorio == 0) {
            System.out.println("111");
        } else if (aleatorio == 1) {
            System.out.println("222");
        } else if (aleatorio == 2) {
            System.out.println("333");
        } else if (aleatorio == 3) {
            System.out.println("444");
        } else {
            System.out.println("x");
        }
        return aleatorio;
    }
}
