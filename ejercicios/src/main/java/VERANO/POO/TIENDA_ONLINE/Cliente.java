package VERANO.POO.TIENDA_ONLINE;

public class Cliente {
    private String nombre_cliente;
    private String email;
    private String direccion_envio;

    // Constructor para los objetos cliente
    public Cliente(String nombre_cliente, String email, String direccion_envio) {
        this.nombre_cliente = nombre_cliente;
        this.email = email;
        this.direccion_envio = direccion_envio;
    }

    //Setters y Getters para la clase cliente

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    //MOSTRAR INFO CLIENTE
    public void mostrarinfocliente(){
        System.out.println("----------------------------------------");
        System.out.println("- Nombre del cliente: " + nombre_cliente);
        System.out.println("- Email: " + email);
        System.out.println("- Dirección Envío: " + direccion_envio);
        System.out.println("----------------------------------------");
    }
}
