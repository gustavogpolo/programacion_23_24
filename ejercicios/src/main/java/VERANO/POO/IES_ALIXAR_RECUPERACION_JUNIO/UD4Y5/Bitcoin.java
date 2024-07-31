package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public class Bitcoin extends MonedaVirtual implements Minar {
    private String nombre_exchange;

    public Bitcoin() {
    }

    public Bitcoin(long saldo, String hashcode_direccion_wallet, String nombre_exchange) {
        super(saldo, hashcode_direccion_wallet);
        this.nombre_exchange = nombre_exchange;
    }

    public String getNombre_exchange() {
        return nombre_exchange;
    }

    public void setNombre_exchange(String nombre_exchange) {
        this.nombre_exchange = nombre_exchange;
    }

    @Override
    public String toString() {
        return "Bitcoin: Nombre del exchange: '" + nombre_exchange + '\'';
    }

    @Override
    public void minar_moneda() {
        System.out.println("Minando...");
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
