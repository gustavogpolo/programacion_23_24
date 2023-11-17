package org.velazquez.Gustavo_Gallardo_U1_ExamenRec;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, notaf, notar;
        System.out.print("Nota del primer control: ");
        n1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nota del segundo control: ");
        n2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nota del tercer control: ");
        n3 = sc.nextInt();
        sc.nextLine();
        if (n1 > 10 || n2 > 10 || n3 > 10) {
            System.out.println("Por favor introduzca las notas correctamente");
        } else {
            notaf = (n1 + n2 + n3) / 3;
            System.out.print("Tu nota de programación es: " + notaf);
            if (notaf < 5) {
                System.out.print(" ¿Cuál ha sido el resultado de la prueba de recuperación?");
                String nota_recuperacion = sc.next();
                if (nota_recuperacion.equalsIgnoreCase("no apto")) {
                    System.out.println("Tu nota de programación es: No apto ");
                }
                if (nota_recuperacion.equalsIgnoreCase("apto")) {
                    System.out.println("Tu nota de programación es: 5 - Suficiente");
                }

            } else if (notaf >= 6 && notaf < 7) {
                System.out.print(" - Bien");
            } else if (notaf >= 5 && notaf < 6) {
                System.out.print(" - Suficiente");
            } else if (notaf >= 7 && notaf < 9) {
                System.out.print(" - Notable");
            } else if (notaf >= 9 && notaf <= 10) {
                System.out.print(" - Sobresaliente");
            }
        }
    }
}