package org.velazquez.Gallardo_Polo_U4_U5_Examen;

public class Pelicula extends Multimedia implements Reproducible {
    private String Titulo;
    private String Director;
    private int Anio_estreno;
    private int Duracion;
    private String Productora;
    private String Pais;

    // CONSTRUCTOR CON ELEMENTOS PROPIOS Y HEREDADOS
    public Pelicula(int identificador_unico, String titulo, String director, int anio_estreno, int duracion, String productora, String pais) {
        super(identificador_unico);
        Titulo = titulo;
        Director = director;
        Anio_estreno = anio_estreno;
        Duracion = duracion;
        Productora = productora;
        Pais = pais;
    }

    // SETTER Y GETTERS
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getAnio_estreno() {
        return Anio_estreno;
    }

    public void setAnio_estreno(int anio_estreno) {
        Anio_estreno = anio_estreno;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public String getProductora() {
        return Productora;
    }

    public void setProductora(String productora) {
        Productora = productora;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    //METODOS DE LA INTERFAZ REPRODUCIBLE
    public void Play() {
        System.out.println("Reproduciendo película" + Titulo);
    }

    @Override
    public void Pause() {
        System.out.println("Pausando película" + Titulo);
    }

    @Override
    public void Stop() {
        System.out.println("Parando película" + Titulo);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Titulo='" + Titulo + '\'' +
                ", Director='" + Director + '\'' +
                ", Anio_estreno=" + Anio_estreno +
                ", Duracion=" + Duracion +
                ", Productora='" + Productora + '\'' +
                ", Pais='" + Pais + '\'' +
                '}';
    }
}

