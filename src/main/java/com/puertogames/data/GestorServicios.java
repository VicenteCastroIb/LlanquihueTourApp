package com.puertogames.data;

import com.puertogames.model.ExcursionCultural;
import com.puertogames.model.PaseoLacustre;
import com.puertogames.model.RutaGastronomica;
import com.puertogames.model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

// Clase encargada de crear y gestionar las instancias de los servicios turísticos
public class GestorServicios {

    private ArrayList<ServicioTuristico> listaServicio = new ArrayList<>();

    public ArrayList<ServicioTuristico> crearLista(){
        RutaGastronomica rutaGastronomica = new RutaGastronomica("Ruta Papas Cocidas", 5, 4);
        RutaGastronomica rutaGastronomica1 = new RutaGastronomica("Ruta Patos Asados", 2, 2);

        PaseoLacustre paseoLacustre = new PaseoLacustre("Paseo el Paseo", 2, "TB-112");
        PaseoLacustre paseoLacustre1 = new PaseoLacustre("Paseo El Titanic", 100, "Al-Fondo12");

        ExcursionCultural excursionCultural = new ExcursionCultural("Excursion a la Cultura", 2, "Tumbas Mapuches");
        ExcursionCultural excursionCultural1 = new ExcursionCultural("Excursion de Descultura", 4, "Casa Corxea");

        listaServicio.add(rutaGastronomica);
        listaServicio.add(paseoLacustre);
        listaServicio.add(excursionCultural);
        listaServicio.add(rutaGastronomica1);
        listaServicio.add(paseoLacustre1);
        listaServicio.add(excursionCultural1);

        return listaServicio;
    }
}