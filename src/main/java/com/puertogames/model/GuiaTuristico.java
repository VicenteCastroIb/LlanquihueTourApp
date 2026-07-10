package com.puertogames.model;

public class GuiaTuristico extends RecursoAgencia implements Registrable{

    private int toursRealizados;

    public GuiaTuristico(String nombre, String correo, int toursRealizados) {
        super(nombre, correo);
        this.toursRealizados = toursRealizados;
    }

    @Override
    public String mostrarResumen() {
        String texto = "Guia Turistico: | Nombre: " + getNombre()
                + " | Correo: " + getCorreo()
                + " | Tours Realizados: " + toursRealizados;
        System.out.println(texto);
        return texto + "\n";
    }

    public int getToursRealizados() {
        return toursRealizados;
    }

    public void setToursRealizados(int toursRealizados) {
        this.toursRealizados = toursRealizados;
    }
}
