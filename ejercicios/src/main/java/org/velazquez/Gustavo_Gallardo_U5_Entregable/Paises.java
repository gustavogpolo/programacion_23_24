package org.velazquez.Gustavo_Gallardo_U5_Entregable;

public class Paises implements Comparable<Paises> {
    protected String nombre_pais;
    private int num_participantes;

    public Paises(int num_participantes, String nombre_pais) {
        this.num_participantes = num_participantes;
        this.nombre_pais = nombre_pais;
    }

    @Override
    public int compareTo(Paises pais) {
        if (this.num_participantes < pais.num_participantes) {
            return -1;
        } else if (this.num_participantes > pais.num_participantes) {
            return 1;
        }
        return 0;
    }
}
