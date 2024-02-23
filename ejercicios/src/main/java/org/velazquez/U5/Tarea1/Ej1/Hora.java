package org.velazquez.U5.Tarea1.Ej1;

public class Hora {

    private int hora;

    private int minutos;


    // Constructor
    public Hora(int hora, int minutos) {
        setMinutos(minutos);
        setHora(hora);
    }

    // Setters y Getters de "Hora"
    public void setHora(int hora) {
        if (hora < 24) {
            this.hora = hora;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos < 60) {
            this.minutos = minutos;
        }
    }

    // To string
    @Override
    public String toString() {
        return hora + ":" + minutos;
    }
    // Métodos

    public void inc() {
        System.out.println("La hora se incrementa en 1 minuto");
        if (minutos + 1 < 60) {
            minutos = minutos + 1;
        } else {
            minutos = 0;
            hora = hora + 1;
        }
    }
}
