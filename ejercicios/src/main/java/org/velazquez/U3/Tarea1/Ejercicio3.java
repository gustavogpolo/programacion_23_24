package org.velazquez.U3.Tarea1;

<<<<<<< HEAD
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Mensaje introductorio para el programa.
        System.out.println("Buenas, este programa calcula el área o volumen de un cilindro. ");
        System.out.println("Que quiere calcular? Area/Perímetro");
        String decision = sc.next();
        // If para decidir que quiere hacer el usuario.

        if (decision.equalsIgnoreCase("area")) {
            area();
        } else if (decision.equalsIgnoreCase("volumen")) {
            volumen();
        } else {
            System.out.println("Introduzca una opción válida");
            System.exit(0);
        }
    }

    static void area() {
        Scanner sc = new Scanner(System.in);
        double radio, altura;
        System.out.println("Indique los siguientes datos: ");
        System.out.print("1. Radio ");
        radio = sc.nextDouble();
        System.out.println("2. Altura ");
        altura = sc.nextDouble();
        double area_total = 2 * Math.PI * Math.sqrt(radio) * (altura + radio);
        System.out.printf("Su area es: " + area_total);

    }

    static void volumen() {
        Scanner sc = new Scanner(System.in);
        double radio, altura;
        System.out.println("Indique los siguientes datos: ");
        System.out.print("1. Radio ");
        radio = sc.nextDouble();
        System.out.println("2. Altura ");
        altura = sc.nextDouble();
        double volumen = Math.PI * Math.sqrt(radio) * altura;
        System.out.println("Su area es: " + volumen);
=======
public class Ejercicio3 {
    public static void main(String[] args) {

>>>>>>> f37d12d461d16f574b4fbabce96289765168377f
    }
}
