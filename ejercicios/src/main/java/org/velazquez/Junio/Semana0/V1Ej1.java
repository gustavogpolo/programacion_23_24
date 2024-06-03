package org.velazquez.Junio.Semana0;

import java.util.Scanner;

/* Pide un nombre y haz que te salude. */
public class V1Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre: ");
        String nombre = sc.next();
        System.out.println("¡Hola, " + nombre + "!");
    }


}
