package U1.Tarea2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Introduzca la distancia en millas: ");
        Scanner teclado = new Scanner(System.in);
        double millas = teclado.nextDouble();
        System.out.print("La equivalencia en metros es: ");
        System.out.println(millas * 1609);
    }
}
