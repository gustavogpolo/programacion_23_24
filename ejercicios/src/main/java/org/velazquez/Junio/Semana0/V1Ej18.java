package org.velazquez.Junio.Semana0;

import java.util.Random;
import java.util.Scanner;

// Genera una función que genere un password de una longitud X con números, mayúsculas y minúsculas combinadas.
public class V1Ej18 {
    String password = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la longitud de su contraseña: ");
        int longitud = sc.nextInt();

        String password = generapassword(longitud);

        System.out.println("El password generado es: " + password);
    }

    public static int generaAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }

    public static String generapassword(int longitud) {

        String password = "";
        char caracter = 0;
        for (int i = 0; i < longitud; i++) {
            int tipo = generaAleatorio(1, 3);
            switch (tipo) {
                case 1 -> caracter = (char) generaAleatorio('A', 'Z');
                case 2 -> caracter = (char) generaAleatorio('a', 'z');
                case 3 -> caracter = (char) generaAleatorio('0', '9');
            }
            password += caracter;
        }
        return password;
    }

}
