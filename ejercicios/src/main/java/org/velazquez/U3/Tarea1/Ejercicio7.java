package org.velazquez.U3.Tarea1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número, el programa indicará si es primo o no.");
        int n = sc.nextInt();
        primos(n);

    }

    public static boolean primos(int n) {
        boolean es_primo;
        es_primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                es_primo = false;
                break;
            } else {
                es_primo = true;
            }
        }
        return es_primo;
    }
}
