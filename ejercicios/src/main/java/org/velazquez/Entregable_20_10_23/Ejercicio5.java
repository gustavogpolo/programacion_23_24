package org.velazquez.Entregable_20_10_23;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca un numero entero: ");
        int numero = teclado.nextInt();


        System.out.println("Introduzca una cifra: (Entre el 0 y el 9 ambos inclusive)");
        int cifra = teclado.nextInt();


        String numeroString = Integer.toString(numero);


        int ocurrencias = 0;
        String posiciones = "";


        for (int i = 0; i < numeroString.length(); i++) {


            int digito = Character.getNumericValue(numeroString.charAt(i));


            if (digito == cifra) {
                ocurrencias++;


                posiciones += (i + 1) + " - ";
            }
        }


        posiciones = posiciones.substring(0, posiciones.length() - 2);


        System.out.println("Resultado:");
        System.out.println(ocurrencias + " ocurrencias");
        System.out.println("Posiciones: " + posiciones);
    }
}
