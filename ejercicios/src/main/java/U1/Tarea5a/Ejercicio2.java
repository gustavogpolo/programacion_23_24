package U1.Tarea5a;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número 12: ");
        int numero12 = teclado.nextInt();
        if (numero12 == 12) {

            System.out.println("Enhorabuena!! Sabe escribir el numero 12");

        } else {

            System.out.print("El número introducido es: " + numero12);
            System.out.println(" lo siento, vuelva a intentarlo");

        }
    }
}
