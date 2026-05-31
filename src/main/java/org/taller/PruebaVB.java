package org.taller;

public class PruebaVB {

    public static void main(String[] args) {

        // Ejercicio 2: Vehiculo y Bicicleta
        System.out.println("\nPrueba de Sobrescritura: moverse()\n");
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Bicicleta(); // Polimorfismo
        v1.moverse();
        v2.moverse();
    }
}

