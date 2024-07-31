package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public class Santander extends BancaTradicional{
    private int numero_sucursales;

    public Santander() {
    }

    public Santander(long saldo, String sucursal_apertura, int numero_sucursales) {
        super(saldo, sucursal_apertura);
        this.numero_sucursales = numero_sucursales;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }

    public void setNumero_sucursales(int numero_sucursales) {
        this.numero_sucursales = numero_sucursales;
    }

    @Override
    public String toString() {
        return "Santander: Número de sucursales: " + numero_sucursales;
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
