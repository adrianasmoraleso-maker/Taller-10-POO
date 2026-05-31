package org.taller;

public class Bicicleta extends Vehiculo {

    //Ejercicio3: Sobrescritura de un método sin usar @Override
    public void moverse() {

        System.out.println("La bicicleta se mueve pedaleando");
    }
}

/* EXPLICACIÓN:
Aunque un método puede sobrescribirse sin utilizar la anotación "@Override",
esta práctica no es recomendable; pues la anotación permite al compilador verificar
que el método realmente está sobrescribiendo uno existente en la superclase.
Sin ella, errores tipográficos o cambios accidentales en la firma del método
pueden pasar desapercibidos, generando comportamientos inesperados y dificultando
el mantenimiento del código.
*/