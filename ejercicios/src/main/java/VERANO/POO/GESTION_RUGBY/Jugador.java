package VERANO.POO.GESTION_RUGBY;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Persona{
    private String posicion;
    private List<Integer> numero_tries;

    public Jugador(String nombre, int edad, String posicion, List<Integer> numero_tries) {
        super(nombre, edad);
        this.posicion = posicion;
        this.numero_tries = new ArrayList<>(numero_tries);
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public List<Integer> getNumero_tries() {
        return numero_tries;
    }

    public void setNumero_tries(List<Integer> numero_tries) {
        this.numero_tries = numero_tries;
    }

    public void anotarTry(){
        System.out.println("Try anotado por: " + getNombre());
        numero_tries.add(1);
    }

        @Override
    public void mostrarDetalles() {
            System.out.println("***********************DETALLES JUGADOR**************************");
        super.mostrarDetalles();
            System.out.println("- Posicion: " + posicion);
            System.out.println("- Numero de tries: " + numero_tries);
    }
}
