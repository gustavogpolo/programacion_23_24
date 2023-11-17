package org.velazquez.Gallardo_Polo_U1_Examen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;

        while (true) {
            System.out.print("Introduce la altura (debe ser impar y mayor que 3): ");
            altura = sc.nextInt();

            if (altura % 2 == 1 && altura > 3) {
                break;
            } else {
                System.out.println("ERROR. La altura debe ser impar y mayor que 3.");
            }
        }


        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((j == 1 || j == altura) || ((i == j) && i + j <= altura + 1) || (i + j == altura + 1) && i <= j) {
                    System.out.print("*");
                } else {


                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("    ");

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (((i == j) && i + j <= altura + 1) || (i + j == altura + 1) && i <= j || (j == (altura + 1) / 2 && i > (altura + 1) / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
}
