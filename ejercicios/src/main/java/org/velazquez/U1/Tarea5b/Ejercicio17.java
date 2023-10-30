package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

//Escribe un programa que diga cuál es la
//primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int resto = 0;
        int invertido = 0;
        int digito1 = 0;
        System.out.println("Introduzca el número del que quiera saber su primera cifra");
        a = sc.nextInt();
        while (a > 0) {
            resto = a % 10;
            invertido = invertido * 10 + resto;
            a /= 10;
        }
        while (invertido > 0) {

            digito1 = invertido % 10;

        }
        System.out.println("El primer dígito del número introducido es: " + digito1);
    }
}
