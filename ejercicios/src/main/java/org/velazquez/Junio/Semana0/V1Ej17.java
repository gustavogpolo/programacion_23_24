package org.velazquez.Junio.Semana0;

import java.util.Random;

// Crea una función que genere un número aletorio entre 2 números inclusive;
public class V1Ej17 {
    public static void main(String[] args) {
        int aleatorio;
        for (int i = 0; i < 10; i++) {
            aleatorio = generaAleatorio(1, 10);
            System.out.println(aleatorio);
        }
    }

    public static int generaAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }
}
