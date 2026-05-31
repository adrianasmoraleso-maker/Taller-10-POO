package org.taller;

// Estudiante hereda los atributos y métodos de Persona
public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String carrera) {

        // Llama al constructor de la clase base Persona
        super(nombre);
        this.carrera = carrera;
    }

//Ejercicio3: Sobrescritura del método de una clase derivada cambiando su firma
    @Override
    public void presentarse(String mensaje) {
        System.out.println(mensaje + " Soy estudiante de " + carrera);

    }

}

/* EXPLICACIÓN:
 La sobrescritura requiere que el método de la clase derivada tenga exactamente la misma firma
 que el método definido en la clase base. Al agregar un parámetro al método "presentarse", la firma
 cambia y deja de ser una sobrescritura válida. Como consecuencia, el compilador genera un error al
 detectar que el método anotado con `@Override` no coincide con ningún método de la superclase
 */

//-----------------------------------------------------------------------------------------------------
/*
// Sobrescribe el comportamiento heredado para adaptarlo a un estudiante
    @Override
    public void presentarse() {
        System.out.println("Hola, soy estudiante de " + carrera + " y me llamo " + nombre + ".");
    }
}
*/

