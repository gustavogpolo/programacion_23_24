package U1.Tarea5a;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número y le diremos si es par o impar: ");
        double numero = teclado.nextInt();
        if ((numero % 2) == 0 || numero == 0) {

            System.out.println("El número introducido es par.");

        } else {

            System.out.println("El número introducido es impar");

        }
    }
}
