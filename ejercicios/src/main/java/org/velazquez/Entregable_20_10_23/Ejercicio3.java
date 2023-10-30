package org.velazquez.Entregable_20_10_23;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        byte a = 0;
        byte entrada = 8;
        int total = 0;
        byte entrada_x = 5;
        int total_x = 0;
        double entrada_j = 5.5;
        float descuento = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("VENTA DE ENTRADAS CINEMAPA.");
        System.out.print("Introduzca el número de entradas: ");
        a = sc.nextByte();
        sc.nextLine();
        System.out.print("Introduzca el día de la semana: ");
        String dia = sc.next();
        System.out.print("¿Tiene tarjeta cinemapa? (s/n): ");
        String letra = sc.next();
        //System.out.println(a);
        //System.out.println(dia);
        //System.out.println(letra);
        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("viernes") || dia.equals("sabado") || dia.equals("domingo")) {
            total = entrada * a;
            System.out.println("Aqui tiene sus entradas. ¡Gracias por su compra!");
            System.out.print("Entradas individuales: ");
            System.out.println(a);
            System.out.print("Precio por entrada individual: ");
            System.out.println(entrada);
            System.out.print("Total: ");
            System.out.println(total + "€");
            System.out.print("Descuento: ");
            if (letra.equals("s")) {
                descuento = (float) (total * 0.10);
                System.out.println(descuento + "€");
            } else if (letra.equals("n")) {
                System.out.println("0€");
            } else {
                System.out.println("POR FAVOR INTRODUZCA UNOS DATOS CORRECTOS.");
            }
            System.out.print("A pagar: ");
            System.out.println(total - descuento + "€");

        } else if (dia.equals("miercoles")) {
            total_x = entrada_x * a;
            System.out.println("Aqui tiene sus entradas. ¡Gracias por su compra!");
            System.out.print("Entradas individuales: ");
            System.out.println(a);
            System.out.print("Precio por entrada individual: ");
            System.out.println(entrada_x);
            System.out.print("Total: ");
            System.out.println(total_x + "€");
            System.out.print("Descuento: ");

            if (letra.equals("s")) {
                descuento = (float) (total_x * 0.10);
                System.out.println(descuento + "€");
            } else if (letra.equals("n")) {
                System.out.println("0€");
            } else {
                System.out.println("POR FAVOR INTRODUZCA UNOS DATOS CORRECTOS.");
            }
            System.out.print("A pagar: ");
            System.out.println(total_x - descuento + "€");

        } else if (dia.equals("jueves")) {
            double total_j = entrada_j * a;
            System.out.println("Aqui tiene sus entradas. ¡Gracias por su compra!");
            System.out.print("Entradas de parejas: ");
            if (a % 2 != 0) {
                int total_j_impar = ((a / 2));
                System.out.println(total_j_impar);
                System.out.println("Entrada individual: 1");
            } else {
                System.out.println(a / 2);
            }
            System.out.print("Precio por entrada de pareja: ");
            int entrada_pareja = (int) (entrada_j * 2);
            System.out.println(entrada_pareja);
            System.out.print("Total: ");
            int a_pagar = (int) (total_j + 2.5);
            if (total_j % 11 != 0) {
                System.out.println(a_pagar + "€");
            } else {
                System.out.println(total_j + "€");
            }
            System.out.print("Descuento: ");

            if (letra.equals("s")) {
                descuento = (float) (total_j * 0.10);
                System.out.println(descuento + "€");
            } else if (letra.equals("n")) {
                System.out.println("0€");
            } else {
                System.out.println("POR FAVOR INTRODUZCA UNOS DATOS CORRECTOS.");
            }
            System.out.print("A pagar: ");
            System.out.println(entrada_pareja * (a / 2) - descuento + "€");
        }


    }
}
