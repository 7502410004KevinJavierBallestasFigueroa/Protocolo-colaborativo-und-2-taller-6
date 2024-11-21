package Ejercicio3Correcto;

public class CuentaAhorros extends Banco {
    private String nombre;
    public CuentaAhorros(int saldo, String nombre){
        super(saldo);
        this.nombre = nombre;
    }
    public void abonar(double monto) {
        if (monto > 0) {
        setSaldo(getSaldo()+monto);
            System.out.println("El deposito de " + monto + " ha sido registrado");
            System.out.println("Su nuevo saldo es de: "+getSaldo()+"Pesos");
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }
    
    
}
