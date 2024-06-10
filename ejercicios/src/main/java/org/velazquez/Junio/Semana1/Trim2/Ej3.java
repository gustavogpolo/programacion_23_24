package org.velazquez.Junio.Semana1.Trim2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar 10 números al usuario
        System.out.println("Por favor, introduzca 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar el contenido del array junto al índice
        System.out.println("\nContenido del array:");
        System.out.printf("%-10s%-10s\n", "Indice", "Número");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-10d\n", i, numeros[i]);
        }

        // Crear un array para almacenar los números reorganizados
        int[] reorganizado = new int[10];
        int indexPrimos = 0;
        int indexNoPrimos = 0;

        // Separar primos y no primos
        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i])) {
                reorganizado[indexPrimos++] = numeros[i];
            }
        }
        indexNoPrimos = indexPrimos;
        for (int i = 0; i < 10; i++) {
            if (!esPrimo(numeros[i])) {
                reorganizado[indexNoPrimos++] = numeros[i];
            }
        }

        // Mostrar el array resultante
        System.out.println("\nArray con primos al inicio:");
        System.out.printf("%-10s%-10s\n", "Indice", "Número");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-10d\n", i, reorganizado[i]);
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