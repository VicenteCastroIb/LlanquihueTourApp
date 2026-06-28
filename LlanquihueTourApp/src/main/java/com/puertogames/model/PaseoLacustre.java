package com.puertogames.model;

// Subclase que representa un paseo en embarcación por el lago
public class PaseoLacustre extends ServicioTuristico {

    // Atributo propio: tipo de embarcación utilizada en el paseo
    private String tipoEmbarcacion;

    // Constructor: llama al constructor padre con super() y agrega su atributo propio
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getters y setters
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Muestra la información completa del paseo, incluyendo datos heredados
    @Override
    public String toString() {
        return "PaseoLacustre --> " +
                "Nombre: " + super.getNombre() +
                " | Duracion-Horas: " + super.getDuracionHoras() +
                " | Tipo Embarcacion: " + tipoEmbarcacion;
    }
}