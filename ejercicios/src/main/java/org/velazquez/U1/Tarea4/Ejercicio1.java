package org.velazquez.U1.Tarea4;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Comprobación si el rango de valores de un tipo se comporta de manera ciclica.");
        System.out.println("El valor mínimo del tipo short es: ");
        short cicliconeg = -32768;
        System.out.println(cicliconeg);
        System.out.println("El valor máximo del tipo short es: ");
        short ciclicopos = 32767;
        System.out.println(ciclicopos);
        System.out.println("Le sumamos 1 al valor máximo: " + (ciclicopos + 1));
        System.out.println("Le restamos 1 al valor mínimo: " + (cicliconeg - 1));
    }
}
