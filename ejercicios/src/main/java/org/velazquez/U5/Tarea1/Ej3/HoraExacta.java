package org.velazquez.U5.Tarea1.Ej3;

import org.velazquez.U5.Tarea1.Ej1.Hora;

public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int hora, int minutos) {
        super(hora, minutos);
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    
    public void inc() {
        System.out.println("La hora se incrementa en 1 segundo");
        if (segundos + 1 < 60) {
            segundos = segundos + 1;
        } else {
            segundos = 0;
        }
    }
}
