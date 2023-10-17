package U1.Tarea6;

import java.util.Scanner;

//OPERADOR TERNARIO :resultado = (condicion)?valor1:valor2;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduzca un número entero.");
        num = sc.nextInt();
        /*if (num % 2 == 0) {
            num = 1;
            System.out.println("Su número es: " + num);
        } else {
            num = 0;
            System.out.println("Su número es: " + num);
        }
        System.out.println();
        System.out.println();
        */
        num = (num % 2 == 0) ? 1 : 0;
        System.out.println("Su número es: " + num);
    }
}
