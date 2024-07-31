package VERANO.POO.SISTEMA_DE_BIBLIOTECA;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static Biblioteca instancia;
    private List<ElementoBiblioteca> elementosbiblioteca;

    private Biblioteca() {
        elementosbiblioteca = new ArrayList<>();
    }

    public static synchronized Biblioteca getInstance() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    public void agregarElemento(ElementoBiblioteca elemento) throws Exception {
        for (ElementoBiblioteca e : elementosbiblioteca) {
            if (e.getId() == elemento.getId()) {
                throw new Exception("El elemento con ID " + elemento.getId() + " ya existe.");
            }
        }
        elementosbiblioteca.add(elemento);
    }

    public void eliminarElemento(int id) throws Exception {
        ElementoBiblioteca elementoAEliminar = null;
        for (ElementoBiblioteca e : elementosbiblioteca) {
            if (e.getId() == id) {
                elementoAEliminar = e;
                break;
            }
        }
        if (elementoAEliminar == null) {
            throw new Exception("El elemento con ID " + id + " no existe.");
        }
        elementosbiblioteca.remove(elementoAEliminar);
    }

    public List<ElementoBiblioteca> getElementosbiblioteca() {
        return elementosbiblioteca;
    }
}
