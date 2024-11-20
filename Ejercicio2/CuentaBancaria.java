package Taller7.Ejercicio2;

public class CuentaBancaria {
    private String numeroCuenta; 
    private double saldo; 
    public String tipoCuenta;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
    }


    public double getSaldo() {
        return saldo;
    }

   
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo. No se realizó el cambio.");
        }
    }

    
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }
}
