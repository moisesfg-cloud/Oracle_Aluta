package com.aluracursos.radiomoi.modelos;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >= 2000) { //Dependiendo del total reproduciones voy a dar una nota u otra
            return 9;
        } else {
            return 2;
        }

    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}