package com.puertogames.model;


// Vehiculo tambien extiende RecursoAgencia para mantener una jerarquia
// comun (1 superclase, 3 subclases), El campo "correo"
// heredado se reutiliza aqui para guardar el tipo de vehiculo
public class Vehiculo extends RecursoAgencia implements Registrable{

    public Vehiculo(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String mostrarResumen() {
        String texto = "Vehiculo: | Nombre/Patente: " + getNombre()
                + " | Tipo: " + getTipo();
        System.out.println(texto);
        return texto + "\n";
    }

    public String getTipo() {
        return getCorreo();
    }

    public void setTipo(String tipo) {
        setCorreo(tipo);
    }
}
