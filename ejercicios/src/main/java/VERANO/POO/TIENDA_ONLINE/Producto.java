package VERANO.POO.TIENDA_ONLINE;

public class Producto {
    private String nombre_producto;
    private Enum CATEGORIA;
    private double precio;
    private int stock;


    //Constructor para los objetos producto
    public Producto(String nombre_producto, Enum CATEGORIA, double precio, int stock) {
        this.nombre_producto = nombre_producto;
        this.CATEGORIA = CATEGORIA;
        this.precio = precio;
        this.stock = stock;
    }

    //Setters y getters de la clase producto
    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Enum getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(Enum CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //MOSTRAR INFO PRODUCTO

    public void mostrarinfoproducto(){
        System.out.println("----------------------------------------");
        System.out.println("- Nombre del producto: " + nombre_producto);
        System.out.println("- Categoría: " + CATEGORIA);
        System.out.println("- Precio: " + precio);
        System.out.println("- Stock: " + stock);
        System.out.println("----------------------------------------");
    }
}
