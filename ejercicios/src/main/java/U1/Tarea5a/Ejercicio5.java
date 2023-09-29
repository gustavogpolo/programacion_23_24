package U1.Tarea5a;

import java.util.Scanner;

//Ejercicio 5: Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el 1º número entero largo");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca el 2º número entero largo");
        int num2 = teclado.nextInt();
        System.out.println("Introduzca el 3º número entero largo");
        int num3 = teclado.nextInt();
        if ((num1 > num2) && (num1 > num3)) {

            System.out.println("El número " + num1 + " es el mayor");

        }
        if ((num2 > num1) && (num2 > num3)) {

            System.out.println("El número " + num2 + " es el mayor");
        }
        if ((num3 > num1) && (num3 > num2)) {

            System.out.println("El número " + num3 + " es el mayor");
        }
        if ((num1 == num2) || (num3 == num1) || (num2 == num3)) {

            System.out.println("Por favor no introduzca números iguales.");

        }


    }
}
