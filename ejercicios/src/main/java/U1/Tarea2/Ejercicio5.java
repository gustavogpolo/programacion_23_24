package U1.Tarea2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introduzca la temperatura en grados centígrados: ");
        Scanner teclado = new Scanner(System.in);
        double celsius = teclado.nextInt();
        System.out.println("La equivalencia en Farenheit es:");
        System.out.println((9 * celsius / 5) + 32);
    }
}
