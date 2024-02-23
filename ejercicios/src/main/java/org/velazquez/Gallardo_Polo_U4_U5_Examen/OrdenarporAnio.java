package org.velazquez.Gallardo_Polo_U4_U5_Examen;

import java.util.Comparator;

public class OrdenarporAnio implements Comparator<Pelicula> {

    //COMPARATOR PARA ORDENAR POR AÑO
    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        if (o1.getAnio_estreno() > o2.getAnio_estreno()) {
            return 1;
        } else if (o1.getAnio_estreno() < o2.getAnio_estreno()) {
            return -1;
        } else {
            return 0;
        }
    }
}
