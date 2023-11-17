package org.velazquez.U3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de veces que quiere que rebote el eco: ");
        x = sc.nextInt();
        eco(x);
    }

    static void eco(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("Eco");
        }

    }
}

