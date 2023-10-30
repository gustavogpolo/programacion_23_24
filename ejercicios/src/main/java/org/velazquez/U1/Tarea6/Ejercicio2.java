package org.velazquez.U1.Tarea6;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número del 1-10");
        int dia = sc.nextInt();
        System.out.print("El número introducido es: ");
        switch (dia) {

            case 1:

                System.out.println("Uno");
                break;

            case 2:

                System.out.println("Dos");
                break;

            case 3:

                System.out.println("Tres");
                break;

            case 4:

                System.out.println("Cuatro");
                break;

            case 5:

                System.out.println("Cinco");
                break;

            case 6:

                System.out.println("Seis");
                break;

            case 7:

                System.out.println("Siete");
                break;

            case 8:

                System.out.println("Ocho");
                break;

            case 9:

                System.out.println("Nueve");
                break;

            case 10:

                System.out.println("Diez");
                break;

            default:

                System.out.println("Por favor introduzca un número del 1 al 10");
                break;


        }

    }
}
