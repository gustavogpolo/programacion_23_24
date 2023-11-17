package org.velazquez.Gustavo_Gallardo_U1_ExamenRec;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor introduzca un número entero positivo: ");
        long num_pos = sc.nextLong();
        long cociente = num_pos;
        long invertido = 0;

        while (cociente != 0) {
            invertido = invertido * 10 + cociente % 10;
            cociente = cociente / 10;
        }

        if (invertido == num_pos) {
            System.out.println("El número " + num_pos + " es capicua.");
        } else {
            System.out.println("El número " + num_pos + " no es capicua");
        }

    }
}
