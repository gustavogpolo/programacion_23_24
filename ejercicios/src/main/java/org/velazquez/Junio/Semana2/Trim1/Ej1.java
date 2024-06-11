package org.velazquez.Junio.Semana2.Trim1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextLong();

        // Solicitar la posición del dígito a cambiar
        System.out.print("Introduzca la posición dentro del número: ");
        int posicion = sc.nextInt();

        // Solicitar el nuevo dígito
        System.out.print("Introduzca el nuevo dígito: ");
        int nuevoDigito = sc.nextInt();

        // Comprobar que el nuevo dígito está entre 0 y 9
        if (nuevoDigito < 0 || nuevoDigito > 9) {
            System.out.println("Error: El nuevo dígito debe estar entre 0 y 9.");
        } else {
            // Cambiar el dígito en la posición especificada
            long resultado = cambiarDigito(numero, posicion, nuevoDigito);

            // Mostrar el resultado
            System.out.println("El número resultante es " + resultado);
        }
    }

    // Método para cambiar un dígito en una posición específica
    public static long cambiarDigito(long numero, int posicion, int nuevoDigito) {
        // Convertir el número a cadena para manipular los dígitos
        String numeroStr = String.valueOf(numero);

        // Verificar que la posición es válida
        if (posicion < 1 || posicion > numeroStr.length()) {
            System.out.println("Error: La posición está fuera del rango.");
            return numero;
        }

        // Construir la nueva cadena con el dígito cambiado
        StringBuilder resultadoStr = new StringBuilder(numeroStr);
        resultadoStr.setCharAt(posicion - 1, Character.forDigit(nuevoDigito, 10));

        // Convertir de nuevo a número y devolver
        return Long.parseLong(resultadoStr.toString());
    }
}