package VERANO.LISTAS;

import java.util.HashMap;

//Crea un programa que gestione una agenda telefónica. Debe permitir
//        agregar contactos, eliminar contactos y mostrar la agenda completa.
public class Ej6 {
    public static void main(String[] args) {
        HashMap<String,Integer> agendacontactos = new HashMap<>();

        agendacontactos.put("Curro", 640125987);
        agendacontactos.put("Yo", 652841763);
        agendacontactos.put("Sergio", 690101478);
        agendacontactos.put("Fernando", 657984321);
        agendacontactos.put("Salva", 722985632);

        agendacontactos.remove("Curro",640125987);

        System.out.println("Agenda completa: " + agendacontactos);
    }
}
