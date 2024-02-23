package org.velazquez.Gallardo_Polo_U4_U5_Examen;

public class Libro extends Multimedia {
    private String Titulo;
    private String Autor;
    private int Anio_publicacion;
    private String Editorial;
    private String ISBN;
    private int Numero_paginas;

    // CONSTRUCTOR DE LIBRO CON LOS ELEMENTOS HERDADOS DE MULTIMEDIA
    public Libro(int identificador_unico, String titulo, String autor, int anio_publicacion, String editorial, String ISBN, int numero_paginas) {
        super(identificador_unico++);
        Titulo = titulo;
        Autor = autor;
        Anio_publicacion = anio_publicacion;
        Editorial = editorial;
        this.ISBN = ISBN;
        Numero_paginas = numero_paginas;
    }

    // SETTERS Y GETTERS
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAnio_publicacion() {
        return Anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        Anio_publicacion = anio_publicacion;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumero_paginas() {
        return Numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        Numero_paginas = numero_paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Anio_publicacion=" + Anio_publicacion +
                ", Editorial='" + Editorial + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Numero_paginas=" + Numero_paginas +
                '}';
    }
}
