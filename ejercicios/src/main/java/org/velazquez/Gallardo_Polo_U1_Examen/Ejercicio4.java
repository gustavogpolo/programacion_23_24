package org.velazquez.Gallardo_Polo_U1_Examen;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1;
        int numero_cifras = 0;
        System.out.println("Introduzca el número de 6 cifrs exactamente: ");
        n = sc.nextInt();
        n1 = n;
        do {
            numero_cifras = 0;
            while (n > 0) {
                n /= 10;
                numero_cifras++;
            }

        } while (numero_cifras >= 0 && numero_cifras != 6);
        int mitad1 = n1 / (int) Math.pow(10, 3);
        int mitad2 = n1 % (int) Math.pow(10, 3);
        System.out.println("Primera mitad: " + mitad1);
        System.out.println("Segunda mitad: " + mitad2);
        boolean es_primo = true;
        for (int i = 2; i < mitad1; i++) {
            if (mitad1 % i == 0) {
                es_primo = false;
                break;
            }
        }
        if (es_primo) {
            System.out.println("El número " + mitad1 + " Es primo");
        } else {
            System.out.println("El número " + mitad1 + " NO es primo");
        }
        es_primo = true;
        for (int i = 2; i < mitad2; i++) {
            if (mitad2 % i == 0) {
                es_primo = false;
                break;
            }
        }
        if (es_primo) {
            System.out.println("El número " + mitad2 + " Es primo");
        } else {
            System.out.println("El número " + mitad2 + " NO es primo");
        }
    }
}
