package org.velazquez.Entregable_20_10_23;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();
        if (numero <= 0) {
            System.out.println("El número debe ser positivo. Por favor, inténtalo de nuevo.");
            return;
        }
        System.out.print("Introduce una cifra entre 0 y 9: ");
        int cifra = scanner.nextInt();
        if (cifra < 0 || cifra > 9) {
            System.out.println("La cifra debe estar en el rango de 0 a 9. Por favor, inténtalo de nuevo.");
            return;
        }
        scanner.close();
        String numeroStr = String.valueOf(numero);
        int count = 0;
        System.out.println("Ocurrencias de la cifra " + cifra + " en el número " + numero + ":");
        for (int i = 0; i < numeroStr.length(); i++) {
            char digito = numeroStr.charAt(i);
            if (digito - '0' == cifra) {
                count++;
                System.out.println("Posición " + (i + 1));
            }

            if (count == 0) {
                System.out.println("La cifra " + cifra + " no se encontró en el número " + numero);
            } else {
                System.out.println("Total de ocurrencias: " + count);
            }
        }
    }
}
