package org.velazquez;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
// Para que salgan datos por la pantalla
        System.out.print("Introduzca un número ");
// Para introducir datos "Scanner teclado = teclado.nextInt()"
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        System.out.print("El número entero introducido es: ");
        System.out.println(numero);
// Variable es la que cambia de número. Si ponemos primero para introducir el numero manualmente y despues asignamos un valor, primero sale el num introducido y despues el que asignamos nostos
        numero = 45;
        System.out.print("El número entero introducido es: ");
        System.out.println(numero);
// "String" es palabras

    }

}