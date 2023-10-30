package org.velazquez.U1.Tarea4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo de medias aritméticas.");
        System.out.println("Introduzca la primera nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduzca la segunda nota: ");
        double nota2 = teclado.nextDouble();
        double suma = (nota1 + nota2);
        if (suma <= 0) {
            System.out.println("La suma de las notas debe ser positiva.");
            return;
        } else {
            double media = suma / 2;
            System.out.println("La nota media es: " + media);
        }

    }
}
