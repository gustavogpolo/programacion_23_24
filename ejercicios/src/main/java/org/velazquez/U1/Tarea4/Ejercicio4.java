package org.velazquez.U1.Tarea4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el numero decimal con coma: ");
        double decimal = teclado.nextFloat();
        System.out.println("El número entero más próximo a su numero decimal es: " + Math.round(decimal));

    }
}
