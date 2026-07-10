package com.puertogames.model;

// Clase base con los datos comunes a las entidades de la agencia.
// El campo "correo" se reutiliza como dato secundario en Vehiculo.
public abstract class RecursoAgencia {
    private String nombre;
    private String correo;

    public RecursoAgencia(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}