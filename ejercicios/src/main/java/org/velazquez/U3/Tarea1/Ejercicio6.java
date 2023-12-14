package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1;
        System.out.println("Introduzca un carácter, si ese caracter es una letra y a su vez una vocal, el booleano dirá: True, si no dirá: False");
        System.out.println("Inserte el caracter: ");
        c1 = sc.next();
        vocalsi(c1);

    }

    public static boolean vocalsi(String c1) {
        if (c1.equalsIgnoreCase("a")) {
            System.out.println("El caracter introducido: " + c1 + " si es una vocal ");
        } else if (c1.equalsIgnoreCase("e")) {
            System.out.println("El caracter introducido: " + c1 + " si es una vocal ");
        } else if (c1.equalsIgnoreCase("i")) {
            System.out.println("El caracter introducido: " + c1 + " si es una vocal ");
        } else if (c1.equalsIgnoreCase("o")) {
            System.out.println("El caracter introducido: " + c1 + " si es una vocal ");
        } else if (c1.equalsIgnoreCase("u")) {
            System.out.println("El caracter introducido: " + c1 + " si es una vocal ");
        } else {
            vocalno(c1);
        }
        return true;
    }

    public static boolean vocalno(String c1) {
        System.out.println("El caracter introducido: " + c1 + " no es una vocal ");
        return false;
    }
}
