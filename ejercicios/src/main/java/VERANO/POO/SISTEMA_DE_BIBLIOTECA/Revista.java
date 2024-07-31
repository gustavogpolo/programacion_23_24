package VERANO.POO.SISTEMA_DE_BIBLIOTECA;

public class Revista extends ElementoBiblioteca implements Imprimible{

    public Revista(int id, String titulo) {
        super(id, titulo);
    }

    @Override
    public void prestamo() {
        System.out.println("Revista en préstamo: " + getTitulo());
    }

    @Override
    public void devolucion() {
        System.out.println("Revista en préstamo: " + getTitulo());
    }

    @Override
    public void imprimir() {
        System.out.println("Revista: " + getTitulo() );
    }
}
