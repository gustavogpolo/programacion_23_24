package org.velazquez.Junio.Semana1.Trim1;

import java.util.Scanner;

// DE DERECHA A IZQUIERDA
public class Ej2V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario que introduzca un número entero positivo
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = 94026782;

        // Variables para almacenar los dígitos pares y su suma
        String digitosPares = "";
        int sumaPares = 0;

        // Procesar cada dígito del número
        while (numero > 0) {
            // Obtiene el último dígito
            int digito = (int) (numero % 10);

            // Verifica si el dígito es par
            if (digito % 2 == 0) {
                // Si es par, lo añade al final de la cadena de dígitos pares
                digitosPares = digito + " " + digitosPares;
                sumaPares += digito;
            }

            // Elimina el último dígito del número
            numero /= 10;
        }

        // Muestra los resultados
        System.out.println("Dígitos pares: " + digitosPares.trim());
        System.out.println("Suma de los dígitos pares: " + sumaPares);
    }
}
