package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public class Chelimpics {
    public static void main(String[] args) {

        Juegos juego = new Juegos(2020, "Sevilla");

        Paises p1 = new Paises(5, "España");
        Paises p2 = new Paises(5, "Alemania");
        Paises p3 = new Paises(5, "Brasil");

        juego.addPais(p1);
        juego.addPais(p2);
        juego.addPais(p3);
        juego.eliminarPais(p2);
        juego.getPais();

        Deportes d1 = new Baloncesto(Deportes.DEPORTES.BALONCESTO, "Pabellon 1", 8);
        Deportes d2 = new PeladoDeGambas(Deportes.DEPORTES.PELADODEGAMBAS, "Pabellon 2", 5);
        Deportes d3 = new LanzaTroncosPelaos(Deportes.DEPORTES.LANZATRONCOSPELAOS, "Pabellon Aire Libre", 4);

        juego.addDeporte(d1);
        juego.addDeporte(d2);
        juego.addDeporte(d3);
        juego.getDeporte();
        juego.eliminarDeporte(d2);
        juego.getDeporte();

        Participante participante1 = new PeladoresGambas("Leandro", 18);
        Participante participante2 = new Baloncestitas("Javi", 21);
        Participante participante3 = new Lanzadores_Troncos("Pelko", 22);

        d1.addParticipante(participante1);
        d2.addParticipante(participante2);
        d3.addParticipante(participante3);

        d1.getParticipante();
        d2.getParticipante();
        d3.getParticipante();


    }
}
