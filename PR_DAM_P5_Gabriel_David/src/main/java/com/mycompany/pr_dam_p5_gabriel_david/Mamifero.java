package com.mycompany.pr_dam_p5_gabriel_david;

import java.util.Date;

/**
 * Clase que representa a un mamífero en el centro de recuperación de fauna.
 * Extiende la clase abstracta Animal e incluye información específica para mamíferos.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public class Mamifero extends Animal {

    boolean motivoAtropello;

    /**
     * Constructor de la clase Mamifero.
     * 
     * @param motivoAtropello Indica si el mamífero fue atropellado (true) o no (false).
     * @param nombreAnimal El nombre del mamífero.
     * @param raza La raza del mamífero.
     * @param tipoLesion El tipo de lesión del mamífero.
     * @param gravedad La gravedad de la lesión del mamífero.
     * @param peso El peso del mamífero.
     * @param fechaEntrada La fecha de entrada del mamífero al centro.
     */
    public Mamifero(boolean motivoAtropello, String nombreAnimal, String raza, String tipoLesion, String gravedad, double peso, Date fechaEntrada) {
        super(nombreAnimal, raza, tipoLesion, gravedad, peso, fechaEntrada);
        this.motivoAtropello = motivoAtropello;
    }

    /**
     * Obtiene el valor del atributo motivoAtropello.
     * 
     * @return true si el mamífero fue atropellado, false si no lo fue.
     */
    public boolean isMotivoAtropello() {
        return motivoAtropello;
    }

    /**
     * Establece el valor del atributo motivoAtropello.
     * 
     * @param motivoAtropello true si el mamífero fue atropellado, false si no lo fue.
     */
    public void setMotivoAtropello(boolean motivoAtropello) {
        this.motivoAtropello = motivoAtropello;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Mamifero.
     * 
     * @return Una cadena de texto que representa el objeto Mamifero.
     */
    @Override
    public String toString() {
        return "-Mamifero- Raza: "
                + raza
                + " | Nombre del Animal: "
                + nombreAnimal
                + " | Peso: "
                + peso
                + "Kg"
                + " | motivoAtropello:"
                + motivoAtropello
                + " | Tipo de lesión: "
                + tipoLesion
                + " | Gravedad: "
                + gravedad
                + " | Fecha entrada: "
                + fechaEntrada;
    }

    // Métodos heredados de la clase Animal con comentarios de JavaDoc

    @Override
    public boolean getMotivo() {
        return motivoAtropello;
    }

    @Override
    public void setMotivo(boolean tieneMotivo) {
        this.motivoAtropello = tieneMotivo;
    }
}
