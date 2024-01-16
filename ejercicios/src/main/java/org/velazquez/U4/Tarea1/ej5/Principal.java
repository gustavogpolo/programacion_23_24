package org.velazquez.U4.Tarea1.ej5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String texto = sc.nextLine();
        System.out.println("Introduce el caracter que quieres introducir: ");
        String caracter = sc.nextLine();
        Texto Texto = new Texto(texto, 5);
        Texto.anadir_caracteres(caracter, texto);
        Texto.anadir_caracteres2(caracter, texto);
        Texto.contar_mayusculas(texto);
    }
}