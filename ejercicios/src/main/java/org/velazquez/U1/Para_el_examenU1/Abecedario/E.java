package org.velazquez.U1.Para_el_examenU1.Abecedario;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        int altura = 5;
        Scanner sc = new Scanner(System.in);
        //letra E
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (j == 1 || i == 1 || i == altura / 2 + 1 || i == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
