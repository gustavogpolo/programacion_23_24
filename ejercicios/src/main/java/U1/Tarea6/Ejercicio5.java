package U1.Tarea6;

import java.util.Scanner;

//Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y a continuación muestre
// un pequeño menú con 3 opciones:
//1.Calcular diámetro 2.Calcular perímetro 3.Calcular área
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = 0;
        int dec = 0;
        double diametro = 0;
        double perimetro = 0;
        double area = 0;
        System.out.println("Introduzca el radio de la circunferencia: ");
        rad = sc.nextFloat();
        System.out.println("1. Calcular diámetro.");
        System.out.println("2. Calcular perímetro.");
        System.out.println("3. Calcular área.");
        dec = sc.nextInt();
        switch (dec) {
            case 1:
                diametro = (rad * 2);
                System.out.println("El diámetro de la circunferencia es: " + diametro + " u.m");
                break;

            case 2:
                perimetro = (2 * Math.PI * rad);
                System.out.println("El perímetro de la circunferencia es: " + perimetro + " u.m");
                break;

            case 3:
                area = (Math.PI * (rad * rad));
                System.out.println("El área de su circunferencia es: " + area + " u.m^2");
                break;

            default:
                System.out.println("Por favor, introduzca una opción válida.");
        }
    }
}
