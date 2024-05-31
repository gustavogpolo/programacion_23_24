package org.velazquez.Junio.Semana0;

import java.util.Locale;
import java.util.Scanner;

/*Pide el precio de un producto sin iva y calcula el IVA del producto.
El IVA es del 21%.
El resultado se debe mostrar con 2 decimales.*/
public class V1Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio = 0;
        final double iva = 0.21;
        double iva_calculado = 0;
        double precio_total = 0;
        System.out.println("¡Bienvenido a su calculadora de IVA!");
        System.out.println("Introduzca el precio del producto a calcular.");
        precio = sc.nextDouble();
        iva_calculado = precio * iva;
        System.out.println("El IVA del producto es: " + iva_calculado);
        precio_total = precio + iva_calculado;
        System.out.printf("El precio del producto con IVA es: %.2f €", precio_total);

    }
}
