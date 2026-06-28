package com.puertogames.ui;

import com.puertogames.data.GestorServicios;
import com.puertogames.model.ServicioTuristico;

import java.util.ArrayList;

// Clase principal: punto de entrada del programa
public class Main {
    public static void main(String[] args) {

        // Crear el gestor y obtener la lista de servicios
        GestorServicios gestorServicios = new GestorServicios();
        ArrayList<ServicioTuristico> lista = gestorServicios.crearSubClases();

        System.out.println("=== Servicios Turísticos - Llanquihue Tour ===\n");

        // Recorrer la lista e imprimir cada servicio usando su toString()
        for (ServicioTuristico servicio : lista) {
            System.out.println(servicio);
            System.out.println("----------------------------------------------");
        }
    }
}