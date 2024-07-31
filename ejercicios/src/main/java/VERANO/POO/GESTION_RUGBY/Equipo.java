package VERANO.POO.GESTION_RUGBY;

import java.util.List;

public class Equipo {
    private String nombre_equipo;
    private List<String> lista_jugadores;
    private Entrenador entrenador;

    public Equipo(String nombre_equipo, List<String> lista_jugadores ) {
        this.nombre_equipo = nombre_equipo;
        this.lista_jugadores = lista_jugadores;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(Equipo nombre_equipo) {
        this.nombre_equipo = String.valueOf(nombre_equipo);
    }

    public List<String> getLista_jugadores() {
        return lista_jugadores;
    }

    public void setLista_jugadores(List<String> lista_jugadores) {
        this.lista_jugadores = lista_jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void agregarJugador(Persona nombre){
        lista_jugadores.add(String.valueOf(nombre));
    }
    public void eliminarJugador(Persona nombre){
        lista_jugadores.remove(String.valueOf(nombre));
    }
    public void mostrarDetallesEquipo(){
        System.out.println("***********************DETALLES EQUIPO**************************");
        System.out.println("- Nombre equipo: " + nombre_equipo);
        System.out.println("- Entrenador: " );
        System.out.println("- Jugadores: ");
        for (String jugadores:lista_jugadores) {
            System.out.println(jugadores);
        }
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre_equipo='" + nombre_equipo + '\'' +
                ", lista_jugadores=" + lista_jugadores +
                ", entrenador=" + entrenador +
                '}';
    }
}
