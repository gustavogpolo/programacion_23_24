package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public class Monero extends MonedaVirtual{
    private String nombre_servidor;

    public Monero() {
    }

    public Monero(long saldo, String hashcode_direccion_wallet, String nombre_servidor) {
        super(saldo, hashcode_direccion_wallet);
        this.nombre_servidor = nombre_servidor;
    }

    public String getNombre_servidor() {
        return nombre_servidor;
    }

    public void setNombre_servidor(String nombre_servidor) {
        this.nombre_servidor = nombre_servidor;
    }

    @Override
    public String toString() {
        return "Monero: Nombre del servidor: '" + nombre_servidor + '\'';
    }

    @Override
    public void minar_moneda() {
        System.out.println("Minando moneda...");
    }

    @Override
    public void ingresar(long ingreso) {
        super.ingresar(ingreso);
    }

    @Override
    public void transferir(long cantidad, long comision, Cuenta cuentaDestino) {
        super.transferir(cantidad, comision, cuentaDestino);
    }
}
