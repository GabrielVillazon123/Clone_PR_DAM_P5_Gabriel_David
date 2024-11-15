package com.mycompany.pr_dam_p5_gabriel_david;

import Panels.principalMenue;
import java.util.ArrayList;

/**
 * Clase que representa un centro de recuperación de fauna.
 * Permite gestionar animales, veterinarios, liberaciones y bajas.
 * 
 * @author David López Corella
 * @author Jesús Gabriel Pollos Villazón
 */
public class CentroRecuperacionFauna {
    private static ArrayList<Animal> animales = new ArrayList<>();
    private static ArrayList<Veterinario> veterinarios = new ArrayList<>();
    private static ArrayList<Liberacion> liberaciones = new ArrayList<>();
    private static ArrayList<Baja> bajas = new ArrayList<>();

    /**
     * Método principal que inicializa el programa y realiza algunas operaciones de prueba.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizado).
     */
    public static void main(String[] args) {

        anadirVeterinario(new Veterinario("Jóse", "Cirugía"));
        anadirVeterinario(new Veterinario("Andrea", "Bacteriana"));
        anadirVeterinario(new Veterinario("Alejandra", "Traumatología"));
        anadirVeterinario(new Veterinario("Alejandro", "General"));

        principalMenue ventana = new principalMenue();
        ventana.setVisible(true);
    }

    /**
     * Añade un veterinario a la lista de veterinarios del centro.
     * 
     * @param veterinario El veterinario a añadir.
     */
    public static void anadirVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    /**
     * Obtiene la lista de veterinarios del centro.
     * 
     * @return La lista de veterinarios.
     */
    public static ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    /**
     * Da de alta un animal en el centro.
     * 
     * @param animal El animal a dar de alta.
     */
    public static void darAlta(Animal animal) {
        animales.add(animal);
    }

    /**
     * Agrega un tratamiento a un animal específico.
     * 
     * @param idPaciente El índice del animal al que se le agregará el tratamiento.
     * @param tratamiento El tratamiento a agregar.
     */
    public static void addTratamiento(int idPaciente, Tratamiento tratamiento) {
        animales.get(idPaciente).addTratamiento(tratamiento);
    }

    /**
     * Obtiene la lista de animales del centro.
     * 
     * @return La lista de animales.
     */
    public static ArrayList<Animal> getAnimales() {
        return animales;
    }

    /**
     * Obtiene la lista de liberaciones registradas en el centro.
     * 
     * @return La lista de liberaciones.
     */
    public static ArrayList<Liberacion> getLiberaciones() {
        return liberaciones;
    }

    /**
     * Obtiene la lista de bajas registradas en el centro.
     * 
     * @return La lista de bajas.
     */
    public static ArrayList<Baja> getBajas() {
        return bajas;
    }

    /**
     * Registra la liberación de un animal y lo elimina de la lista de animales.
     * 
     * @param indice El índice del animal a liberar.
     * @param liberacion La información sobre la liberación.
     */
    public static void darLiberado(int indice, Liberacion liberacion) {
        liberaciones.add(liberacion);
        animales.remove(indice);
    }

    /**
     * Registra la baja de un animal y lo elimina de la lista de animales.
     * 
     * @param indice El índice del animal a dar de baja.
     * @param baja La información sobre la baja.
     */
    public static void darBaja(int indice, Baja baja) {
        bajas.add(baja);
        animales.remove(indice);
    }
}
