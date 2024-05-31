package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// mostrar la suma de los números hasta que el ususario introduzca -1
public class V1Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int suma = 0;

        while (numero != -1) {
            // suma += numero es lo mismo que suma = suma + numero
            suma += numero;

            System.out.println("Introduce un número, -1 para acabar");
            numero = sc.nextInt();
        }
        System.out.println("La suma es " + suma);
    }
}
