package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Pide 2 operandos, un operador y realiza la operación correspondiente
public class V1Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer operando:");
        System.out.println();
        int operando1 = sc.nextInt();
        System.out.print("Introduzca el segundo operando:");
        System.out.println();
        int operando2 = sc.nextInt();
        System.out.println("Introduce el operador (+, -, *, /.):");
        String operador = sc.next();
        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int multiplicacion = operando1 * operando2;
        double division = (double) operando1 / operando2;
        if (operador.equalsIgnoreCase("+")) {
            System.out.println("El resultado de la operación introducida es: " + operando1 + " + " + operando2 + " = " + suma);
        } else if (operador.equalsIgnoreCase("-")) {
            System.out.println("El resultado de la operación introducida es: " + operando1 + " - " + operando2 + " = " + resta);
        } else if (operador.equalsIgnoreCase("*")) {
            System.out.println("El resultado de la operación introducida es: " + operando1 + " * " + operando2 + " = " + multiplicacion);
        } else if (operador.equalsIgnoreCase("/")) {
            System.out.println("El resultado de la operación introducida es: " + operando1 + " / " + operando2 + " = " + division);
        } else {
            System.out.println("El operador introducido no es válido");
        }

    }
}
