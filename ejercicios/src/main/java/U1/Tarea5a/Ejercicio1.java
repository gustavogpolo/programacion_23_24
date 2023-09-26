package U1.Tarea5a;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número que quiera.");
        float numero = teclado.nextFloat();
        if (numero > 0 || numero == 0) {

            System.out.println("El numero introducido es positivo");

        } else {

            System.out.println("El numero introducio es negativo.");

        }
    }
}
