package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public abstract class BancaVirtual extends Cuenta {
    private String direccion_sede;
    private String url_aplicacion;

    public BancaVirtual() {
    }
    public BancaVirtual(long saldo, String direccion_sede, String url_aplicacion) {
        super(saldo);
        this.direccion_sede = direccion_sede;
        this.url_aplicacion = url_aplicacion;
    }

    public String getDireccion_sede() {
        return direccion_sede;
    }

    public void setDireccion_sede(String direccion_sede) {
        this.direccion_sede = direccion_sede;
    }

    public String getUrl_aplicacion() {
        return url_aplicacion;
    }

    public void setUrl_aplicacion(String url_aplicacion) {
        this.url_aplicacion = url_aplicacion;
    }

    @Override
    public String toString() {
        return  super.toString() + "BancaVirtual{" +
                "direccion_sede='" + direccion_sede + '\'' +
                ", url_aplicacion='" + url_aplicacion + '\'' +
                '}';
    }
}
