package org.velazquez.Junio.Semana0;

// Dados dos array, uno con nombres y otro con nombres, indica quién es más mayor y su edad
public class V1Ej22 {
    public static void main(String[] args) {
        String[] nombres = {"Fernando", "Curro", "Gustavo" };
        int[] edades = {33, 30, 18};

        int indice_mayor = 0;

        for (int i = 1; i < edades.length; i++) {
            if (edades[i] > edades[indice_mayor]) {
                indice_mayor = i;
            }
        }

        System.out.println("La persona con más edad (" + edades[indice_mayor] + ") es " + nombres[indice_mayor]);
    }
}
