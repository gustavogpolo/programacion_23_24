package VERANO.POO.GESTION_RUGBY;

import java.util.ArrayList;
import java.util.List;
import static VERANO.POO.GESTION_RUGBY.Equipo.*;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Gustavo Gallardo Polo", 19,"Hooker", new ArrayList<>());
        jugador1.anotarTry();
        Jugador jugador2 = new Jugador("Salvador Morales", 17,"Loose Head Prop", new ArrayList<>());
        jugador1.mostrarDetalles();
        jugador2.mostrarDetalles();

        List<String> jugadores = new ArrayList<>();
        jugadores.add(jugador1.getNombre());
        jugadores.add(jugador2.getNombre());

        Equipo equipo = new Equipo("Real Ciencias de Sevilla", jugadores);

        Entrenador entrenador1 = new Entrenador("Pedro Martinez", 45, 20, equipo);
        entrenador1.mostrarDetalles();

        equipo.setEntrenador(entrenador1);


        equipo.mostrarDetallesEquipo();

        System.out.println(equipo);

    }
}
