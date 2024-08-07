package VERANO.POO.FUTBOL_HASHCODE.Clases;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorDeFutbol gestor = new GestorDeFutbol();

        Entrenador entrenador1 = new Entrenador("Zinedine Zidane",48,10);
        gestor.agregarEntrenador(entrenador1);

        List<Jugador> jugadores = Arrays.asList(
                new Jugador("Cristiano Ronaldo", "Delantero", 7),
                new Jugador("Segio Ramos", "Defensa",4)
        );

        Equipo equipo1 = new Equipo("Real Madrid",jugadores,entrenador1);
        gestor.agregarEquipo(equipo1);

        entrenador1.setEquipo(equipo1);

        gestor.guardarDatos();

        gestor.cargarDatos();

        List<Jugador> delanteros = gestor.buscarJugadoresPorPosicion("Delantero");
        delanteros.forEach(jugador -> System.out.println(jugador.getNombre()));

        List<Entrenador> entranadoresConExperiencia = gestor.obtenerEntrenadorConExperiencia(5);
        entranadoresConExperiencia.forEach(entrenador -> System.out.println(entrenador.getNombre()));
    }
}
