package org.velazquez.U5.Tarea1;

import org.velazquez.U5.Tarea1.Ej1.Hora;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Hora reloj = new Hora(0, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas: ");
        reloj.setHora(sc.nextInt());
        System.out.println("Introduzca los minutos: ");
        reloj.setMinutos(sc.nextInt());
        System.out.println(reloj);
        reloj.inc();
        System.out.println(reloj);

    }
}
