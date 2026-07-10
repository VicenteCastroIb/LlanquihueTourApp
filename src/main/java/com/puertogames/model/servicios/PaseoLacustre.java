package com.puertogames.model.servicios;


// Subclase que representa un paseo en embarcación por el lago
public class PaseoLacustre extends ServicioTuristico {

    // Atributo propio: tipo de embarcación utilizada en el paseo
    private String tipoEmbarcacion;

    // Constructor: llama al constructor padre con super() y agrega su atributo propio
    public PaseoLacustre(String nombreServicio, int duracionHoras, String tipoEmbarcacion) {
        super(nombreServicio, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(super.getNombreServicio() + ", duracion: " + super.getDuracionHoras() + "hrs, tipo embarcacion: " + tipoEmbarcacion);
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
                "Nombre: " + super.getNombreServicio() +
                " | Duracion-Horas: " + super.getDuracionHoras() +
                " | Tipo Embarcacion: " + tipoEmbarcacion;
    }
}