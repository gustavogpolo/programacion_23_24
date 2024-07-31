package VERANO.BUCLES;

import java.util.Random;
public class Ej7 {
    public static void main(String[] args) {
        Random random = new Random();
        int suma = 0;
        int peso;
        for (int i = 1; i < 16; i++) {
            peso = random.nextInt(51)+80;
            System.out.println("Peso del jugador " + i + " = " + peso);
            suma += peso;
        }
        System.out.print("Peso total del equipo de rugby: ");
        System.out.println(suma);
    }
}
