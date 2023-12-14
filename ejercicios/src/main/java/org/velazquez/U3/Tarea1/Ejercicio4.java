package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenas, este programa calcula el número mayor de dos opciones con una función.");
        System.out.println("Indique el primer numero: ");
        long n1 = sc.nextLong();
        System.out.println("Indique el segundo numero: ");
        long n2 = sc.nextLong();
        mayor_menor(n1, n2);

    }

    static void mayor_menor(long n1, long n2) {
        if (n1 == n2) {
            System.out.println(n1 + " Y " + n2 + " son dos números iguales.");
        } else if (n1 > n2) {
            System.out.println(n1 + " Es mayor que " + n2);
        } else {
            System.out.println(n2 + " Es mayor que " + n1);
        }

    }
}
