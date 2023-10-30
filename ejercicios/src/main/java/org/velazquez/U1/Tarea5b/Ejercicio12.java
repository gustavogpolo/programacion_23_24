package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;
        System.out.println("Introduzca el 1º número");
        a = sc.nextInt();
        System.out.println("Introduzca el 2º número");
        b = sc.nextInt();
        System.out.println("Introduzca el 3º número");
        c = sc.nextInt();
        if (a > b && b > c) {

            System.out.println("El orden es: " + a + ", " + b + ", " + c);

        } else if (a > c && c > b) {

            System.out.println("El orden es: " + a + ", " + c + ", " + b);

        } else if (b > a && a > c) {

            System.out.println("El orden es: " + b + ", " + a + ", " + c);

        } else if (c > a && a > b) {

            System.out.println("El orden es: " + c + ", " + a + ", " + b);

        } else if (b > c && c > a) {

            System.out.println("El orden es: " + b + ", " + c + ", " + a);

        } else if (c > b && b > a) {

            System.out.println("El orden es: " + c + ", " + b + ", " + a);

        }
    }
}
