package org.velazquez.Junio.Semana1.Trim2;

import java.util.Random;

public class Ej4 {
    public static void main(String[] args) {
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};
        Random random = new Random();

        // Generar el número de notas (múltiplo de 4, entre 4 y 28)
        int numNotas = (random.nextInt(7) + 1) * 4; // 4, 8, 12, ..., 28

        // Variables para la melodía
        String melodia = "";
        String primeraNota = notas[random.nextInt(notas.length)];
        String ultimaNota = primeraNota;

        // Añadir la primera nota
        melodia += primeraNota + " ";

        // Generar el resto de la melodía
        for (int i = 1; i < numNotas; i++) {
            // Añadir una barra cada 4 notas
            if (i % 4 == 0) {
                melodia += "| ";
            }

            // Generar una nota aleatoria
            String nota = notas[random.nextInt(notas.length)];

            // Añadir la nota a la melodía
            if (i == numNotas - 1) {
                // Asegurar que la última nota coincide con la primera
                nota = primeraNota;
            }
            melodia += nota + " ";
        }

        // Añadir el final de la melodía
        melodia += "| |";

        // Mostrar la melodía generada
        System.out.println(melodia);
    }
}


