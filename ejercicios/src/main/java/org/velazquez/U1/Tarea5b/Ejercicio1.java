package org.velazquez.U1.Tarea5b;
/*Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduzca el dia de la semana en número. (Lunes = 1, Martes= 2...) ");
        int dia = teclado.nextInt();
        switch (dia) {

            case 1:

                System.out.println("El lunes a 1º hora toca: Programación.");
                break;
            case 2:

                System.out.println("El martes a 1º hora toca: Programación.");
                break;
            case 3:

                System.out.println("El miércoles a 1º hora toca: FOL. ");
                break;
            case 4:

                System.out.println("El jueves a 1º hora toca: Entornos de desarrollo. ");
                break;
            case 5:

                System.out.println("El viernes a 1º hora toca: Programación. ");
                break;

            default:

                System.out.println("No hay clase, agonías.");
        }

    }
}
