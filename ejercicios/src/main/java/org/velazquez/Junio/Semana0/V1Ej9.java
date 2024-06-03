package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Pide un número y muestra su tabla de multiplicar hasta el 10
public class V1Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número. ");
        int numero = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            int multiplicacion = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacion);
        }
    }
}
