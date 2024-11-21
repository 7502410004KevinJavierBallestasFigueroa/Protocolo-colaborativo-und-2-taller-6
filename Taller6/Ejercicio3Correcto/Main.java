package Ejercicio3Correcto;

public class Main{
    public static void main(String[] args) {
        Banco banco1 = new Banco(20000);
        CuentaAhorros acc1 = new CuentaAhorros(30000, "Propia");
        acc1.abonar(3000);
    }

}