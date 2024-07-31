package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public class LaCaixa extends BancaTradicional {
    private String nombre_tarjeta;

    public LaCaixa() {
    }
    public LaCaixa(long saldo, String sucursal_apertura, String nombre_tarjeta) {
        super(saldo, sucursal_apertura);
        this.nombre_tarjeta = nombre_tarjeta;
    }

    public String getNombre_tarjeta() {
        return nombre_tarjeta;
    }

    public void setNombre_tarjeta(String nombre_tarjeta) {
        this.nombre_tarjeta = nombre_tarjeta;
    }

    @Override
    public String toString() {
        return "LaCaixa: " + "Nombre de la tarjeta: " + nombre_tarjeta;
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
