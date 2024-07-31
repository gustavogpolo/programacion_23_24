package VERANO.BUCLES;

import java.util.Arrays;
//Dado un array de enteros {3, 5, 7, 9, 11}, usar un bucle for-each para imprimir
//        solo los números impares.
public class Ej2 {
    public static void main(String[] args) {
        int[] enteros = {3,2, 5, 7, 9, 11};
        int contador = 1;
        for (int impares : enteros) {
            if (impares % 2 != 0){
                System.out.print("Número impar " +contador++ + ": ");
                System.out.println(impares);
            }else {
                System.out.println(" ");
            }
        }
    }
}
