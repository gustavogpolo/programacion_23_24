package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public abstract class Cuenta {
    private long saldo;

    public Cuenta() {
    }
    public Cuenta(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                '}';
    }
    public void ingresar(long ingreso) {
        this.saldo += ingreso;
    }

    public void transferir(long cantidad, long comision, Cuenta cuentaDestino) {
        if (this.saldo >= cantidad + comision) {
            this.saldo -= (cantidad + comision);
            cuentaDestino.ingresar(cantidad);
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }
}
