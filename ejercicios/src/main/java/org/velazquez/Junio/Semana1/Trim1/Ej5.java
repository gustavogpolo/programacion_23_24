package org.velazquez.Junio.Semana1.Trim1;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.println("Por favor, introduzca un número entero positivo: ");
        int numero = 17;

        // Verificar que el número es positivo
        if (numero <= 0) {
            System.out.println("Error: El número debe ser entero y positivo.");
        } else {
            // Mostrar los 5 números consecutivos e indicar si son primos o no
            for (int i = numero; i < numero + 5; i++) {
                if (esPrimo(i)) {
                    System.out.println(i + " es primo");
                } else {
                    System.out.println(i + " no es primo");
                }
            }
        }
    }

    // Método para comprobar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
