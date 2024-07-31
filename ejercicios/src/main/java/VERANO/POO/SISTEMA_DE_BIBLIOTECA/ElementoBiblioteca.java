package VERANO.POO.SISTEMA_DE_BIBLIOTECA;

public abstract class ElementoBiblioteca {
    private int id;
    private String titulo;

    public ElementoBiblioteca() {
    }
    public ElementoBiblioteca(int id, String titulo) {
        try {
            if (titulo == null || titulo.isEmpty()) {
                throw new IllegalArgumentException("El título no puede ser vacío");
            } else {
                this.id = id;
                this.titulo = titulo;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error en el constructor: " + e.getMessage());
            throw e;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void prestamo();
    public abstract void devolucion();
}
