package VERANO.BUCLES;

import java.util.Random;

//Escribe un programa que determine la categoría de una persona basada en su edad:
// • 0-12: Niño
// • 13-17: Adolescente
// • 18-64: Adulto
// • 65+: Senior
public class Ej3 {
    public static void main(String[] args) {
        Random random = new Random();

        int edad = random.nextInt(80) + 1;
        System.out.print("Edad: " + edad + " = ");
        if (edad < 13){
            System.out.println("Niño");
        } else if (edad < 18) {
            System.out.println("Adolescente");
        } else if (edad < 65) {
            System.out.println("Adulto");
        }else{
            System.out.println("Senior");
        }
    }
}
