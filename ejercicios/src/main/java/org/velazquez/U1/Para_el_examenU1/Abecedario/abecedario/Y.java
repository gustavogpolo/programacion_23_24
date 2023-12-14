package org.velazquez.U1.Para_el_examenU1.Abecedario.abecedario;

public class Y {
    public static void main(String[] args) {
        int altura = 7;

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
