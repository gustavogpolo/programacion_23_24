package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("Introduzca un número para saber si es divisible entre 5");
        a = sc.nextInt();
        if ((a % 5) == 0) {

            System.out.println(a + " Es divisible entre 5");

        } else {

            System.out.println("El número no es divisible entre 5");

        }
    }
}
