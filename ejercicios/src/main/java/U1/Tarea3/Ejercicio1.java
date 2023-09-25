package U1.Tarea3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduzca los números de dos cifras que quiera sumar:");
        Scanner teclado = new Scanner(System.in);
        byte num1 = teclado.nextByte();

        if (num1 <=9|| num1 >=100) {

            System.out.println("El numero introducido no es de dos cifras");
            return;
        }

        byte num2 = teclado.nextByte();

        if (num2 <=9|| num2 >=100) {

            System.out.println("El numero introducido no es de dos cifras");
            return;
        }

        int suma = num1 + num2;

        System.out.println("El resultado de la suma es: " );
        System.out.println(suma);
    }
}
