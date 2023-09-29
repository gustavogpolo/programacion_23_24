package U1.Tarea5b;
//Realiza un programa que pida una hora por teclado y que muestre luego buenos días,
// buenas tardes o buenas noches según la hora.
// Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
// respectivamente. Sólo se tienen en cuenta las
//horas, los minutos no se deben introducir por teclado.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca solo la hora, los minutos no ^^.");
        int hora = teclado.nextInt();
        if (hora >= 6 && hora < 12) {

            System.out.println("Buenos Días.");

        }
        if (hora >= 12 && hora <= 20) {

            System.out.println("Buenas tardes.");

        }
        if (hora >= 21 && hora <= 24) {

            System.out.println("Buenas noches.");

        }
        if (hora >= 1 && hora <= 5) {

            System.out.println("Buenas noches.");

        }

    }
}
