package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public abstract class MonedaVirtual extends Cuenta implements Minar{
    private String hashcode_direccion_wallet;

    public MonedaVirtual() {
    }

    public MonedaVirtual(long saldo, String hashcode_direccion_wallet) {
        super(saldo);
        this.hashcode_direccion_wallet = hashcode_direccion_wallet;
    }

    public String getHashcode_direccion_wallet() {
        return hashcode_direccion_wallet;
    }

    public void setHashcode_direccion_wallet(String hashcode_direccion_wallet) {
        this.hashcode_direccion_wallet = hashcode_direccion_wallet;
    }

    @Override
    public String toString() {
        return "MonedaVirtual{" +
                "hashcode_direccion_wallet='" + hashcode_direccion_wallet + '\'' +
                '}';
    }
}
