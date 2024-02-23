package org.velazquez.Gallardo_Polo_U4_U5_Examen;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible {
    protected String[] Capitulos = new String[200];
    private String Titulo;
    private String Creador;
    private int Anio_estreno;
    private int Numero_temporadas;
    private int indice_capitulos = 0;

    // CONSTRUCTOR Y SETTER Y GETTER
    public Serie(int identificador_unico, String titulo, String creador, int anio_estreno, int numero_temporadas) {
        super(identificador_unico);
        Titulo = titulo;
        Creador = creador;
        Anio_estreno = anio_estreno;
        Numero_temporadas = numero_temporadas;
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String creador) {
        Creador = creador;
    }

    public int getAnio_estreno() {
        return Anio_estreno;
    }

    public void setAnio_estreno(int anio_estreno) {
        Anio_estreno = anio_estreno;
    }

    public int getNumero_temporadas() {
        return Numero_temporadas;
    }

    public void setNumero_temporadas(int numero_temporadas) {
        Numero_temporadas = numero_temporadas;
    }

    public String[] getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(String[] capitulos) {
        Capitulos = capitulos;
    }

    // METODOS DE LA INTERFAZ
    @Override
    public void Play() {
        System.out.println("Reproduciendo serie " + Titulo + " capitulo" + Arrays.toString(Capitulos));
    }

    @Override
    public void Pause() {
        System.out.println("Pausando serie " + Titulo + " capitulo" + Arrays.toString(Capitulos));
    }

    @Override
    public void Stop() {
        System.out.println("Parando serie" + Titulo + " capitulo" + Arrays.toString(Capitulos));
    }

    // AÑADIR Y ELIMINAR CAPITULOS
    public void add_capitulo(String Capitulo) {
        if (indice_capitulos == Capitulos.length) {
            Capitulos = Arrays.copyOf(Capitulos, Capitulos.length + 1);
        }

        Capitulos[indice_capitulos] = Capitulo;
        indice_capitulos++;
    }

    public void eliminar_capitulo(String Capitulo) {
        String[] copia = new String[Capitulos.length - 1];
        int copia_indice = 0;
        for (int i = 0; i < Capitulos.length; i++) {
            if (!Capitulos[i].equals(Capitulo)) {
                copia[copia_indice] = Capitulos[i];
                copia_indice++;
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        Capitulos = copia;
        System.out.println("True");
    }

    @Override
    public String toString() {
        return "Serie{" +
                "Capitulos=" + Arrays.toString(Capitulos) +
                ", Titulo='" + Titulo + '\'' +
                ", Creador='" + Creador + '\'' +
                ", Anio_estreno=" + Anio_estreno +
                ", Numero_temporadas=" + Numero_temporadas +
                ", indice_capitulos=" + indice_capitulos +
                '}';
    }
}


