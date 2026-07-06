package com.puertogames.model;



// Superclase base para todos los servicios turísticos de Llanquihue Tour
public class ServicioTuristico {

    // Atributos comunes a todos los servicios
    private String nombre;
    private int duracionHoras;

    // Constructor que inicializa los atributos comunes
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInformacion() {
        System.out.println(nombre + ", Duracion: " + duracionHoras + " hrs.");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
                "nombre= " + nombre + '\'' +
                ", duracionHoras=" + duracionHoras;
    }
}