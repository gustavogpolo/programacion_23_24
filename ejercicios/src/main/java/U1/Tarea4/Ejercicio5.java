package U1.Tarea4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Este programa le muestra la hora actual.");
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("Hora actual: " + dateFormat.format(date));
    }
}
