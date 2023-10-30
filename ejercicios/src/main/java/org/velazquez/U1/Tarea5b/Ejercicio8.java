package org.velazquez.U1.Tarea5b;
// Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
//
//Ejemplo 1:
//Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//Por favor, introduzca el valor de a: 2
//Ahora introduzca el valor de b: 1
//x = -0.5

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double resul1, resul2;

        System.out.println("Introduce la variable \"a\"");
        double a = teclado.nextDouble();
        System.out.println("Introduce la variable \"b\"");
        double b = teclado.nextDouble();
        System.out.println("Introduce la variable \"c\"");
        double c = teclado.nextDouble();
        double discriminante = (Math.pow(b, 2) - 4 * a * c);
        System.out.println("discriminante: " + discriminante);

        if (discriminante == 0) {

            System.out.println("La ecuacion tiene solucion doble");
            double solucion_doble = -b / 2 * a;
            System.out.println("Tiene como solución " + solucion_doble);
        }
        if (discriminante > 0) {

            System.out.println("La ecuación tiene dos soluciones reales diferentes");
            double real1 = (-b + (Math.sqrt(discriminante))) / (2 * a);
            double real2 = (-b - (Math.sqrt(discriminante))) / (2 * a);
            System.out.println("La 1º solución es: " + real1);
            System.out.println("La 2º solución es: " + real2);
        }
        if (discriminante < 0) {

            System.out.println("La ecuación no tiene solución real.");
        }
    }
}
