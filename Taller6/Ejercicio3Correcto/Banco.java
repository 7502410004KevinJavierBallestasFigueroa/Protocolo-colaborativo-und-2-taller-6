package Ejercicio3Correcto;
public class Banco {
    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void mostrarSaldo() {
        System.out.println("El saldo es: " + getSaldo());
    }


}
