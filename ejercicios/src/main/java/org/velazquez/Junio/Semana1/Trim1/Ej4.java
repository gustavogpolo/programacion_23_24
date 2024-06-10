package org.velazquez.Junio.Semana1.Trim1;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la altura al usuario
        System.out.println("Por favor, introduzca la altura de la X: ");
        int altura = 5;

        // Verificar si la altura es un número impar mayor o igual a 3
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Error: La altura debe ser un número impar mayor o igual a 3.");
        } else {
            // Dibujar la X
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura; j++) {
                    // Poner asteriscos en las posiciones correctas
                    if (j == i || j == altura - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
