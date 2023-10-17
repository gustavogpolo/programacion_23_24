package U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        int a, b, c, d, e, f, g, h, i, j;
        System.out.println("Comienza la encuesta para ver si su pareja le está siendo infiel.");
        //PREGUNTA 1
        System.out.println("A. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        a = sc.nextInt();
        if (a == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (a == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 2
        System.out.println("B. Ha aumentado sus gastos de vestuario?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        b = sc.nextInt();
        if (b == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (b == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 3
        System.out.println("C. Ha perdido el interés que mostraba anteriormente por ti?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        c = sc.nextInt();
        if (c == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (c == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 4
        System.out.println("D. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        d = sc.nextInt();
        if (d == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (d == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 5
        System.out.println("E. No te deja que mires la agenda de su teléfono móvil?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        e = sc.nextInt();
        if (e == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (e == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 6
        System.out.println("F. A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        f = sc.nextInt();
        if (f == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (f == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 7
        System.out.println("G. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        g = sc.nextInt();
        if (g == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (g == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 8
        System.out.println("H. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        h = sc.nextInt();
        if (h == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (h == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 9
        System.out.println("I. Has notado que últimamente se perfuma más?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        i = sc.nextInt();
        if (i == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (i == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        //PREGUNTA 10
        System.out.println("J. Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");
        System.out.println("Seleccione su respuesta.");
        j = sc.nextInt();
        if (j == 1) {
            ++puntos;
            ++puntos;
            ++puntos;
        } else {

            if (j == 2) {

                sc.nextLine();

            } else {
                System.out.println("Por favor introduzca una respuesta válida.");
            }
        }
        if (puntos <= 10) {

            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");

        } else {

            if (puntos <= 21) {

                System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");

            } else {

                System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");

            }

        }
    }
}
