package U1.Tarea5b;

import java.util.Scanner;

//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el numero del dia de la semana. ");
        int dia = teclado.nextInt();
        switch (dia) {

            case 1:

                System.out.println("Lunes");
                break;

            case 2:

                System.out.println("Martes");
                break;

            case 3:

                System.out.println("Miércoles");
                break;

            case 4:

                System.out.println("Jueves");
                break;

            case 5:

                System.out.println("Viernes");
                break;

            case 6:

                System.out.println("Sábado");
                break;

            case 7:

                System.out.println("Domingo");
                break;

            default:

                System.out.println("No existe ese dia mamerto. Introduce un número del 1 al 7");

        }
    }
}
