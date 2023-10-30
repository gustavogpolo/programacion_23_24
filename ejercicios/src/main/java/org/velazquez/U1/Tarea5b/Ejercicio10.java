package org.velazquez.U1.Tarea5b;
//Escribe un programa que dada una hora determinada
//(horas y minutos), calcule los segundos que faltan para llegar a la medianoche.

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una hora determinada (horas y minutos) ");
        System.out.print("Introduzca la hora: ");
        int hora = teclado.nextInt();
        System.out.print("Introduzca los minutos: ");
        int minutos = teclado.nextInt();
        if (hora >= 25 || minutos >= 61) {

            System.out.println("Por favor introduzca una hora válida. ");

        } else {

            double minutos_restantes = 60 - minutos;
            double horas_restantes = 24 - hora;
            double segundos = (horas_restantes * 3600) + (minutos_restantes * 60);
            System.out.printf("Quedan: %.0f", segundos);
            System.out.print(" segundos para media noche");
        }


    }
}
