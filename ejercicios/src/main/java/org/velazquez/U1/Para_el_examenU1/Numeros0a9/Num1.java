package org.velazquez.U1.Para_el_examenU1.Numeros0a9;


import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        int altura;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del número 1: ");
        altura = scanner.nextInt();

        // Imprimir el número 1
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (j == altura / 2 + 1 || (i == altura && j == altura / 2 + 1)) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
