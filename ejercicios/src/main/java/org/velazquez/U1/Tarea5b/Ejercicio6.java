package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio6 {
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

    }

}
