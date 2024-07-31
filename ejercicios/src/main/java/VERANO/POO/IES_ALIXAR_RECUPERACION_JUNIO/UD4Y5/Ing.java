package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public class Ing extends BancaVirtual {
    private String nombre_hipoteca;

    public Ing() {
    }

    public Ing(long saldo, String direccion_sede, String url_aplicacion, String nombre_hipoteca) {
        super(saldo, direccion_sede, url_aplicacion);
        this.nombre_hipoteca = nombre_hipoteca;
    }

    public String getNombre_hipoteca() {
        return nombre_hipoteca;
    }

    public void setNombre_hipoteca(String nombre_hipoteca) {
        this.nombre_hipoteca = nombre_hipoteca;
    }

    @Override
    public String toString() {
        return "Ing: Nombre de la hipoteca: '" + nombre_hipoteca + '\'';
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
