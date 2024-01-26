package org.velazquez.U4.Tarea1.ej7;

public class Radio {

    private final float frecuencia_maxima = 108;
    private final float frecuencia_minima = 80;
    private float frecuencia_aumento;
    private float frecuencia;
    private int decision;

    public Radio(float frecuencia_aumento, float frecuencia) {
        this.frecuencia_aumento = frecuencia_aumento;
        this.frecuencia = frecuencia;
    }

    public int getDecision() {
        return decision;
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }

    // getter y setter de frecuencia_aumento
    public float getFrecuencia_aumento() {
        return frecuencia_aumento;
    }

    public void setFrecuencia_aumento(float frecuencia_aumento) {
        this.frecuencia_aumento = frecuencia_aumento;
    }

    // getter y setter de frecuencia

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "frecuencia_aumento=" + frecuencia_aumento +
                ", frecuencia=" + frecuencia +
                '}';
    }

    public float up() {
        System.out.println("Frecuencia acutual: " + frecuencia);
        System.out.println("Aumentando frecuencia....");
        if (frecuencia >= frecuencia_maxima) {
            System.out.println("Has llegado al máximo de la banda de radiofrecuencia. ");
            frecuencia = frecuencia_minima;
            System.out.println("Nueva frecuencia: " + frecuencia);
        } else if (frecuencia < frecuencia_maxima) {
            System.out.println("Nueva frecuencia: " + frecuencia + frecuencia_aumento);
        }
        return frecuencia;
    }

    public float down() {
        System.out.println("Frecuencia acutual: " + frecuencia);
        System.out.println("Disminuyendo frecuencia....");
        if (frecuencia <= frecuencia_minima) {
            System.out.println("Has llegado al mínimo de la banda de radiofrecuencia. ");
            frecuencia = frecuencia_maxima;
            System.out.println("Nueva frecuencia: " + frecuencia);
        } else if (frecuencia > frecuencia_minima) {
            System.out.println("Nueva frecuencia: " + frecuencia + frecuencia_aumento);
        }
        return frecuencia;
    }

    public void display() {
        System.out.println(frecuencia);
    }
}


