package U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("Introduzca la altura de la pirámide:");
        a = sc.nextInt();
        System.out.println("Introduzca el caracter con el que se hará la pirámide");
        String c;
        c = sc.next();
        System.out.println();
        for (int altura = 1; altura <= a; altura++) {
            //Espacios en blanco
            for (int blancos = 1; blancos <= a - altura; blancos++) {
                System.out.print(" ");
            }

            //Asteriscos
            for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                System.out.print(c);
            }
            System.out.println();


        }
    }
}

