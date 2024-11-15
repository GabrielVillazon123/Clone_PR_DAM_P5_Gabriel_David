package com.mycompany.pr_dam_p5_gabriel_david;

import java.util.Date;

/**
 * Clase que representa una baja de un animal en el centro de recuperación de fauna.
 * Contiene información sobre el animal dado de baja, la fecha de la baja y el veterinario que realizó la baja.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public class Baja {

    Animal paciente;
    Date fechaBaja;
    Veterinario veterinario;

    /**
     * Constructor de la clase Baja.
     * 
     * @param paciente El animal dado de baja.
     * @param fechaBaja La fecha en que se realizó la baja.
     * @param veterinario El veterinario que realizó la baja.
     */
    public Baja(Animal paciente, Date fechaBaja, Veterinario veterinario) {
        this.paciente = paciente;
        this.fechaBaja = fechaBaja;
        this.veterinario = veterinario;
    }

    /**
     * Obtiene el animal dado de baja.
     * 
     * @return El animal dado de baja.
     */
    public Animal getPaciente() {
        return paciente;
    }

    /**
     * Obtiene la fecha de la baja.
     * 
     * @return La fecha de la baja.
     */
    public Date getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Obtiene el veterinario que realizó la baja.
     * 
     * @return El veterinario que realizó la baja.
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * Establece el animal dado de baja.
     * 
     * @param paciente El animal dado de baja.
     */
    public void setPaciente(Animal paciente) {
        this.paciente = paciente;
    }

    /**
     * Establece la fecha de la baja.
     * 
     * @param fechaBaja La fecha de la baja.
     */
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    /**
     * Establece el veterinario que realizó la baja.
     * 
     * @param veterinario El veterinario que realizó la baja.
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Baja.
     * 
     * @return Una cadena de texto que representa el objeto Baja.
     */
    @Override
    public String toString() {
        return "Baja{" + "paciente=" + paciente + ", fechaBaja=" + fechaBaja + ", veterinario=" + veterinario + '}';
    }
}
