package VERANO.POO.SISTEMA_DE_BIBLIOTECA;

import java.util.Comparator;

public class ComparadorPorId implements Comparator<ElementoBiblioteca> {
    @Override
    public int compare(ElementoBiblioteca o1, ElementoBiblioteca o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
