package VERANO.POO.FUTBOL_HASHCODE.Clases;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class GestorDeFutbol {
    
    private static final Logger logger = Logger.getLogger(GestorDeFutbol.class.getName());
    private List<Equipo> equipos;
    private Map<String, Entrenador> entrenadores;

    public GestorDeFutbol() {
        this.equipos = new ArrayList<>();
        this.entrenadores = new HashMap<>();
        try{
            logger.addHandler(new FileHandler("Futbol.log",true));
        }catch (IOException e){
            logger.severe("Error al crear el archivo de logs");
        }
    }
    public void agregarEquipo(Equipo equipo){
        equipos.add(equipo);
        logger.info("Equipo agregado: " + equipo.getNombre());
    }
    public void agregarEntrenador(Entrenador entrenador){
        entrenadores.put(entrenador.getNombre(), entrenador);
        logger.info("Entrenador agregado: " + entrenador.getNombre());
    }
    public void guardarDatos(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("equipos.txt"))){
            for (Equipo equipo : equipos){
                writer.write(equipo.toString());
                writer.newLine();
            }
            logger.info("Datos de equipo guardados.");
        }catch (IOException e) {
            logger.severe("Error al guadar datos de equipo " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("entrenadores.txt"))){
            for ( Map.Entry<String, Entrenador> entry: entrenadores.entrySet()){
                Entrenador entrenador = entry.getValue();
                writer.write(entrenador.toString());
                writer.newLine();
            }
            logger.info("Datos de entrebadores guardados.");
        } catch (IOException e) {
            logger.severe("Error al guardar datos de entrenadores: "+ e.getMessage());
        }
    }
    public void cargarDatos(){
        try(BufferedReader reader = new BufferedReader(new FileReader("equipos.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            logger.info("Datos de equipos guardados.");
        } catch (IOException e) {
            logger.severe("Error al cargar datos de equipos: " + e.getMessage());
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("entrenadores.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            logger.info("Datos de entrenadores guardados.");
        } catch (IOException e) {
            logger.severe("Error al cargar datos de entrenadores: " + e.getMessage());
        }
    }
    public List<Jugador> buscarJugadoresPorPosicion(String posicion){
        List<Jugador> jugadoresPorPosicion = new ArrayList<>();
        for (Equipo equipo : equipos){
            for (Jugador jugador : equipo.getJugadores()){
                if (jugador.getPosicion().equals(posicion)){
                    jugadoresPorPosicion.add(jugador);
                }
            }
        }
        return jugadoresPorPosicion;
    }
    public List<Entrenador> obtenerEntrenadorConExperiencia(int anosExperiencia){
        List<Entrenador> entrenadoresConExperiencia = new ArrayList<>();
        for (Entrenador entrenador:
             entrenadores.values()) {
            if (entrenador.getAnosExperiencia() >= anosExperiencia){
                entrenadoresConExperiencia.add(entrenador);
            }
        }
        return entrenadoresConExperiencia;
    }
}
