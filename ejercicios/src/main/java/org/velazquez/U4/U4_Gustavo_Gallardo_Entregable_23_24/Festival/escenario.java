package org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival;

public class escenario {
    public cantante cantante1;
    public cantante cantante2;
    private String nombre_escenario;
    private String ubicacion;
    private int capacidad;
    private String[] lista_cantantes;
    private String[] escenarios = new String[3];
    private int indice;

    public escenario(String nombre_escenario, String ubicacion, int capacidad) {
        this.nombre_escenario = nombre_escenario;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.cantante1 = new cantante("Gabriel Armando Mora Quintero", "Mora", 27, "Bayamon, Puerto Rico");
        this.cantante2 = new cantante("Salomon Villada Hoyos", "Feid", 31, "Medellín, Colombia");
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNombre_escenario() {
        return nombre_escenario;
    }

    public void setNombre_escenario(String nombre_escenario) {
        this.nombre_escenario = nombre_escenario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;

    }

    public void mostrar_cantantes() {
        System.out.println(cantante1);
        System.out.println(cantante2);
    }

    public void lista_escenario() {
        for (int i = 0; i < escenarios.length; i++) {
            escenarios[indice] = nombre_escenario + ubicacion + capacidad;
            indice++;
        }
    }

    public String[] getLista_cantantes() {
        return lista_cantantes;
    }

    public void setLista_cantantes(String[] lista_cantantes) {
        this.lista_cantantes = lista_cantantes;
    }

    public String[] getEscenarios() {
        return escenarios;
    }

    public void setEscenarios(String[] escenarios) {
        this.escenarios = escenarios;
    }

    @Override
    public String toString() {
        return "escenario{" +
                "nombre_escenario='" + nombre_escenario + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", cantante1=" + cantante1 +
                ", cantante2=" + cantante2 +
                '}';
    }
}
