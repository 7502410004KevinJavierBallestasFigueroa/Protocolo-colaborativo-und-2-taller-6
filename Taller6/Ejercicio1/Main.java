package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Pérez", 3000000);
        System.out.println("Información del empleado");
        System.out.println("________________________");
        empleado.mostrarInformacion();
        System.out.println();

        Gerente gerente = new Gerente("Ana Gómez", 5000000, "Ventas");
        System.out.println("Información del gerente:");
        System.out.println("________________________");
        gerente.mostrarInformacion();
    }
}

