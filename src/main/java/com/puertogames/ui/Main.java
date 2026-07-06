package com.puertogames.ui;

import com.puertogames.data.GestorServicios;
import com.puertogames.model.PaseoLacustre;
import com.puertogames.model.ServicioTuristico;

import java.util.ArrayList;


// Clase principal: punto de entrada del programa
public class Main {
    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        ArrayList<ServicioTuristico> listaServicio = new ArrayList<>(gestor.crearLista());
        for(ServicioTuristico servicio : listaServicio){
            servicio.mostrarInformacion();
        }
    }
}
