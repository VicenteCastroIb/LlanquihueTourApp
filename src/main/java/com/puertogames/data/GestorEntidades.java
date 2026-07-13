package com.puertogames.data;

import com.puertogames.model.*;
import java.util.ArrayList;

// Clase encargada de crear y gestionar las instancias de Registrable
public class GestorEntidades {

    // Coleccion polimorfica, guardamos cualquier objeto de registrable.
    private ArrayList<Registrable> listaRegistrables = new ArrayList<>();

    // Metodo para generar datos de ejemplo en lista.
    public ArrayList<Registrable> generarListaRegistrables() {
        listaRegistrables.add(new GuiaTuristico("Roberto", "Robertoguia@gmail.com", 6));
        listaRegistrables.add(new ColaboradorExterno("Juan Cordero", "Juansito@gmail.com", "HardwareCh"));
        listaRegistrables.add(new GuiaTuristico("Alejandra", "Alejandraguia1@gmail.com", 12));
        listaRegistrables.add(new Vehiculo("Tuxon", "Autoneta"));
        listaRegistrables.add(new Vehiculo("Raptor", "Camioneta"));
        listaRegistrables.add(new ColaboradorExterno("Jose Miguel", "Miguelsito@gmail.com", "PcFactory"));


        return listaRegistrables;
    }

    public ArrayList<Registrable> getListaRegistrables() {
        return listaRegistrables;
    }

    public boolean estaVacia() {
        return listaRegistrables.isEmpty();
    }

    // Metodo para demostrar comportamiento polimorfico de objetos en lista polimorfica.
    public String getResumen() {
        StringBuilder resumen = new StringBuilder();
        for(Registrable r : listaRegistrables) {
            resumen.append(r.mostrarResumen());
        }
        return resumen.toString();
    }

    // Metodo para aniadir objeto a lista
    public void aniadirALista(Registrable r) {
        listaRegistrables.add(r);
        System.out.println("Se agrego: " + r + " a la lista.");
    }

    // Recorre la lista, usa instanceof para diferenciar cada tipo y arma un
    // texto de resumen agregando informacion extra propia de cada clase.
    public String obtenerResumenTexto() {
        StringBuilder resumen = new StringBuilder();

        for (Registrable r : listaRegistrables) {

            if (r instanceof GuiaTuristico guia) {
                resumen.append(guia.mostrarResumen());
                if (guia.getToursRealizados() >= 50) {
                    resumen.append("   * Guia Senior (50+ tours realizados) *\n");
                }
            } else if (r instanceof ColaboradorExterno colaborador) {
                resumen.append(colaborador.mostrarResumen());
            } else if (r instanceof Vehiculo vehiculo) {
                resumen.append(vehiculo.mostrarResumen());
            }
        }
        resumen.append("==================================================");
        return resumen.toString();
    }
}