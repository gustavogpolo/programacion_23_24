package VERANO.LISTAS;

import java.util.TreeMap;

//Crea un programa que gestione un directorio de teléfonos y los muestre
//        ordenados por el nombre del contacto
public class Ej8 {
    public static void main(String[] args) {
        TreeMap<String,Integer> directoriodetelefonos = new TreeMap<>();

        directoriodetelefonos.put( "Casa",954369874);
        directoriodetelefonos.put( "Papa",640148695);
        directoriodetelefonos.put( "Casa tita",954876321);

        System.out.println("Directorio de telefonos ordenados por nombre de contacto: " + directoriodetelefonos);
    }
}
