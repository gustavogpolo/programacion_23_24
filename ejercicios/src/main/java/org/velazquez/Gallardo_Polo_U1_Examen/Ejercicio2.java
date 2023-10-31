package org.velazquez.Gallardo_Polo_U1_Examen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_pos;
        int num0y2;
        System.out.println("Introduzca un número: ");
        num_pos = sc.nextInt();
        System.out.println("Introduzca el salto: ");
        num0y2 = sc.nextInt();
        do {
            System.out.println("Introduzca el salto: ");
            num0y2 = sc.nextInt();
        } while (num0y2 > 3);
        System.out.println("Resultado: ");
        for (int i = 1; i == num0y2; i++) {
            
        }
    }
}
