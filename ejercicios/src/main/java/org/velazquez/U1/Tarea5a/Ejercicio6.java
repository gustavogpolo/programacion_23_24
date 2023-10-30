package org.velazquez.U1.Tarea5a;

import java.util.Scanner;

/*Ejercicio 6: Crea un programa que contenga una constante llamada gravedad=9,8,
solicite al usuario el valor de "tiempo", y calcule y muestre la velocidad
(velocidad=gravedad x tiempo). Nota: si el valor del tiempo es negativo o 0,
se mostrará el mensaje "Tiempo incorrecto"*/

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double gravedad = 9.8;
        System.out.println("Introduzca el valor \"tiempo\". ");
        double tiempo = teclado.nextDouble();
        if (tiempo < 0) {

            System.out.println("Tiempo incorrecto.");

        } else {

            double velocidad = (gravedad * tiempo);
            System.out.println("La velocidad es " + velocidad);

        }


    }
}
