package org.velazquez.Gallardo_Polo_U4_U5_Examen;

import java.util.Arrays;

public class Catalogo {
    protected Multimedia[] multimedia = new Multimedia[0];
    private int indice_multimedia = 0;

    //ELIMINAR Y AÑADIR MULTIMEDIA
    public void eliminar_multimedia(Multimedia elemento) {
        String[] copia = new String[multimedia.length - 1];
        int copia_indice = 0;
        for (int i = 0; i < multimedia.length; i++) {
            if (!multimedia[i].equals(elemento)) {
                copia[copia_indice] = multimedia[i].toString();
                copia_indice++;
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    public void add_multimedia(Multimedia elemento) {
        if (indice_multimedia == multimedia.length) {
            multimedia = Arrays.copyOf(multimedia, multimedia.length + 1);
        }

        multimedia[indice_multimedia] = elemento;
        indice_multimedia++;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "multimedia=" + Arrays.toString(multimedia) +
                ", indice_multimedia=" + indice_multimedia +
                '}';
    }
}
