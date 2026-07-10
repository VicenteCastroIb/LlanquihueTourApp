package com.puertogames.model;


// Contrato comun para todas las entidades que la agencia puede registrar
// y mostrar dentro de una coleccion polimorfica.
public interface Registrable {
    String mostrarResumen();
}
