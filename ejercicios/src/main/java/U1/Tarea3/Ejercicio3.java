package U1.Tarea3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor intruduzca el dividendo ");
        double dividendo = teclado.nextDouble();
        System.out.println("Por favor introduzca el divisor");
        double divisor = teclado.nextDouble();
        if (divisor == 0){
            System.out.println("No es posible dividir entre 0");
            return;
        }
        double cociente = (dividendo / divisor);
        System.out.print("El resultado de la división es: " );
        System.out.println (cociente);
        double resto = (dividendo % divisor);
        System.out.print("El resto de la división es : " );
        System.out.println(resto);
    }
}
