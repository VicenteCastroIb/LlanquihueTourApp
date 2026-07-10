package com.puertogames.model;

// Subclase que representa una ruta gastronómica con múltiples paradas
public class RutaGastronomica extends ServicioTuristico {

    // Atributo propio: cantidad de paradas en la ruta
    private int numeroDeParadas;

    // Constructor: llama al constructor padre con super() y agrega su atributo propio
    public RutaGastronomica(String nombreServicio, int duracionHoras, int numeroDeParadas) {
        super(nombreServicio, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(super.getNombreServicio() + ", duracion: " + super.getDuracionHoras() + "hrs, numero de paradas: " + numeroDeParadas);
    }

    // Getters y setters
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    // Muestra la información completa de la ruta, incluyendo datos heredados
    @Override
    public String toString() {
        return "RutaGastronomica --> " +
                "Nombre: " + super.getNombreServicio() +
                " | Duracion-Horas: " + super.getDuracionHoras() +
                " | Numero de Paradas: " + numeroDeParadas;
    }
}