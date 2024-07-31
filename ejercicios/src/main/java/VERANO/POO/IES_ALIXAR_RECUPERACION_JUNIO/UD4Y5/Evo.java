package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public class Evo extends BancaVirtual{
    private String numero_tarjeta_revoluto;

    public Evo() {
    }

    public Evo(long saldo, String direccion_sede, String url_aplicacion, String numero_tarjeta_revoluto) {
        super(saldo, direccion_sede, url_aplicacion);
        this.numero_tarjeta_revoluto = numero_tarjeta_revoluto;
    }

    public String getNumero_tarjeta_revoluto() {
        return numero_tarjeta_revoluto;
    }

    public void setNumero_tarjeta_revoluto(String numero_tarjeta_revoluto) {
        this.numero_tarjeta_revoluto = numero_tarjeta_revoluto;
    }

    @Override
    public String toString() {
        return "Evo: Número de Tarjera Revoluto:" + numero_tarjeta_revoluto;
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
