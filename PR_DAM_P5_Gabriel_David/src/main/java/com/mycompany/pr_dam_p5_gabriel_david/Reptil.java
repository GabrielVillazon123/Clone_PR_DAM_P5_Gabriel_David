package com.mycompany.pr_dam_p5_gabriel_david;

import java.util.Date;

/**
 * Clase que representa a un reptil en el centro de recuperación de fauna.
 * Extiende la clase abstracta Animal e incluye información específica para reptiles.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public class Reptil extends Animal {

    boolean infeccionBacteriana;

    /**
     * Constructor de la clase Reptil.
     * 
     * @param infeccionBacteriana Indica si el reptil tiene una infección bacteriana (true) o no (false).
     * @param nombreAnimal El nombre del reptil.
     * @param raza La raza del reptil.
     * @param tipoLesion El tipo de lesión del reptil.
     * @param gravedad La gravedad de la lesión del reptil.
     * @param peso El peso del reptil.
     * @param fechaEntrada La fecha de entrada del reptil al centro.
     */
    public Reptil(boolean infeccionBacteriana, String nombreAnimal, String raza, String tipoLesion, String gravedad, double peso, Date fechaEntrada) {
        super(nombreAnimal, raza, tipoLesion, gravedad, peso, fechaEntrada);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    /**
     * Obtiene el valor del atributo infeccionBacteriana.
     * 
     * @return true si el reptil tiene una infección bacteriana, false si no la tiene.
     */
    public boolean isInfeccionBacteriana() {
        return infeccionBacteriana;
    }

    /**
     * Establece el valor del atributo infeccionBacteriana.
     * 
     * @param infeccionBacteriana true si el reptil tiene una infección bacteriana, false si no la tiene.
     */
    public void setInfeccionBacteriana(boolean infeccionBacteriana) {
        this.infeccionBacteriana = infeccionBacteriana;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Reptil.
     * 
     * @return Una cadena de texto que representa el objeto Reptil.
     */
    @Override
    public String toString() {
        return "-Reptil- Raza: "
                + raza
                + " | Nombre del Animal: "
                + nombreAnimal
                + " | Peso: "
                + peso
                + "Kg"
                + " | infeccionBacteriana:"
                + infeccionBacteriana
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
        return infeccionBacteriana;
    }

    @Override
    public void setMotivo(boolean tieneMotivo) {
        this.infeccionBacteriana = tieneMotivo;
    }
}
