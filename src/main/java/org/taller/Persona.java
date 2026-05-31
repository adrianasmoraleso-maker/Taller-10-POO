package org.taller;

public class Persona {

    // Atributo protegido para que las clases hijas puedan acceder a él
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método que podrá ser sobrescrito por las clases derivadas
    public void presentarse() {

        System.out.println("Hola, un gusto en conocerte, me llamo " + nombre + ".");
    }
}
