package VERANO.POO.GESTION_USUARIOS;

public class UsuarioEspecial extends Usuario{
    private int id_especial;

    public UsuarioEspecial() {
    }

    public UsuarioEspecial(int id, String nombre, int edad, int id_especial) {
        super(id, nombre, edad);
        this.id_especial = id_especial;
    }

    public int getId_especial() {
        return id_especial;
    }

    public void setId_especial(int id_especial) {
        this.id_especial = id_especial;
    }
}
