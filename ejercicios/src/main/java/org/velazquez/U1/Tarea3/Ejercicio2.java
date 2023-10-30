package org.velazquez.U1.Tarea3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor intruduzca el año en el que nació: ");
        short nacimiento = teclado.nextShort();
        System.out.println("Por favor introduzca el año actual: ");
        short actual = teclado.nextShort();

        if (actual < nacimiento) {

            System.out.println("No se pueden tener años negativos");
            return;
        }

        int suma = actual - nacimiento;
        System.out.println("Usted tiene " + suma + " años");

    }
}
