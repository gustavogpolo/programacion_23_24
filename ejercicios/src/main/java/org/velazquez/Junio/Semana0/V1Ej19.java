package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Crea una función que dado un parámetro obtenga el número de la serie de fibonacci.
// Valida que la posición es mayor o igual que 1
public class V1Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = 0;
        do {
            System.out.println("introduce una posición mayor o igual que 1");
            posicion = sc.nextInt();
            if (posicion < 1) {
                System.out.println("Debes introducir un valor mayor o igual que uno");
            }
        } while (posicion < 1);
        int fibonacci = serieFibonacci(posicion);
        System.out.println("En la posición " + posicion + " está el número " + fibonacci);
    }

    public static int serieFibonacci(int posicion) {
        int num1 = 0;
        int num2 = 1;
        int suma = 1;

        for (int i = 1; i < posicion; i++) {
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        return suma;
    }
}
