package org.velazquez.Junio.Semana1.Trim1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario que introduzca un número entero positivo
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long numero = 94026782;

        // Inicializa las variables para almacenar los dígitos pares y su suma
        String digitosPares = " ";
        int sumaPares = 0;

        // Convierte el número a una cadena para procesar cada dígito
        String numeroStr = String.valueOf(numero);

        // Itera sobre cada carácter de la cadena
        for (int i = 0; i < numeroStr.length(); i++) {
            // Obtiene el carácter actual y lo convierte a un dígito
            char caracter = numeroStr.charAt(i);
            int digito = Character.getNumericValue(caracter);

            // Verifica si el dígito es par
            if (digito % 2 == 0) {
                // Si es par, lo añade a la cadena de dígitos pares y suma su valor
                digitosPares += digito + " ";
                sumaPares += digito;
            }
        }

        // Muestra los resultados
        System.out.println("Dígitos pares: " + digitosPares.trim());
        System.out.println("Suma de los dígitos pares: " + sumaPares);
    }

//    public static long calcular_pares(long numero) {
//
//        long almacen;
//
//        int contador = 0;
//
//        for (int i = 0; i < ; i++) {
//            if ()
//        }
//        return;
//    }
}

