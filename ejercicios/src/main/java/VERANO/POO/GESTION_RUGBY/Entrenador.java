package VERANO.POO.GESTION_RUGBY;

public class Entrenador extends Persona{
    private int anios_experiencia;
    private Equipo equipo;

    public Entrenador(String nombre, int edad, int anios_experiencia, Equipo equipo) {
        super(nombre, edad);
        this.anios_experiencia = anios_experiencia;
        this.equipo = equipo;
    }
    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    public void setAnios_experiencia(int anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("***********************DETALLES ENTRENADOR**************************");
        super.mostrarDetalles();
        System.out.println("- Años de experiencia: " + anios_experiencia);
        System.out.println("- Equipo: " + equipo.getNombre_equipo());
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "anios_experiencia=" + anios_experiencia +
                ", equipo=" + equipo.getNombre_equipo() +
                '}';
    }
}
