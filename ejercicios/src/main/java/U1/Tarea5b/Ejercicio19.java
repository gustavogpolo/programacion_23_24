package U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0;
        int min = 0;
        int dia = 0;
        int viernes = 6660;
        int calc = 0;
        float total = 0;
        System.out.println("Este programa calcula las horas y minutos que quedan hasta el fin de semana. (Viernes a las 15:00)");
        System.out.println("Introduzca el día de la semana: ");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        dia = sc.nextInt();
        if (dia == 1) {
            System.out.println("Introduzca la hora:");
            hora = sc.nextInt();
            if (hora <= 24) {
                System.out.println("Introduzca los minutos:");
                min = sc.nextInt();
                if (min <= 60) {
                    calc = viernes - ((hora * 60) + min);
                    System.out.println("Quedan: " + calc + " minutos para el fin de semana.");
                } else {
                    System.out.println("Por favor introduzca una hora y minúto válido");
                }
            } else {
                System.out.println("Por favor introduzca una hora y minúto válido");
            }

        } else if (dia == 2) {

            System.out.println("Introduzca la hora:");
            hora = sc.nextInt();
            if (hora <= 24) {
                System.out.println("Introduzca los minutos:");
                min = sc.nextInt();
                if (min <= 60) {
                    calc = viernes - ((hora * 60) + min);
                    total = calc % 24;
                    System.out.println("Quedan: " + calc + " minutos para el fin de semana.");
                } else {
                    System.out.println("Por favor introduzca una hora y minúto válido");
                }
            } else {
                System.out.println("Por favor introduzca una hora y minúto válido");
            }

        } else if (dia == 3) {

            System.out.println("Introduzca la hora:");
            hora = sc.nextInt();
            if (hora <= 24) {
                System.out.println("Introduzca los minutos:");
                min = sc.nextInt();
                if (min <= 60) {
                    calc = viernes - ((hora * 60) + min);
                    total = calc % 24;
                    System.out.println("Quedan: " + calc + " minutos para el fin de semana.");
                } else {
                    System.out.println("Por favor introduzca una hora y minúto válido");
                }
            } else {
                System.out.println("Por favor introduzca una hora y minúto válido");
            }

        } else if (dia == 4) {

            System.out.println("Introduzca la hora:");
            hora = sc.nextInt();
            if (hora <= 24) {
                System.out.println("Introduzca los minutos:");
                min = sc.nextInt();
                if (min <= 60) {
                    calc = viernes - ((hora * 60) + min);
                    total = calc % 24;
                    System.out.println("Quedan: " + calc + " minutos para el fin de semana.");
                } else {
                    System.out.println("Por favor introduzca una hora y minúto válido");
                }
            } else {
                System.out.println("Por favor introduzca una hora y minúto válido");
            }

        } else if (dia == 5) {

            System.out.println("Introduzca la hora:");
            hora = sc.nextInt();
            if (hora < 15) {
                System.out.println("Introduzca los minutos:");
                min = sc.nextInt();
                if (min <= 60) {
                    calc = viernes - ((hora * 60) + min);
                    total = calc % 24;
                    System.out.println("Quedan: " + calc + " minutos para el fin de semana.");
                } else {
                    System.out.println("Por favor introduzca una hora y minúto válido");
                }
            } else {
                System.out.println("Ya es fin de semana!!!!");
            }

        }
        System.out.println();
        System.out.println();
    }
}
