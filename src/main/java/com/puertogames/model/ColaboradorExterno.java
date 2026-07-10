package com.puertogames.model;

public class ColaboradorExterno extends RecursoAgencia implements Registrable {

    private String empresa;

    public ColaboradorExterno(String nombre, String correo, String empresa) {
        super(nombre, correo);
        this.empresa = empresa;
    }

    @Override
    public String mostrarResumen() {
        String texto = "Colaborador Externo: | Nombre Representante: " + getNombre()
                + " | Correo: " + getCorreo()
                + " | Empresa: " + empresa;
        System.out.println(texto);
        return texto + "\n" ;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
