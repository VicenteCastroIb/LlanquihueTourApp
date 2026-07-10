package com.puertogames.model;



// Superclase base para todos los servicios turísticos de Llanquihue Tour
public abstract class ServicioTuristico {

    // Atributos comunes a todos los servicios
    private String nombreServicio;
    private int duracionHoras;

    // Constructor que inicializa los atributos comunes
    public ServicioTuristico(String nombreServicio, int duracionHoras) {
        this.nombreServicio = nombreServicio;
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInformacion() {
        System.out.println(nombreServicio + ", Duracion: " + duracionHoras + " hrs.");
    }

    // Getters y setters
    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombre(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    // Representación en texto del servicio base
    @Override
    public String toString() {
        return "ServicioTuristico: " +
                "nombre= " + nombreServicio + '\'' +
                ", duracionHoras=" + duracionHoras;
    }
}