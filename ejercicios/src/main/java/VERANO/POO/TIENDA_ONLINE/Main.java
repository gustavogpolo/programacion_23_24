package VERANO.POO.TIENDA_ONLINE;
import static VERANO.POO.TIENDA_ONLINE.CATEGORIA.*;

public class Main {
    public static void main(String[] args) {
        //Creo los clientes
        Cliente cliente1 = new Cliente("Cliente 1","cliente1@gmail.com","C/ La calle del cliente 1, 1A");
        Cliente cliente2 = new Cliente("Cliente 2","cliente2@gmail.com","C/ La calle del cliente 2, 2A");
        Cliente cliente3 = new Cliente("Cliente 3","cliente3@gmail.com","C/ La calle del cliente 3, 3A");
        Cliente cliente4 = new Cliente("Cliente 4","cliente4@gmail.com","C/ La calle del cliente 4, 4A");
        Cliente cliente5 = new Cliente("Cliente 5","cliente5@gmail.com","C/ La calle del cliente 5, 5A");

        //Creo los productos
        Producto producto1 = new Producto("Producto1",ELECTRONICA,1.99,10);
        Producto producto2 = new Producto("Producto2",ROPA,8.99,1);
        Producto producto3 = new Producto("Producto3",HOGAR,9.99,23);
        Producto producto4 = new Producto("Producto4",JUGUETES,10.99,54);
        Producto producto5 = new Producto("Producto5",LIBROS,11.99,15);
        Producto producto6 = new Producto("Producto6",ELECTRONICA,12.99,12);
        Producto producto7 = new Producto("Producto7",ROPA,13.99,7);
        Producto producto8 = new Producto("Producto8",HOGAR,14.99,6);
        Producto producto9 = new Producto("Producto9",JUGUETES,15.99,30);
        Producto producto10 = new Producto("Producto10",LIBROS,16.99,20);

        // Creo la tienda
        Tienda tienda1 = new Tienda();

        //AÑADIR CLIENTES A LA TIENDA
        tienda1.AnadirCliente(cliente1);
        tienda1.AnadirCliente(cliente2);
        tienda1.AnadirCliente(cliente3);
        tienda1.AnadirCliente(cliente4);
        tienda1.AnadirCliente(cliente5);

        //AÑADIR PRODUCTOS A LA TIENDA
        tienda1.anadirproducto(producto1);
        tienda1.anadirproducto(producto1);
        tienda1.anadirproducto(producto2);
        tienda1.anadirproducto(producto3);
        tienda1.anadirproducto(producto4);
        tienda1.anadirproducto(producto5);
        tienda1.anadirproducto(producto6);
        tienda1.anadirproducto(producto7);
        tienda1.anadirproducto(producto8);
        tienda1.anadirproducto(producto9);
        tienda1.anadirproducto(producto10);

        //ELIMINAR PRODUCTOS DE LA TIENDA
        tienda1.eliminarproducto(producto1);

        //MOSTRAR INFORMACION DE LA TIENDA
        tienda1.mostrarinfocliente_tienda();
        tienda1.mostrarinfoproductos_tienda();
    }
}
