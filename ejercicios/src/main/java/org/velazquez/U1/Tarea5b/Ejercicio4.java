package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

// Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
// las horas extras. Escribe un programa que calcule el salario semanal de un trabajador
// teniendo en cuenta que las horas ordinarias (40 primeras horas de
//trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas");
        int horas = teclado.nextInt();
        final int sueldo_horas = 12;
        final int sueldo_extra = 16;
        if (horas <= 40) {
            int sueldo_base = (horas * sueldo_horas);
            System.out.println("Su sueldo es: " + sueldo_base);

        }
        if (horas > 40) {

            int sueldo_total = ((horas - 40) * sueldo_extra) + 480;
            System.out.println("Su sueldo es " + sueldo_total);

        }
    }
}
