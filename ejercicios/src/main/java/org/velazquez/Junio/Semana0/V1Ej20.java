package org.velazquez.Junio.Semana0;
// Realiza la suma y la media de los elementos del array
public class V1Ej20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 213, 4234, 12};

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        double media = 0;
        media = (double) suma / array.length;

        System.out.print("Suma ");
        System.out.println(suma);
        System.out.print("Media ");
        System.out.println(media);
    }

}
