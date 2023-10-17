package U1.Tarea5b;

import java.util.Scanner;

//Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("Introduzca el número entero deseado: ");
        a = sc.nextInt();
        sc.nextLine();
        int ult_cifra = a % 10;
        System.out.println("La última cifra de " + a + " es: " + ult_cifra);
    }
}
