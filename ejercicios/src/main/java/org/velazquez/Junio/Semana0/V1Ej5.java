package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Pide 3 números e indica cuál es mayor
public class V1Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        System.out.println("Introduzca el primer número : ");
        numero1 = sc.nextInt();
        System.out.println("Introduzca el segundo número : ");
        numero2 = sc.nextInt();
        System.out.println("Introduzca el tercer número : ");
        numero3 = sc.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El " + numero1 + " es el mayor");
        } else if (numero2 >= numero3) {
            System.out.println("El " + numero2 + " es el mayor");
        } else {
            System.out.println("El " + numero3 + " es el mayor");
        }
    }
}
