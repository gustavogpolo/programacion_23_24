package org.velazquez.U3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Introduzca los dos números enteros: ");
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        sc.nextLine();
        numeros(a, b);
    }

    public static void numeros(int a, int b) {
        int contador = 0;
        while (a > contador) {
            contador = b;
            contador++;
            System.out.println(contador);
            b++;
        }
        while (b > contador) {
            contador = a;
            contador++;
            System.out.println(contador);
            a++;
        }
        if (a == b) {
            System.out.println("Introduzca dos números diferentes");
        }
    }
}
