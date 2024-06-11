package org.velazquez.Junio.Semana0;

import java.util.Scanner;

/*
Pide dos números por teclado e indica si el segundo es divisible por el primero.

Ej: Si numero1=10 y numero2=5 debría mostrar: "El número 5 es divisible de 10"
 */
public class V1Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        System.out.println("Número 1:");
        int num1 = sc.nextInt();
        System.out.println("Número 2:");
        int num2 = sc.nextInt();
        if (num1 % num2 == 0) {
            System.out.println(num2 + " es divisible de " + num1);
        } else {

            System.out.println(num2 + " no es divisible de " + num1);
        }
    }
}
