package VERANO.POO.GESTION_USUARIOS;

public abstract class Usuario implements Imprimir {
    private int id;
    private String nombre;
    private int edad;

    public Usuario() {
    }

    public Usuario(int id, String nombre, int edad) {
        try {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad debe ser mayor o igual a 0.");
            } else {
                this.id = id;
                this.nombre = nombre;
                this.edad = edad;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error en el constructor: " + e.getMessage());
            throw e;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        try {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad debe ser mayor o igual a 0.");
            } else {
                this.edad = edad;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error en setEdad: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public String toString() {
        return "ID del Usuairo: " + id +
                ", Nombre del Usuario: '" + nombre +
                ", Edad del Usuario: " + edad
                ;
    }

    @Override
    public void imprimir() {
        System.out.println("Usuario");
        System.out.println("ID: " + getId());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nombre :" + getNombre());
    }


}
