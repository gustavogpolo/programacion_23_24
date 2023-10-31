package org.velazquez.Gallardo_Polo_U1_Examen;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        float basica = 3;
        final float basica_miercoles = 2;
        float gourmet = 5;
        final float gourmet_martes = 9;
        final float DESCUENTO_Pintaza = 0.12f;
        float precio_final = 0.0f;
        float descuento_final = 0.0f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Pedidos Pintaza Feliz");
        System.out.println("Número de hamburguesas básicas: ");
        int numero_basicas = sc.nextInt();
        sc.nextLine();
        System.out.println("Número de hamburguesas gourmet: ");
        int numero_gourmet = sc.nextInt();
        sc.nextLine();
        System.out.println("Día de la semana: ");
        String dia_semana = sc.nextLine();
        System.out.println("¿Pertenece al club Fanegas? (s/n): ");
        String tarjeta = sc.nextLine();

        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        if (dia_semana.equalsIgnoreCase("miercoles")) {
            System.out.println("Hamburguesas Básicas: " + numero_basicas);
            System.out.println("Hamburguesas Gourmet: " + numero_gourmet);
            System.out.println("Total: " + (numero_basicas * basica_miercoles) + (numero_gourmet * gourmet));
        } else if (dia_semana.equalsIgnoreCase("martes") && numero_gourmet >= 2) {
            if (numero_gourmet % 2 != 0) {
                numero_gourmet--;
                precio_final = gourmet;
            }
            System.out.println("Numero de hamburguesas básicas: " + numero_basicas);
            System.out.println("Número de hamburguesas gourmet: " + numero_gourmet);
            precio_final += (numero_gourmet * (gourmet_martes / 2)) + (numero_basicas * basica);

        } else {
            System.out.println("Hamburguesas básicas: " + numero_basicas);
            System.out.println("Hamburguesas gourmet: " + numero_gourmet);
            precio_final = (numero_gourmet * gourmet) + (numero_basicas * basica);
        }
        System.out.println("Total: " + precio_final);
        if (tarjeta.equalsIgnoreCase("s")) {
            descuento_final = (precio_final * DESCUENTO_Pintaza);
            precio_final -= precio_final * DESCUENTO_Pintaza;
        }

        System.out.println("Descuento: " + descuento_final + "€");
        System.out.println("A pagar: " + precio_final + "€");
    }
}
