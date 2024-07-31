package VERANO.POO.SISTEMA_DE_BIBLIOTECA;

public class Libro extends ElementoBiblioteca implements Imprimible{
    public Libro(int id, String titulo) {
        super(id, titulo);
    }

    @Override
    public void prestamo() {
        System.out.println("Libro en préstamo: " + getTitulo());
    }

    @Override
    public void devolucion() {
        System.out.println("Libro devuelto: " + getTitulo());

    }

    @Override
    public void imprimir() {
        System.out.println("Libro: " + getTitulo());
    }


}
