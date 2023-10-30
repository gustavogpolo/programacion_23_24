package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        float media = 0;
        int recu = 0;
        System.out.println("Introduzca la 1º nota");
        i = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca la 2º nota");
        j = sc.nextInt();
        sc.nextLine();
        media = (float) (i + j) / 2;
        if (media >= 5 && media <= 10) {

            System.out.println("Su nota es: " + media);

        } else {

            if (media < 5) {

                System.out.println("Cual ha sido el resultado de la recuperación?");
                System.out.println("1. Apto");
                System.out.println("2. No apto");
                recu = sc.nextInt();
                switch (recu) {

                    case 1:
                        System.out.println("Su nota es 5");
                        break;

                    case 2:
                        System.out.println("Su nota es: " + media);
                        break;

                    default:
                        System.out.println("Por favor introduzca un resultado válido.");

                }

            } else {

                if (media > 10) {

                    System.out.println("Introduzca dos notas válidas");

                }

            }

        }
    }
}
