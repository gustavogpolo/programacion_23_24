package VERANO.POO.GESTION_USUARIOS;

import java.util.HashMap;

public class GestorUsuarios {
    private static GestorUsuarios instancia;
    private HashMap<Integer, Usuario> usuarios;

    public GestorUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public static synchronized GestorUsuarios getInstancia() {
        if (instancia == null) {
            instancia = new GestorUsuarios();
        }
        return instancia;
    }

    public void agregarUsuario(Usuario usuario) {
        try {
            if (usuarios.containsKey(usuario.getId())) {
                throw new IllegalArgumentException("El usuario con id " + usuario.getId() + " ya existe.");
            } else {
                usuarios.put(usuario.getId(), usuario);
            }

        }catch (IllegalArgumentException e){
            System.out.println("Error agregando el usuario: " + e.getMessage());
            throw e;
        }
    }

    public void eliminarUsuario(int id) {
        try{
            if (!usuarios.containsKey(id)) {
                throw new IllegalArgumentException("El usuario con id " + id + " no existe.");
            } else {
                usuarios.remove(id);
            }
        }catch (IllegalArgumentException e){
            System.out.println("Error eliminando el usuario: " + e.getMessage());
            throw e;
        }
    }
    public Usuario obtenerUsuario(int id) {
        if (!usuarios.containsKey(id)) {
            throw new IllegalArgumentException("El usuario con id " + id + " no existe.");
        }
        return usuarios.get(id);
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios.values()) {
            usuario.imprimir();
        }
}}

