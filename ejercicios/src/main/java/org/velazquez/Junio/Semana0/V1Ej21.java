package org.velazquez.Junio.Semana0;

public class V1Ej21 {
    public static void main(String[] args) {
        int[] array = {70, 50, 20, 60, 40, 100};
        int menor = array[0];
        int mayor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        System.out.println("El menor es " + menor);
        System.out.println("El mayor es " + mayor);
    }
}
