package org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival;

public class concierto {

    private escenario escenario;
    private String nombre_concierto;
    private String[] concierto = new String[3];
    private String fecha;
    private int indice;

    private escenario escenario1;
    private escenario escenario2;
    private escenario escenario3;

    public concierto(String nombre_concierto, String fecha) {
        this.nombre_concierto = nombre_concierto;
        this.fecha = fecha;
        this.escenario = new escenario("Main Stage", "Recinto 1", 3000);
        this.escenario1 = new escenario("Main Stage", "Recinto 1", 3000);

    }

    public org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.escenario getEscenario1() {
        return escenario1;
    }

    public void setEscenario1(org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.escenario escenario1) {
        this.escenario1 = escenario1;
    }

    public org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.escenario getEscenario2() {
        return escenario2;
    }

    public void setEscenario2(org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.escenario escenario2) {
        this.escenario2 = escenario2;
    }

    public org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.escenario getEscenario3() {
        return escenario3;
    }

    public void setEscenario3(org.velazquez.U4.U4_Gustavo_Gallardo_Entregable_23_24.Festival.escenario escenario3) {
        this.escenario3 = escenario3;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNombre_concierto() {
        return nombre_concierto;
    }

    public void setNombre_concierto(String nombre_concierto) {
        this.nombre_concierto = nombre_concierto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String[] getConcierto() {
        return concierto;
    }

    public void setConcierto(String[] concierto) {
        this.concierto = concierto;
    }

    public void lista_concierto() {
        for (int i = 0; i < concierto.length; i++) {
            concierto[indice] = nombre_concierto + fecha;
            indice++;
        }
    }

    @Override
    public String toString() {
        return "concierto{" +
                "escenario=" + escenario +
                ", nombre_concierto='" + nombre_concierto + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
