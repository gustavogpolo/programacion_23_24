package org.velazquez.Junio.Semana0;

//Dado un número aleatorio entre 1 - 100 pide al usuario que adivine dándole pistas de si es menor o mayor.
// El usuario tiene 5 intentos
// Si se acaban los intentos, el ususario habrá perdido

import java.util.Random;
import java.util.Scanner;

public class V1Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numero_aletorio = random.nextInt(1, 101);

        int numero_usuario;
        int intentos = 5;

        boolean acertado = false;

        System.out.println(numero_aletorio);
        while (!acertado && intentos > 0) {
            System.out.println("Introduzca un número entre 1 y 100");
            numero_usuario = sc.nextInt();
            if (numero_usuario == numero_aletorio) {
                acertado = true;
            } else if (numero_usuario > numero_aletorio) {
                System.out.println("El número aleatorio es menor al número intentado");
                intentos--;
                System.out.println("Quedan " + intentos + " intentos");
            } else {
                System.out.println("El número aletorio es mayor al número intentado");
                intentos--;
                System.out.println("Quedan " + intentos + " intentos");
            }
        }
        if (acertado) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Has perdido");
        }
    }
}
