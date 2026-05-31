package org.taller;

// Estudiante hereda los atributos y métodos de Persona
public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String carrera) {

        // Llama al constructor de la clase base Persona
        super(nombre);
        this.carrera = carrera;
    }

    // Sobrescribe el comportamiento heredado para adaptarlo a un estudiante
    @Override
    public void presentarse() {
        System.out.println("Hola, soy estudiante de " + carrera + " y me llamo " + nombre + ".");
    }
}
