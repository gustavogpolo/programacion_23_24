package U1.Tarea6;

import java.util.Scanner;

//Crea un programa que pida al usuario el número de un mes y
// escriba el nombre de ese mes. Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el número de un mes");
        int mes = teclado.nextInt();
        System.out.print("El mes introducido es: ");
        switch (mes) {

            case 1:
                System.out.println("Enero");
                break;

            case 2:
                System.out.println("Febrero");
                break;

            case 3:
                System.out.println("Marzo");
                break;

            case 4:
                System.out.println("Abril");
                break;

            case 5:
                System.out.println("Mayo");
                break;

            case 6:
                System.out.println("Junio");
                break;

            case 7:
                System.out.println("Julio");
                break;

            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Septiebre");
                break;

            case 10:
                System.out.println("Octubre");
                break;

            case 11:
                System.out.println("Noviembre");
                break;

            case 12:
                System.out.println("Diciembre");
                break;

            default:
                System.out.println("No existe ese mes");
                break;

        }

    }
}
