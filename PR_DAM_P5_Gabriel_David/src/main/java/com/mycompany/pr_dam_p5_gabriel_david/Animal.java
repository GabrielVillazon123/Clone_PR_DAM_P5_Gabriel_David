package com.mycompany.pr_dam_p5_gabriel_david;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase abstracta que representa un animal en el centro de recuperación de fauna.
 * Contiene información básica sobre el animal y sus tratamientos médicos.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public abstract class Animal {
    String nombreAnimal, raza, tipoLesion, gravedad;
    double peso;
    Date fechaEntrada;
    ArrayList<Tratamiento> tratamientos = new ArrayList<>();

    /**
     * Constructor de la clase Animal.
     * 
     * @param nombreAnimal El nombre del animal.
     * @param raza La raza del animal.
     * @param tipoLesion El tipo de lesión del animal.
     * @param gravedad La gravedad de la lesión del animal.
     * @param peso El peso del animal.
     * @param fechaEntrada La fecha de entrada del animal al centro.
     */
    public Animal(String nombreAnimal, String raza, String tipoLesion, String gravedad, double peso,
            Date fechaEntrada) {
        this.nombreAnimal = nombreAnimal;
        this.raza = raza;
        this.tipoLesion = tipoLesion;
        this.gravedad = gravedad;
        this.peso = peso;
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Obtiene el nombre del animal.
     * 
     * @return El nombre del animal.
     */
    public String getNombreAnimal() {
        return nombreAnimal;
    }

    /**
     * Obtiene la raza del animal.
     * 
     * @return La raza del animal.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Obtiene el tipo de lesión del animal.
     * 
     * @return El tipo de lesión del animal.
     */
    public String getTipoLesion() {
        return tipoLesion;
    }

    /**
     * Obtiene la gravedad de la lesión del animal.
     * 
     * @return La gravedad de la lesión del animal.
     */
    public String getGravedad() {
        return gravedad;
    }

    /**
     * Obtiene el peso del animal.
     * 
     * @return El peso del animal.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Obtiene la fecha de entrada del animal al centro.
     * 
     * @return La fecha de entrada del animal.
     */
    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Establece el nombre del animal.
     * 
     * @param nombreAnimal El nuevo nombre del animal.
     */
    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    /**
     * Establece la raza del animal.
     * 
     * @param raza La nueva raza del animal.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Establece el tipo de lesión del animal.
     * 
     * @param tipoLesion El nuevo tipo de lesión del animal.
     */
    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    /**
     * Establece la gravedad de la lesión del animal.
     * 
     * @param gravedad La nueva gravedad de la lesión del animal.
     */
    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    /**
     * Establece el peso del animal.
     * 
     * @param peso El nuevo peso del animal.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Establece la fecha de entrada del animal al centro.
     * 
     * @param fechaEntrada La nueva fecha de entrada del animal.
     */
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Obtiene la lista de tratamientos médicos del animal.
     * 
     * @return La lista de tratamientos del animal.
     */
    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    /**
     * Agrega un tratamiento médico a la lista de tratamientos del animal.
     * 
     * @param tratamiento El tratamiento médico a agregar.
     */
    protected void addTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
    }

    /**
     * Método abstracto para obtener el motivo de ingreso del animal.
     * 
     * @return true si el animal tiene un motivo de ingreso, false de lo contrario.
     */
    public abstract boolean getMotivo();

    /**
     * Método abstracto para establecer el motivo de ingreso del animal.
     * 
     * @param tieneMotivo true si el animal tiene un motivo de ingreso, false de lo contrario.
     */
    public abstract void setMotivo(boolean tieneMotivo);

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Animal.
     * 
     * @return Una cadena de texto que representa el objeto Animal.
     */
    @Override
    public String toString() {
        return "Animal{" + "nombreAnimal=" + nombreAnimal + ", raza=" + raza + ", tipoLesion=" + tipoLesion + ", gravedad=" + gravedad + ", peso=" + peso + ", fechaEntrada=" + fechaEntrada + ", tratamiento=" + tratamientos + '}';
    }
}
