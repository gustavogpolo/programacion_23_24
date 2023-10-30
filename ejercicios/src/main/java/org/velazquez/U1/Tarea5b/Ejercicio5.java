package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa soluciona ecuaciones de 1º grado del tipo ax + b = 0 ");
        System.out.println("Introduzca el valor \"a\"");
        double a = teclado.nextDouble();
        System.out.println("Introduzca el valor \"b\"");
        double b = teclado.nextDouble();
        double solucion = ((-b) / a);
        System.out.println("La solución es: " + solucion);

    }
}
