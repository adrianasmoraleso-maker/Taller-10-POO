package org.taller;

public class PruebaPEP {

    public static void main(String[] args) {

    // Ejercicio 1: Polimorfismo con Persona, Estudiante y Profesor
        System.out.println("--------------Presentaciones (uso de Polimorfismo)--------------");

        Persona[] personas = {
            new Persona("Juan"),
            new Estudiante("María", "Ingeniería de Sistemas"),
            new Profesor("Pedro", "Programación Orientada a Objetos")
    };

        for (Persona p : personas) {
        p.presentarse(); // Prueba de polimorfismo: Llama al método sobrescrito según el tipo real

        }

    }

}