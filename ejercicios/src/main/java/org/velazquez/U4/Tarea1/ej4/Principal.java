package org.velazquez.U4.Tarea1.ej4;

public class Principal {
    public static void main(String[] args) {
        //    CuentaCorriente cuenta = new CuentaCorriente("Natalia", "2345678E");
        CuentaCorriente cuenta1 = new CuentaCorriente();

        cuenta1.setNombre("Gustavo");
        cuenta1.setDNI("4589724F");
        cuenta1.setSaldo(10);
        cuenta1.setLimite_descubrimiento(-30);
        cuenta1.setNombre_banco("Imagin");

        System.out.println(cuenta1.getNombre_banco());
        System.out.println(cuenta1.getNombre());
        System.out.println(cuenta1.getDNI());
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta1.getLimite_descubrimiento());
    }
}