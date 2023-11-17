package org.velazquez.Gustavo_Gallardo_U1_ExamenRec;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        int espacios = 5;

        while (true) {
            System.out.print("Introduce la altura (debe ser impar y mayor o igual que 3): ");
            altura = sc.nextInt();

            if (altura % 2 == 1 && altura >= 3) {
                break;
            } else {
                System.out.println("ERROR. La altura debe ser impar y mayor o igual que 3.");
            }
        }

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i + j == altura + 2 && i <= (altura / 2) + 2)
                        || (i > (altura / 2) + 1) && (j > 2)) {
                    System.out.print("*");
                } else {


                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
