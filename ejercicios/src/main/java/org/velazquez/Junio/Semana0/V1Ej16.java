package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Pide un número y calcula su factorial. Factorial = !n = n*n-1*n-2...*1
public class V1Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para calcular su factorial: ");
        int numero = sc.nextInt();

        int factorial = factorial(numero);

        System.out.println("El facorial de " + numero + " es " + factorial);
    }

    public static int factorial(int n) {
        int factorial = n;
        for (int i = n - 1; i > 1; i--) {
            factorial *= i;
        }

        return factorial;
    }
}
