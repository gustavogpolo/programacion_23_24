package org.velazquez.Para_el_examenU1.Abecedario.abecedario;

public class N {
    public static void main(String[] args) {
        int altura = 5;
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((j == 1 || j == altura) || (i == j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
