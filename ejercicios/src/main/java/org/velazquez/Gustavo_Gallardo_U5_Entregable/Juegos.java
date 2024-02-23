package org.velazquez.Gustavo_Gallardo_U5_Entregable;

import java.util.Arrays;

public class Juegos {

    private int anio_celebracion;
    private String sede;
    private Paises[] pais = new Paises[0];
    private Deportes[] deporte = new Deportes[0];


    public Juegos(int anio_celebracion, String sede) {
        if (this.anio_celebracion % 4 == 0) {
            this.anio_celebracion = anio_celebracion;
        } else {
            System.out.println("Introduzca una fecha correcta");
        }
        this.sede = sede;
    }


    public void addPais(Paises nombre_pais) {
        Paises[] nuevoPais = new Paises[pais.length + 1];
        for (int i = 0; i < pais.length; i++) {
            nuevoPais[i] = pais[i];
        }
        nuevoPais[pais.length] = nombre_pais;
        pais = nuevoPais;
    }


    public void getPais() {
        for (int i = 0; i < pais.length; i++) {
            if (pais[i] != null) {
                System.out.println(pais[i].nombre_pais);
            }
        }
    }

    public void eliminarPais(Paises nombre_pais) {
        int index = -1;
        for (int i = 0; i < pais.length; i++) {
            if (pais[i].equals(nombre_pais)) {
                index = i;
                break;
            }
        }

        if (index != -1) { // Si se encontró el país
            Paises[] nuevoPais = new Paises[pais.length - 1];
            for (int i = 0, j = 0; i < pais.length; i++) {
                if (i != index) {
                    nuevoPais[j++] = pais[i];
                }
            }
            pais = nuevoPais;
        }


    }

    public void addDeporte(Deportes nombre_deporte) {
        Deportes[] nuevoDeporte = new Deportes[deporte.length + 1];
        for (int i = 0; i < deporte.length; i++) {
            nuevoDeporte[i] = deporte[i];
        }
        nuevoDeporte[deporte.length] = nombre_deporte;
        deporte = nuevoDeporte;
    }

    public void getDeporte() {
        for (int i = 0; i < deporte.length; i++) {
            if (deporte[i] != null) {
                System.out.println(deporte[i].nombre_deporte);
            }
        }
    }

    public void eliminarDeporte(Deportes nombre_deporte) {
        int index = -1;
        for (int i = 0; i < deporte.length; i++) {
            if (deporte[i].equals(nombre_deporte)) {
                index = i;
                break;
            }
        }

        if (index != -1) { // Si se encontró el deporte
            Deportes[] nuevoDeporte = new Deportes[deporte.length - 1];
            for (int i = 0, j = 0; i < deporte.length; i++) {
                if (i != index) {
                    nuevoDeporte[j++] = deporte[i];
                }
            }
            deporte = nuevoDeporte;
        }
    }
}
