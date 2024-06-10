package org.velazquez.Junio.Semana1.Trim2;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedir al usuario el ancho y el alto de la pecera (mínimo 4x4)
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = scanner.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = scanner.nextInt();

        // Generar las coordenadas del pececito de forma aleatoria
        int filaPez = random.nextInt(altura - 2) + 1; // Evitar colocar el pez en el borde superior o inferior
        int columnaPez = random.nextInt(anchura - 2) + 1; // Evitar colocar el pez en el borde izquierdo o derecho

        // Generar la pecera con el pececito
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                // Si estamos en el borde de la pecera, pintamos *
                if (i == 0 || i == altura - 1 || j == 0 || j == anchura - 1) {
                    System.out.print("* ");
                } else if (i == filaPez && j == columnaPez) {
                    // Si estamos en la posición del pececito, pintamos &
                    System.out.print("& ");
                } else {
                    // Si no, pintamos un espacio en blanco
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
