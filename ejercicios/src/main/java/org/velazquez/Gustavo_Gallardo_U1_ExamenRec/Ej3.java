package org.velazquez.Gustavo_Gallardo_U1_ExamenRec;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = 2;
        int cociente = 0;
        int resto = 0;
        int comodin;
        System.out.println("Introduzca un número entero positivo:");
        int numero_inicial = sc.nextInt();
        sc.nextLine();
        cociente = numero_inicial / 2;
        System.out.println("Cociente" + cociente);
        System.out.println("Resto" + resto);
    }
}
