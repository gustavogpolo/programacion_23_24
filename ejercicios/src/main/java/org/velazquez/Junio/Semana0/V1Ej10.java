package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Valida que un numero sea positivo
public class V1Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce un número positivo");
            numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("Error. El número debe ser positivo");
            }
        } while (numero < 0);
        System.out.println("El número es: " + numero);
    }
}
