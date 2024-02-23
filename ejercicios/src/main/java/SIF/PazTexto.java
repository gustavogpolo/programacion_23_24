package SIF;

import java.io.*;

public class PazTexto {
    public static void main(String[] args) {
        try (FileWriter fichero = new FileWriter("prueba1.txt")) {
            PrintWriter pw = new PrintWriter(fichero);
            pw.println("Cuando el poder del amor sobrepase el amor al poder, el mundo conocerá la paz - Jimi Hendrix ");
            pw.println("Que la paz que anuncian con sus palabras esté primero en sus corazones - Francisco de Asís");
            pw.println("La paz no se vende - Bono");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class PazTexto2 {
        public static void main(String[] arg) {

            try (FileReader fr = new FileReader("prueba1.txt")) {
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null)
                    System.out.println(linea);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}