package VERANO.BUCLES;
//Escribe un programa que sume los números del 1 al 100 y muestre el resultado.
public class Ej4 {
    public static void main(String[] args) {
        int numeros = 0;
        int suma = 0;
        while (numeros < 101){
            suma += numeros;
            numeros++;
        }
        System.out.println(suma);
    }
}
