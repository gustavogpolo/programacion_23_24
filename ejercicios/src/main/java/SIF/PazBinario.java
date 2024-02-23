package SIF;

import java.io.*;

public class PazBinario {
    private String filename;

    public PazBinario(String filename) {
        this.filename = filename;
    }

    public static void main(String[] args) {
        PazBinario pazTexto = new PazBinario("NOMBRE.bin");
        pazTexto.writeToFile("TEXTO");
        String message = pazTexto.readFromFile();
        System.out.println(message);
    }

    public void writeToFile(String message) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(message);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public String readFromFile() {
        String message = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            message = (String) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        return message;
    }
}
