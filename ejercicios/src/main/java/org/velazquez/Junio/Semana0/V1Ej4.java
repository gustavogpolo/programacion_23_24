package org.velazquez.Junio.Semana0;

import java.util.Scanner;

// Pide un año por teclado e indica si es bisiesto o no
// Un año es bisiesto cuando es divisible por 4 pero no es divisible por 100 o es divisible por 400
public class V1Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un año: ");
        int anyo = sc.nextInt();
        if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
            System.out.println("El año " + anyo + " es bisiesto");
        } else {
            System.out.println("El año " + anyo + " no es bisiesto");
        }

    }
}
