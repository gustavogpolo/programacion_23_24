package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

// System.out.printf("La media es: %.númerof", media)
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la 1º nota. ");
        float nota1 = teclado.nextFloat();
        System.out.println("Introduzca la 2º nota. ");
        float nota2 = teclado.nextFloat();
        System.out.println("Introduzca la 3º nota. ");
        float nota3 = teclado.nextFloat();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("La media es: %.2f", media);
        if (media >= 0 && media < 5) {

            System.out.println(". La nota en el boletín es: Insuficiente");

        } else if (media == 5) {

            System.out.println(". La nota en el boletín es: Suficiente");
        } else if (media == 6) {

            System.out.println(". La nota en el boletin es: Bien");

        } else if (media > 6 && media < 9) {

            System.out.println(". La nota en el boletín es: Notable");

        } else if (media <= 10 && media >= 9) {

            System.out.println(". La nota en el boletín es: Sobresaliente");

        } else {

            System.out.println(". Por favor introduzca de manera correcta las notas.");

        }
    }
}
