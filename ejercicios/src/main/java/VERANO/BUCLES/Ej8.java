package VERANO.BUCLES;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el peso del jugador en Kg: ");
        int peso = scanner.nextInt();
        System.out.print("El peso del jugador corresponde a la categoría: ");
        if (peso < 76){
            System.out.println("Peso ligero");
        }else if (peso < 91){
            System.out.println("Peso medio");
        }else {
            System.out.println("Peso pesado");
        }
    }
}
