package U8.tarea1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivoXML = teclado.nextLine();

        ParseadorDOMPersonas.parse(nombreArchivoXML);
    }

}
