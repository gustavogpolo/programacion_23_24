package U1.Tarea3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Introduzca la longitud en millas: ");
        Scanner teclado = new Scanner(System.in);
        float millas = teclado.nextFloat();
        double equivalencia = (millas * 1.609);
        System.out.println("La equivalencia en km es: " + equivalencia + "km");
    }
}
