package VERANO.POO.IES_ALIXAR_RECUPERACION_JUNIO.UD4Y5;

public class Main {
    public static void main(String[] args) {
        // Creación de cuentas
        Cuenta laCaixa = new LaCaixa(1000, "Sucursal 1", "Tarjeta Oro");
        Cuenta santander = new Santander(2000, "Sucursal 2", 150);
        Cuenta ing = new Ing(3000, "Sede 1", "www.ingapp.com", "Hipoteca Naranja");
        Cuenta evo = new Evo(4000, "Sede 2", "www.evoapp.com", "Revoluto 1234");
        Bitcoin bitcoin = new Bitcoin(5000, "hash1234", "Binance");
        Monero monero = new Monero(6000, "hash5678", "MoneroServer");

        // Imprimir cuentas iniciales
        System.out.println(laCaixa);
        System.out.println(santander);
        System.out.println(ing);
        System.out.println(evo);
        System.out.println(bitcoin);
        System.out.println(monero);

        // Transferencia de LaCaixa a Santander
        laCaixa.transferir(500, 20, santander);
        System.out.println("\nDespués de la transferencia de LaCaixa a Santander:");
        System.out.println(laCaixa);
        System.out.println(santander);

        // Transferencia de ING a Evo
        ing.transferir(1000, 15, evo);
        System.out.println("\nDespués de la transferencia de ING a Evo:");
        System.out.println(ing);
        System.out.println(evo);

        // Transferencia de Bitcoin a Monero
        bitcoin.transferir(2000, 10, monero);
        System.out.println("\nDespués de la transferencia de Bitcoin a Monero:");
        System.out.println(bitcoin);
        System.out.println(monero);

        // Ingreso en cuentas
        laCaixa.ingresar(300);
        evo.ingresar(500);
        System.out.println("\nDespués de ingresar dinero en LaCaixa y Evo:");
        System.out.println(laCaixa);
        System.out.println(evo);

        // Minado de moneda
        System.out.println("\nMinado de Bitcoin:");
        bitcoin.minar_moneda();

        System.out.println("\nMinado de Monero:");
        monero.minar_moneda();

        // Transferencia de Santander a ING
        santander.transferir(1500, 25, ing);
        System.out.println("\nDespués de la transferencia de Santander a ING:");
        System.out.println(santander);
        System.out.println(ing);

        // Estado final de todas las cuentas
        System.out.println("\nEstado final de todas las cuentas:");
        System.out.println(laCaixa);
        System.out.println(santander);
        System.out.println(ing);
        System.out.println(evo);
        System.out.println(bitcoin);
        System.out.println(monero);
    }
}

