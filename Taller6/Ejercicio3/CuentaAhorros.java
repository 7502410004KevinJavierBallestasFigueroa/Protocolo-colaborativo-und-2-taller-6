package Ejercicio3;

public class CuentaAhorros extends Banco {
    private String nombre;
    public CuentaAhorros(int saldo, String nombre){
        super(saldo);
        this.nombre = nombre;
    }
    public void abonar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito de " + monto + " registrado");
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }
    
    
}
