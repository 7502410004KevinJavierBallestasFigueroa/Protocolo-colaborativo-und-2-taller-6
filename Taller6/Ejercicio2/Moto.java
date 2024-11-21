package Ejercicio2;

public class Moto extends Vehiculo {
    protected int cilindraje;

    public Moto(String tipo, String marca, int cilindraje) {
        super(tipo, marca);
        this.cilindraje = cilindraje;
    }
@Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Cilindraje en cc es de: " + cilindraje);
    }
}

