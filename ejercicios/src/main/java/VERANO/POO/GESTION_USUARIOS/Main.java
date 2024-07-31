package VERANO.POO.GESTION_USUARIOS;

public class Main {
    public static void main(String[] args) {
        GestorUsuarios gestor = GestorUsuarios.getInstancia();

        // Creación de usuarios especiales
        Usuario usuario1 = new UsuarioEspecial(1, "Juan", 25, 1);
        Usuario usuario2 = new UsuarioEspecial(2, "Ana", 30, 2);

        // Agregar usuarios
        try {
            gestor.agregarUsuario(usuario1);
            gestor.agregarUsuario(usuario2);
            // Intentar agregar un usuario con el mismo id
            gestor.agregarUsuario(new UsuarioEspecial(1, "Pedro", 22, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar usuario: " + e.getMessage());
        }

        // Listar usuarios
        System.out.println("Usuarios en el gestor:");
        gestor.listarUsuarios();

        // Eliminar usuario
        try {
            gestor.eliminarUsuario(1);
            // Intentar eliminar un usuario que no existe
            gestor.eliminarUsuario(3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
        }

        // Listar usuarios después de eliminar
        System.out.println("Usuarios en el gestor después de eliminar:");
        gestor.listarUsuarios();
    }
}