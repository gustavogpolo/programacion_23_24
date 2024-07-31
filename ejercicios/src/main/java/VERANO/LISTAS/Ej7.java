package VERANO.LISTAS;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

//    Crea un programa que gestione un registro de empleados con su nombre y
//            salario, manteniendo el orden de inserción.
public class Ej7 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> empleadosysalario = new LinkedHashMap<>();

        empleadosysalario.put("Curro", 1500.00);
        empleadosysalario.put("Fer",2341.59);
        empleadosysalario.put("Sergio",2100.36);
        empleadosysalario.put("Salva",1936.25);
        empleadosysalario.put("Yo",999999.99);

        System.out.println("Empleados y sus salarios: " + empleadosysalario);
    }
}
