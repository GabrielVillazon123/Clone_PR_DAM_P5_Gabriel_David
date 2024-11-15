package com.mycompany.pr_dam_p5_gabriel_david;

import java.util.Date;

/**
 * Clase que representa un tratamiento realizado a un animal en el centro de recuperación de fauna.
 * Contiene información sobre el nombre del tratamiento, el veterinario que lo realizó y la fecha en que se llevó a cabo.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public class Tratamiento {

    String nombreTratamiento;
    Veterinario veterinario;
    Date fechaTratamiento;

    /**
     * Constructor de la clase Tratamiento.
     * 
     * @param nombreTratamiento El nombre del tratamiento.
     * @param veterinario El veterinario que realizó el tratamiento.
     * @param fechaTratamiento La fecha en que se realizó el tratamiento.
     */
    public Tratamiento(String nombreTratamiento, Veterinario veterinario, Date fechaTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
        this.veterinario = veterinario;
        this.fechaTratamiento = fechaTratamiento;
    }

    /**
     * Obtiene el nombre del tratamiento.
     * 
     * @return El nombre del tratamiento.
     */
    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    /**
     * Obtiene el veterinario que realizó el tratamiento.
     * 
     * @return El veterinario que realizó el tratamiento.
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * Obtiene la fecha en que se realizó el tratamiento.
     * 
     * @return La fecha en que se realizó el tratamiento.
     */
    public Date getFechaTratamiento() {
        return fechaTratamiento;
    }

    /**
     * Establece el nombre del tratamiento.
     * 
     * @param nombreTratamiento El nombre del tratamiento.
     */
    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }

    /**
     * Establece el veterinario que realizó el tratamiento.
     * 
     * @param veterinario El veterinario que realizó el tratamiento.
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    /**
     * Establece la fecha en que se realizó el tratamiento.
     * 
     * @param fechaTratamiento La fecha en que se realizó el tratamiento.
     */
    public void setFechaTratamiento(Date fechaTratamiento) {
        this.fechaTratamiento = fechaTratamiento;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Tratamiento.
     * 
     * @return Una cadena de texto que representa el objeto Tratamiento.
     */
    @Override
    public String toString() {
        return "Tratamiento{" + "nombreTratamiento=" + nombreTratamiento + ", veterinario=" + veterinario + ", fechaTratamiento=" + fechaTratamiento + '}';
    }
}
