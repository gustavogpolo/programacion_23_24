package org.velazquez.U4.Tarea1.ej7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Radio radio = new Radio(0.5F, 80);
        System.out.println("Buenas, escuchista. Bienvenido al menú principal de la Radio GP.");
        System.out.println("Que desea hacer?");
        System.out.println("1. Subir frecuencia");
        System.out.println("2. Bajar frecuencia");
        System.out.println("3. Mostrar frecuencia");
        System.out.println("4. Cerrar sesión");
        int decision = sc.nextInt();

        if (decision == 1) {
            radio.up();
        } else if (decision == 2) {
            radio.down();
        } else if (decision == 3) {
            radio.display();
        } else if (decision == 4) {
            System.out.println("¡¡¡Gracias!!! Hasta luuego");
        } else {
            System.out.println("Por favor introduzca un número válido");
        }


    }
}
