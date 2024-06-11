package org.velazquez.Gallardo_Polo_U3_Recuperacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

        public static void main(String[] args) {
            mediaVectores();
        }

        public static void mediaVectores (){
            Scanner sc = new Scanner(System.in);
            System.out.println("Indica la dimension del array 1: ");
            int dimension1 = sc.nextInt();
            System.out.println("Indica la dimension del array 2: ");
            int dimension2 = sc.nextInt();
            int[] array1 = new int[dimension1];
            int[] array2 = new int[dimension2];
            int[] array3 = new int[array1.length + array2.length];
            int num1 = 0;
            int num2 = 0;

            for (int i = 0; i < dimension1; i++) {
                System.out.print("Array 1, Número " + (i + 1) + ": ");
                array1[i] = sc.nextInt();
            }

            for (int i = 0; i < dimension2; i++) {
                System.out.print("Array 2, Número " + (i + 1) + ": ");
                array2[i] = sc.nextInt();
            }

            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i];
            }

            for (int i = 0; i < array2.length; i++) {
                array3[array1.length + i] = array2[i];
            }

            for (int i = 0; i < array3.length; i++) {
                if (i < array1.length){
                    num1 = array1[i];
                    num2 = array2[i];
                    int media = (num1 + num2)/2;
                    array3[i] = media;
                }
            }
            System.out.println("Array uno: " + Arrays.toString(array1));
            System.out.println("Array dos: " + Arrays.toString(array2));
            System.out.println("Media vectores: " + Arrays.toString(array3));
        }

}

