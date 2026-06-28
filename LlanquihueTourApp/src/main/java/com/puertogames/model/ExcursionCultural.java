package com.puertogames.model;

// Subclase que representa una excursión a un lugar histórico o natural
public class ExcursionCultural extends ServicioTuristico {

    // Atributo propio de esta subclase
    private String lugarHistorico;

    // Constructor: llama al constructor padre con super() y agrega su atributo propio
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // Getters y setters
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    // Muestra la información completa de la excursión, incluyendo datos heredados
    @Override
    public String toString() {
        return "ExcursionCultural --> " +
                "Nombre: " + super.getNombre() +
                " | Duracion-Horas: " + super.getDuracionHoras() +
                " | Lugar Historico: " + lugarHistorico;
    }
}