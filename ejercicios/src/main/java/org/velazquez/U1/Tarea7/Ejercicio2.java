package org.velazquez.U1.Tarea7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, nivel_de_estudios, ingresos = 0;
        boolean jasp;
        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca su nivel de estudios: ");
        nivel_de_estudios = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca sus ingresos: ");
        ingresos = sc.nextInt();
        sc.nextLine();
        if (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000) {
            jasp = true;
        } else {
            jasp = false;
        }
        System.out.println("Jasp = " + jasp);
    }

}
