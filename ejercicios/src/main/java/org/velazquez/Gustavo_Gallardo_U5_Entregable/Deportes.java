package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public abstract class Deportes {
    protected DEPORTES nombre_deporte;
    protected Participante[] participante = new Participante[0];
    private String nombre_pabellon;

    public Deportes(DEPORTES nombre_deporte, String nombre_pabellon) {
        this.nombre_deporte = nombre_deporte;
        this.nombre_pabellon = nombre_pabellon;
    }

    public void addParticipante(Participante nombre_participante) {
        Participante[] nuevoParticipante = new Participante[participante.length + 1];
        for (int i = 0; i < participante.length; i++) {
            nuevoParticipante[i] = participante[i];
        }
        nuevoParticipante[participante.length] = nombre_participante;
        participante = nuevoParticipante;
    }

    public void getParticipante() {
        for (int i = 0; i < participante.length; i++) {
            if (participante[i] != null) {
                System.out.println(participante[i].nombre_participante);
            }
        }
    }

    public void eliminarParticipante(Participante nombre_participante) {
        int index = -1;
        for (int i = 0; i < participante.length; i++) {
            if (participante[i].equals(nombre_participante)) {
                index = i;
                break;
            }
        }

        if (index != -1) { // Si se encontró el participante
            Participante[] nuevoParticipante = new Participante[participante.length - 1];
            for (int i = 0, j = 0; i < participante.length; i++) {
                if (i != index) {
                    nuevoParticipante[j++] = participante[i];
                }
            }
            participante = nuevoParticipante;
        }
    }

    public enum DEPORTES {
        LANZATRONCOSPELAOS, PELADODEGAMBAS, BALONCESTO
    }


}
