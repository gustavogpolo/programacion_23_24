package org.velazquez.Gallardo_Polo_U4_U5_Examen;

public class Main {
    public static void main(String[] args) {
        //CREO OBJETOS SERIE
        Serie s1 = new Serie(1, "¿Cuantos legos me caben en la nariz?", "LEandro", 2023, 2);
        Serie s2 = new Serie(1, "Huelva es mejor que sevilla", "LEandro", 2023, 2);
        Serie s3 = new Serie(1, "las mejores papas bravas de Sevilla", "Gustavo", 2023, 2);
        s1.add_capitulo("3");
        s1.dar_por_finalizado();
        // CREO OBJETOS PELICULA
        Pelicula p1 = new Pelicula(0, "Mi hermana está loca", "Chemits", 2018, 180, "DAW Producciones", "España");
        Pelicula p2 = new Pelicula(0, "Spider-man no way outta Latam", "Chemits", 2018, 180, "DAW Producciones", "España");
        Pelicula p3 = new Pelicula(0, "¿Qué está pasando?, si me apruebas te lo digo", "Gustavo", 2018, 180, "DAW Producciones", "España");
        p2.getAnio_estreno();

        // CREO OBJETOS LIBRO
        Libro l1 = new Libro(0, "Teo va al matadero", "No se quien escribe los libros de \"Teo va a...\"", 2020, "Lo Mundo", "22-34456-642", 200);
        Libro l2 = new Libro(0, "Teo va a clase de Sistemas con JC", "No se quien escribe los libros de \"Teo va a...\"", 2020, "Lo Mundo", "22-34456-642", 200);
        Libro l3 = new Libro(0, "Teo va a un club Swinger", "No se quien escribe los libros de \"Teo va a...\"", 2020, "Lo Mundo", "22-34456-642", 200);

    }
}
