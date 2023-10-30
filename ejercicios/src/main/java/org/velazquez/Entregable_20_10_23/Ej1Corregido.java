package org.velazquez.Entregable_20_10_23;

public class Ej1Corregido {
    public static void main(String[] args) {
        //1º Altura
        int altura = 5;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (i == 1 || i == altura || i + j == altura + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
