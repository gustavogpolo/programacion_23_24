package org.velazquez.Junio.Semana0;

// muestra los números del 1 - 100 que sean divisibles / 2 && 3
public class V1Ej8 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
