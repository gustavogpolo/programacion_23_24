//package org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24;
//
//import org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.cancion;
//import org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.cantante;
//import org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.concierto;
//import org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.escenario;
//
//public class main {
//    public static void main(String[] args) {
//
//        concierto concierto1 = new concierto("Puro Pelko", "23/06/2024");
//        concierto concierto2 = new concierto("Only Pants", "25/06/2024");
//        concierto concierto3 = new concierto("Viva España", "27/06/2024");
//
//        System.out.println(concierto1);
//
//        escenario escenario1 = new escenario("Main Stage", "Recinto 1", 3000);
//        escenario escenario2 = new escenario("Stage 2", "Recinto 2", 2000);
//        escenario escenario3 = new escenario("Stage 3", "Recinto 3", 3000);
//        escenario escenario4 = new escenario("Stage 4", "Recinto 4", 8000);
//        escenario escenario5 = new escenario("Stage 5", "Recinto 5", 6000);
//        escenario escenario6 = new escenario("Stage 6", "Recinto 6", 4000);
//        escenario escenario7 = new escenario("Stage 7", "Recinto 7", 2000);
//        escenario escenario8 = new escenario("Stage 8", "Recinto 8", 1000);
//        escenario escenario9 = new escenario("Stage 9", "Recinto 9", 9000);
//
//        System.out.println(escenario1);
//
//        cantante cantante1 = new cantante("Gabriel Armando Mora Quintero", "Mora", 27, "Bayamon, Puerto Rico");
//        cantante cantante2 = new cantante("Salomon Villada Hoyos", "Feid", 31, "Medellín, Colombia");
//        cantante cantante3 = new cantante("Michael Anthony Torres Monge", "Myke Towers", 30, "Los Angeles, EEUU");
//        cantante cantante4 = new cantante("Joaquín Palacios", "Easykid", 27, " Antofagasta, Chile");
//        cantante cantante5 = new cantante("Miguel Cantos Gómez", "Saiko", 21, "Armilla, España");
//        cantante cantante6 = new cantante("Mi madre", "Madre", 22, "Madrid, España");
//        cantante cantante7 = new cantante("Mi padre", "Padre", 22, "Madrid, España");
//        cantante cantante8 = new cantante("Mi hermana1", "Hermana1", 22, "Madrid, España");
//        cantante cantante9 = new cantante("Mi hermana2", "Hermana2", 22, "Madrid, España");
//        cantante cantante10 = new cantante("Mi perro", "Turky", 22, "Madrid, España");
//        cantante cantante11 = new cantante("Mi prima", "JulietaBombeta", 22, "Madrid, España");
//        cantante cantante12 = new cantante("Mi tatarabuela", "Tumba-andante", 22, "Madrid, España");
//        cantante cantante13 = new cantante("Chemita Dinamita", "Chema", 22, "Madrid, España");
//        cantante cantante14 = new cantante("Javi Bigotes Román", "Bigotuo", 22, "Madrid, España");
//        cantante cantante15 = new cantante("Miguel Pipas Hernandez", "El pipas", 22, "Madrid, España");
//        cantante cantante16 = new cantante("Enrique Calvo", "Don limpio", 22, "Madrid, España");
//        cantante cantante17 = new cantante("Pelko", "Pelko", 22, "Madrid, España");
//        cantante cantante18 = new cantante("Andres Chivato", "El chivato de montepinar", 22, "Madrid, España");
//
//        cancion cancion1 = new cancion("Diamonds", 3, "Trap");
//        cancion cancion2 = new cancion("Marea", 4, "Neoperreo");
//        cancion cancion3 = new cancion("Ferxxo 151", 3, "Emorap");
//        cancion cancion4 = new cancion("Ferxxo 100", 2, "Neoperreo");
//        cancion cancion5 = new cancion("La falda", 3, "Trap");
//        cancion cancion6 = new cancion("Los Bo", 2, "Trap");
//        cancion cancion7 = new cancion("Pa' que pichea", 3, "Neoperreo");
//        cancion cancion8 = new cancion("Siempre pienso en ti", 5, "Emorap");
//        cancion cancion9 = new cancion("Polaris", 3, "Neoperreo");
//        cancion cancion10 = new cancion("Extasisss", 3, "Emorap");
//        cancion cancion11 = new cancion("Piel de cordero", 3, "Trap");
//        cancion cancion12 = new cancion("dslfnas", 3, "Trap");
//        cancion cancion13 = new cancion("l<dcb", 3, "Neoperreo");
//        cancion cancion14 = new cancion("ñasldj", 3, "Emorap");
//        cancion cancion15 = new cancion("jfaslñidf", 3, "Trap");
//        cancion cancion16 = new cancion("dlskjafpo", 3, "Neoperreo");
//        cancion cancion17 = new cancion("aLSDFJÑ", 3, "Emorap");
//        cancion cancion18 = new cancion("asdyfg", 3, "Trap");
//        cancion cancion19 = new cancion("Diamonds", 3, "Trap");
//        cancion cancion20 = new cancion("Marea", 4, "Neoperreo");
//        cancion cancion21 = new cancion("Ferxxo 151", 3, "Emorap");
//        cancion cancion22 = new cancion("Ferxxo 100", 2, "Neoperreo");
//        cancion cancion23 = new cancion("La falda", 3, "Trap");
//        cancion cancion24 = new cancion("Los Bo", 2, "Trap");
//        cancion cancion25 = new cancion("Pa' que pichea", 3, "Neoperreo");
//        cancion cancion26 = new cancion("Siempre pienso en ti", 5, "Emorap");
//        cancion cancion27 = new cancion("Polaris", 3, "Neoperreo");
//        cancion cancion28 = new cancion("Extasisss", 3, "Emorap");
//        cancion cancion29 = new cancion("Piel de cordero", 3, "Trap");
//        cancion cancion30 = new cancion("dslfnas", 3, "Trap");
//        cancion cancion31 = new cancion("l<dcb", 3, "Neoperreo");
//        cancion cancion32 = new cancion("ñasldj", 3, "Emorap");
//        cancion cancion33 = new cancion("jfaslñidf", 3, "Trap");
//        cancion cancion34 = new cancion("dlskjafpo", 3, "Neoperreo");
//        cancion cancion35 = new cancion("aLSDFJÑ", 3, "Emorap");
//        cancion cancion36 = new cancion("asdyfg", 3, "Trap");
//    }
//}
