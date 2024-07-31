package VERANO.POO.BIBLIOTECA;

public class Libro {
    private String titulo;

    private Enum GENERO;

    private Autor autor;

    private int Copias_disponibles;

    //CONSTRUCTOR DE LA CLASE LIBRO

    public Libro(String titulo, Enum genero, Autor autor, int copias_disponibles) {
        this.titulo = titulo;
        GENERO = genero;
        this.autor = autor;
        Copias_disponibles = copias_disponibles;
    }


    //SETTER Y GETTER DE LA CLASE LIBRO


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Enum getGENERO() {
        return GENERO;
    }

    public void setGENERO(Enum GENERO) {
        this.GENERO = GENERO;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getCopias_disponibles() {
        return Copias_disponibles;
    }

    public void setCopias_disponibles(int copias_disponibles) {
        Copias_disponibles = copias_disponibles;
    }

    //METODO PARA MOSTRAR INFORMACION DEL LIBRO
    public void mostrarinfolibro() {
        System.out.println("------------------------------");
        System.out.println("- Título: " + titulo);
        System.out.println("- Género: " + GENERO);
        System.out.println("- Autor: " + autor);
        System.out.println("- Copias disponibles: " + Copias_disponibles);
        System.out.println("------------------------------");
    }
}
