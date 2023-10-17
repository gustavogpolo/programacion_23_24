package U1.Tarea7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;
        System.out.println("Introduzca el valor de \"A\"");
        a = sc.nextInt();
        System.out.println("Introduzca el valor de \"B\"");
        b = sc.nextInt();
        System.out.println("Valores iniciales: a = " + a + " b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Valores finales: a = " + a + " b = " + b);

    }
}
