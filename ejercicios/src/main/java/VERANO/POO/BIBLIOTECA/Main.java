package VERANO.POO.BIBLIOTECA;

import static VERANO.POO.BIBLIOTECA.GENERO.*;

public class Main {
    public static void main(String[] args) {
        //Creo primero los autores porque necesito autor para crear libro
        Autor autor1 = new Autor("Autor1", "Espanol");
        Autor autor2 = new Autor("Autor2", "Portugues");
        Autor autor3 = new Autor("Autor3", "Andorrano");

        //Libros:
        //Ficcion
        Libro libro1 = new Libro("Libro ficcion 1", FICCION, autor1, 10);
        Libro libro2 = new Libro("Libro ficcion 2", FICCION, autor1, 2);
        Libro libro3 = new Libro("Libro ficcion 3", FICCION, autor2, 4);
        Libro libro4 = new Libro("Libro ficcion 4", FICCION, autor3, 8);
        Libro libro5 = new Libro("Libro ficcion 5", FICCION, autor2, 7);

        //Misterio
        Libro libro6 = new Libro("Libro misterio 1", MISTERIO, autor2, 5);
        Libro libro7 = new Libro("Libro misterio 2", MISTERIO, autor3, 5);
        Libro libro8 = new Libro("Libro misterio 3", MISTERIO, autor1, 3);
        Libro libro9 = new Libro("Libro misterio 4", MISTERIO, autor3, 1);
        Libro libro10 = new Libro("Libro misterio 5", MISTERIO, autor3, 2);

        //Ciencia ficcion
        Libro libro11 = new Libro("Libro ciencia ficcion 1", CIENCIA_FICCION, autor3, 3);
        Libro libro12 = new Libro("Libro ciencia ficcion 2", CIENCIA_FICCION, autor2, 5);
        Libro libro13 = new Libro("Libro ciencia ficcion 3", CIENCIA_FICCION, autor1, 6);
        Libro libro14 = new Libro("Libro ciencia ficcion 4", CIENCIA_FICCION, autor2, 7);
        Libro libro15 = new Libro("Libro ciencia ficcion 5", CIENCIA_FICCION, autor2, 8);

        //Biografía
        Libro libro16 = new Libro("Libro Biografía 1", BIOGRAFIA, autor1, 1);
        Libro libro17 = new Libro("Libro Biografía 2", BIOGRAFIA, autor2, 2);
        Libro libro18 = new Libro("Libro Biografía 3", BIOGRAFIA, autor3, 3);
        Libro libro19 = new Libro("Libro Biografía 4", BIOGRAFIA, autor2, 4);
        Libro libro20 = new Libro("Libro Biografía 5", BIOGRAFIA, autor1, 5);

        //No Ficcion
        Libro libro21 = new Libro("Libro no ficcion 1", NO_FICCION, autor1, 2);
        Libro libro22 = new Libro("Libro no ficcion 2", NO_FICCION, autor1, 3);
        Libro libro23 = new Libro("Libro no ficcion 3", NO_FICCION, autor2, 0);
        Libro libro24 = new Libro("Libro no ficcion 4", NO_FICCION, autor3, 1);
        Libro libro25 = new Libro("Libro no ficcion 5", NO_FICCION, autor2, 2);

        //Creo la biblioteca

        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregarlibro(libro1);
        biblioteca1.agregarlibro(libro2);
        biblioteca1.agregarlibro(libro3);
        biblioteca1.agregarlibro(libro4);
        biblioteca1.agregarlibro(libro5);

        biblioteca1.eliminarlibro(libro1);

        autor2.mostrarinfoautor();
        autor1.mostrarinfoautor();

        libro3.mostrarinfolibro();

        biblioteca1.mostrarinformacionlibros();
    }
}
