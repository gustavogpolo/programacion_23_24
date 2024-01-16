package org.velazquez.U4.Tarea1.ej6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del banco: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el capital del banco: ");
        long capital = sc.nextLong();
        sc.nextLine();
        System.out.println("Introduzca la dirección del banco: ");
        String direccion = sc.nextLine();
        Banco banco = new Banco(nombre, capital, direccion);
        System.out.println(banco.getNombre());
        System.out.println(banco.getCapital());
        System.out.println(banco.getDireccion());
    }
}
