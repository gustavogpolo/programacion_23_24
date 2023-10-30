package org.velazquez.U1.Tarea5a;


/*Ejercicio 4: Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el 1º número entero: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca el 2º número entero: ");
        int num2 = teclado.nextInt();
        if ((num1 % 2) == 0 && (num2 % 2) == 0) {

            System.out.println("Los 2 números introducidos son pares");

        } else {

            System.out.println("Sólo 1 de los numeros introducidos es par.");

        }

    }
}
