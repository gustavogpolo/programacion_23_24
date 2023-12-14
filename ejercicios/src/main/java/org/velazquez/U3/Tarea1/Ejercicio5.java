package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenas, este programa calcula el número mayor de 3 opciones con una función.");
        System.out.println("Indique el primer numero: ");
        long n1 = sc.nextLong();
        System.out.println("Indique el segundo numero: ");
        long n2 = sc.nextLong();
        System.out.println("Indique el tercer número");
        long n3 = sc.nextLong();
        mayor_menor(n1, n2, n3);

    }

    static void mayor_menor(long n1, long n2, long n3) {
        if (n1 == n2 && n1 == n3) {
            System.out.println(n1 + " , " + n2 + " y " + n3 + " son tres números iguales.");
        } else if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " Es mayor que " + n2 + " y " + n3);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " Es mayor que " + n1 + " y " + n3);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " Es mayor que " + n1 + " y " + n2);
        }


    }
}

