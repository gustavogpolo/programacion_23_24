package VERANO.POO.TIENDA_ONLINE;

import VERANO.POO.BIBLIOTECA.Libro;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Cliente> clientes;
    private List<Producto> productos;

    public Tienda() {
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    //Metodos
    public void anadirproducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarproducto(Producto producto){
        productos.remove(producto);
    }

    public void mostrarinfoproductos_tienda(){
        System.out.println("*************************** PRODUCTOS *********************************");
        for (Producto producto1: productos){
            producto1.mostrarinfoproducto();
        }
    }
    public void AnadirCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void mostrarinfocliente_tienda(){
        System.out.println("*************************** CLIENTES *********************************");
        for (Cliente cliente1 : clientes){
            cliente1.mostrarinfocliente();
        }
    }
}