package com.mycompany.pr_dam_p5_gabriel_david;

/**
 * Clase que representa a un veterinario en el centro de recuperación de fauna.
 * Contiene información sobre el nombre del veterinario y su especialidad.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public class Veterinario {

    String nombre, especialidad;

    /**
     * Constructor de la clase Veterinario.
     * 
     * @param nombre El nombre del veterinario.
     * @param especialidad La especialidad del veterinario.
     */
    public Veterinario(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    /**
     * Obtiene el nombre del veterinario.
     * 
     * @return El nombre del veterinario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la especialidad del veterinario.
     * 
     * @return La especialidad del veterinario.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece el nombre del veterinario.
     * 
     * @param nombre El nombre del veterinario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la especialidad del veterinario.
     * 
     * @param especialidad La especialidad del veterinario.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Veterinario.
     * 
     * @return Una cadena de texto que representa el objeto Veterinario.
     */
    @Override
    public String toString() {
        return "Veterinario{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
}
