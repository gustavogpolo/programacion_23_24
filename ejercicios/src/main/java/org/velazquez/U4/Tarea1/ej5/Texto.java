package org.velazquez.U4.Tarea1.ej5;

public class Texto {


    //String para el texto
    private String texto;
    // Límite de caracteres en el String
    private int capacidad;

    //Constuctor para el texto
    public Texto(String texto, int capacidad) {
        this.texto = texto;
        this.capacidad = 5;
    }


    // Setter y Getter para la capacidad
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Setter y getter para el texto
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "texto='" + texto + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }


    void anadir_caracteres(String caracter, String texto) {
        if (capacidad > texto.length()) {
            texto = caracter + texto;
            System.out.println(texto);
        } else {
            System.out.print("La longitud del texto es mayor a la capacidad permitida: ");
            System.out.println(capacidad);
        }
    }

    void anadir_caracteres2(String caracter, String texto) {
        if (capacidad > texto.length()) {
            texto = texto + caracter;
            System.out.println(texto);
        } else {
            System.out.print("La longitud del texto es mayor a la capacidad permitida: ");
            System.out.println(capacidad);
        }
    }

    void contar_mayusculas(String texto) {
        int mayusculas = 0, minusculas = 0;
        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' || texto.charAt(i) == 'O' || texto.charAt(i) == 'U') {
                mayusculas++;
            } else if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
                minusculas++;
            }

        }
        System.out.println("Número de mayúsculas: " + mayusculas);
        System.out.println("Número de minúsculas: " + minusculas);
    }
}
