package U1.Tarea2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduzca el dividendo: ");
//Para que permita al usuario introducir datos
        Scanner teclado = new Scanner(System.in);
        double numero1 = teclado.nextDouble();
        System.out.print("El dividendo introducido es: ");
        System.out.println(numero1);
        System.out.println("Introduzca el divisor: ");
        double numero2 = teclado.nextDouble();
        System.out.println("El divisor introducido es: ");
        System.out.println(numero2);
        System.out.println("El resultado de la división es: ");
        System.out.println(numero1 / numero2 );
    }
}
