package org.velazquez.U1.Para_el_examenU1.Abecedario.abecedario;

public class M {
    public static void main(String[] args) {
        int altura = 7;

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
    }
}
