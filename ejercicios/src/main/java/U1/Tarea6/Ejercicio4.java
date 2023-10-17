package U1.Tarea6;

import java.util.Scanner;

//Ejercicio 4: Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga
//el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".

//OPERADOR TERNARIO :resultado = (condicion)?valor1:valor2;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte x, y, menor = 0;
        System.out.println("Introduzca el primer número tipo byte:");
        x = sc.nextByte();
        System.out.println("Introduzca el segúndo número tipo byte:");
        y = sc.nextByte();
        /*if (x > y) {
            menor = y;
        } else {
            menor = x;
        }
        System.out.println("Su nuevo número es:" + menor);*/

        menor = (x > y) ? y : x;
        System.out.println("Su nuevo número es: " + menor);

    }
}
