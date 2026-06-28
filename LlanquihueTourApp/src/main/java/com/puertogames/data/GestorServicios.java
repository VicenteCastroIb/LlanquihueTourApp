package com.puertogames.data;

import com.puertogames.model.ExcursionCultural;
import com.puertogames.model.PaseoLacustre;
import com.puertogames.model.RutaGastronomica;
import com.puertogames.model.ServicioTuristico;

import java.util.ArrayList;

// Clase encargada de crear y gestionar las instancias de los servicios turísticos
public class GestorServicios {

    // Lista que almacena todos los servicios creados (usa el tipo de la superclase)
    private ArrayList<ServicioTuristico> listaSubClases = new ArrayList<>();

    // Crea dos instancias de cada subclase y las agrega a la lista
    public ArrayList<ServicioTuristico> crearSubClases() {

        // Crear excursiones culturales
        ExcursionCultural excursionCultural1 = new ExcursionCultural("Excursion al norte", 5, "Desierto Atacama");
        ExcursionCultural excursionCultural2 = new ExcursionCultural("Excursion al este", 10, "Paseo por Playa");

        // Crear paseos lacustres
        PaseoLacustre paseoLacustre1 = new PaseoLacustre("Lacustre Al Sur", 3, "Transfer A-233");
        PaseoLacustre paseoLacustre2 = new PaseoLacustre("Lacustre Al Oeste", 1, "Transfer C-553");

        // Crear rutas gastronómicas
        RutaGastronomica rutaGastronomica1 = new RutaGastronomica("Pastas Italianas", 6, 6);
        RutaGastronomica rutaGastronomica2 = new RutaGastronomica("Pastas Francesas", 12, 10);

        // Agregar todos los servicios a la lista
        listaSubClases.add(excursionCultural1);
        listaSubClases.add(paseoLacustre1);
        listaSubClases.add(rutaGastronomica1);
        listaSubClases.add(excursionCultural2);
        listaSubClases.add(paseoLacustre2);
        listaSubClases.add(rutaGastronomica2);

        return listaSubClases;
    }
}