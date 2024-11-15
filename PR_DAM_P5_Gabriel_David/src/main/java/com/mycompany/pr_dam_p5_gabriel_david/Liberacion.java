package com.mycompany.pr_dam_p5_gabriel_david;

import java.util.Date;

/**
 * Clase que representa una liberación de un animal en el centro de recuperación de fauna.
 * Contiene información sobre el animal liberado, la fecha de la liberación y el veterinario que realizó la liberación.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public class Liberacion {

    Animal paciente;
    Date fechaLiberacion;
    Veterinario veterinario;

    /**
     * Constructor de la clase Liberacion.
     * 
     * @param paciente El animal liberado.
     * @param fechaLiberacion La fecha en que se realizó la liberación.
     * @param veterinario El veterinario que realizó la liberación.
     */
    public Liberacion(Animal paciente, Date fechaLiberacion, Veterinario veterinario) {
        this.paciente = paciente;
        this.fechaLiberacion = fechaLiberacion;
        this.veterinario = veterinario;
    }

    /**
     * Obtiene el animal liberado.
     * 
     * @return El animal liberado.
     */
    public Animal getPaciente() {
        return paciente;
    }

    /**
     * Obtiene la fecha de la liberación.
     * 
     * @return La fecha de la liberación.
     */
    public Date getFechaLiberacion() {
        return fechaLiberacion;
    }

    /**
     * Obtiene el veterinario que realizó la liberación.
     * 
     * @return El veterinario que realizó la liberación.
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * Establece el animal liberado.
     * 
     * @param paciente El animal liberado.
     */
    public void setPaciente(Animal paciente) {
        this.paciente = paciente;
    }

    /**
     * Establece la fecha de la liberación.
     * 
     * @param fechaLiberacion La fecha de la liberación.
     */
    public void setFechaLiberacion(Date fechaLiberacion) {
        this.fechaLiberacion = fechaLiberacion;
    }

    /**
     * Establece el veterinario que realizó la liberación.
     * 
     * @param veterinario El veterinario que realizó la liberación.
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Liberacion.
     * 
     * @return Una cadena de texto que representa el objeto Liberacion.
     */
    @Override
    public String toString() {
        return "Liberacion{" + "paciente=" + paciente + ", fechaLiberacion=" + fechaLiberacion + ", veterinario=" + veterinario + '}';
    }
}
