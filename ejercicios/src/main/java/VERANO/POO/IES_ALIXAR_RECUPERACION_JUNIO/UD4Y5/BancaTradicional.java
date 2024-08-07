package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public abstract class BancaTradicional extends Cuenta {
    private String sucursal_apertura;

    public BancaTradicional() {
    }

    public BancaTradicional(long saldo, String sucursal_apertura) {
        super(saldo);
        this.sucursal_apertura = sucursal_apertura;
    }

    public String getSucursal_apertura() {
        return sucursal_apertura;
    }

    public void setSucursal_apertura(String sucursal_apertura) {
        this.sucursal_apertura = sucursal_apertura;
    }

    @Override
    public String toString() {
        return super.toString()+  "BancaTradicional{" +
                "sucursal_apertura='" + sucursal_apertura + '\'' +
                '}';
    }
}
