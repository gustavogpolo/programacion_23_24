package VERANO.BUCLES;

//Escribe un programa que pida al usuario ingresar números hasta que ingrese un
//número negativo, luego muestra la suma de todos los números ingresados.

import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numeros;
        // HE TENIDO QUE PONER TAMBIÉN UN IF - ELSE PORQUE SI NO A LA SUMA SE LE RESTABA EL NÚMERO NEGARIVO PARA PARAR EL BUCLE.
        do {
            System.out.println("Ingrese números para realizar su suma (Cualquier número negativo para parar)");
            numeros = sc.nextInt();
            if (numeros > -1){
                suma += numeros;
            }else{
                System.out.println("La suma da: " + suma);
            }
        }while (numeros > -1);
    }
}
