package com.mycompany.pr_dam_p5_gabriel_david;

import java.util.Date;

/**
 * Clase que representa a un ave en el centro de recuperación de fauna.
 * Extiende la clase abstracta Animal e incluye información específica para aves.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public class Ave extends Animal {

    boolean motivoCaza;

    /**
     * Constructor de la clase Ave.
     * 
     * @param motivoCaza Indica si el ave fue cazada (true) o no (false).
     * @param nombreAnimal El nombre del ave.
     * @param raza La raza del ave.
     * @param tipoLesion El tipo de lesión del ave.
     * @param gravedad La gravedad de la lesión del ave.
     * @param peso El peso del ave.
     * @param fechaEntrada La fecha de entrada del ave al centro.
     */
    public Ave(boolean motivoCaza, String nombreAnimal, String raza, String tipoLesion, String gravedad, double peso, Date fechaEntrada) {
        super(nombreAnimal, raza, tipoLesion, gravedad, peso, fechaEntrada);
        this.motivoCaza = motivoCaza;
    }

    /**
     * Obtiene el valor del atributo motivoCaza.
     * 
     * @return true si el ave fue cazada, false si no lo fue.
     */
    public boolean isMotivoCaza() {
        return motivoCaza;
    }

    // Métodos heredados de la clase Animal con comentarios de JavaDoc

    @Override
    public String getNombreAnimal() {
        return nombreAnimal;
    }

    @Override
    public String getRaza() {
        return raza;
    }

    @Override
    public String getTipoLesion() {
        return tipoLesion;
    }

    @Override
    public String getGravedad() {
        return gravedad;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Establece el valor del atributo motivoCaza.
     * 
     * @param motivoCaza true si el ave fue cazada, false si no lo fue.
     */
    public void setMotivoCaza(boolean motivoCaza) {
        this.motivoCaza = motivoCaza;
    }

    // Métodos heredados de la clase Animal con comentarios de JavaDoc

    @Override
    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    @Override
    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Ave.
     * 
     * @return Una cadena de texto que representa el objeto Ave.
     */
    @Override
    public String toString() {
        return "-Ave- Raza: "
                + raza
                + " | Nombre del Animal: "
                + nombreAnimal
                + " | Peso: "
                + peso
                + "Kg"
                + " | motivoCaza:"
                + motivoCaza
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
        return motivoCaza;
    }

    @Override
    public void setMotivo(boolean tieneMotivo) {
        this.motivoCaza = tieneMotivo;
    }
}