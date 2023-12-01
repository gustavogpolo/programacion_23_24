package org.velazquez.Gallardo_Polo_U3_Entregable;

import java.util.*;

//Escribir una programa que solicitando el tamaño al usuario nos cree un array o vector de
// dicho tamaño cuyo contenido serán números aleatorios en 18 y 65 (ambos inclusive).
//
//A continuación crear una función paresImpares que:
//
//Reciba dicho vector
//Devuelva un vector con los pares al principio y los impares posteriormente respetando el orden de aparición en cada subgrupo ( pares - impares)
public class Ej1 {
    public static void main(String[] args) {
        //Definimos la clase Scanner y expulsamos un mensaje para que ingrese el tamaño deseado del Vector
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = sc.nextInt();

        // Definimos los límites de los números aleatorios
        int limite_inferior = 16;
        int limite_superior = 65;

        //Conduce a la función llamada generar Vector
        int[] vector = generarVector(tamaño, limite_inferior, limite_superior);
        //Expulsa el vector generado por la función
        System.out.println(Arrays.toString(vector));

        //Conduce a la función llamada paresImpares.
        int[] vector_ordenado = paresImpares(vector);
        //Expulsa el vector generado ordenado.
        System.out.println(Arrays.toString(vector_ordenado));
    }

    //
    public static int[] generarVector(int tamaño, int limite_inferior, int limite_superior) {
        Random random = new Random();
        int[] vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i] = random.nextInt(limite_superior - limite_inferior + 1) + limite_inferior;
        }
        return vector;
    }

    public static int[] paresImpares(int[] vector) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int num : vector) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        int[] vector_ordenado = new int[vector.length];
        for (int i = 0, j = 0, k = 0; i < vector.length; i++) {
            if (i < pares.size()) {
                vector_ordenado[i] = pares.get(j++);
            } else {
                vector_ordenado[i] = impares.get(k++);
            }
        }

        return vector_ordenado;
    }
}
