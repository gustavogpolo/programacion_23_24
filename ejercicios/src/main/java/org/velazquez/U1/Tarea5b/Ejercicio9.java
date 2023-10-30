package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su día de nacimiento.");
        int dia = teclado.nextInt();
        System.out.println("Introduzca su mes de nacimiento.");
        int mes = teclado.nextInt();
        //Capricornio
        if ((mes == 1 && (1 <= dia) && (dia <= 19))) {

            System.out.println("Usted es Capricornio.");

        } else if ((mes == 12 && (22 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Capricornio.");

        }
        // Acuario
        if ((mes == 1 && (20 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Acuario.");

        } else if ((mes == 2 && (1 <= dia) && (dia <= 18))) {

            System.out.println("Usted es Acuario.");

        }
        //Piscis
        if ((mes == 2 && (9 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Piscis.");

        } else if ((mes == 3 && (1 <= dia) && (dia <= 20))) {

            System.out.println("Usted es Piscis.");

        }
        //Aries
        if ((mes == 3 && (21 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Aries.");

        } else if ((mes == 4 && (1 <= dia) && (dia <= 19))) {

            System.out.println("Usted es Aries.");

        }
        //Tauro
        if ((mes == 4 && (20 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Tauro.");

        } else if ((mes == 5 && (1 <= dia) && (dia <= 20))) {

            System.out.println("Usted es Tauro.");

        }
        //Géminis
        if ((mes == 5 && (21 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Géminis.");

        } else if ((mes == 6 && (1 <= dia) && (dia <= 20))) {

            System.out.println("Usted es Géminis.");

        }
        //Cáncer
        if ((mes == 6 && (21 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Cáncer.");

        } else if ((mes == 7 && (1 <= dia) && (dia <= 22))) {

            System.out.println("Usted es Cáncer.");

        }
        //Leo
        if ((mes == 7 && (23 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Leo.");

        } else if ((mes == 8 && (1 <= dia) && (dia <= 22))) {

            System.out.println("Usted es Leo.");

        }
        //Virgo
        if ((mes == 8 && (23 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Virgo.");

        } else if ((mes == 9 && (1 <= dia) && (dia <= 22))) {

            System.out.println("Usted es Virgo.");

        }
        //Libra
        if ((mes == 9 && (23 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Libra.");

        } else if ((mes == 10 && (1 <= dia) && (dia <= 22))) {

            System.out.println("Usted es Libra.");

        }
        //Escorpio
        if ((mes == 10 && (23 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Escorpio.");

        } else if ((mes == 11 && (1 <= dia) && (dia <= 22))) {

            System.out.println("Usted es Escorpio.");

        }
        //Sagitario
        if ((mes == 11 && (23 <= dia) && (dia <= 31))) {

            System.out.println("Usted es Sagitario.");

        } else if ((mes == 12 && (1 <= dia) && (dia <= 21))) {

            System.out.println("Usted es Sagitario.");

        }
    }
}
