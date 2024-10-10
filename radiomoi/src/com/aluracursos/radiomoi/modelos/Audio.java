package com.aluracursos.radiomoi.modelos;

//ATRIBUTOS
public class Audio {
    private String titulo;
    private int totalDeReproducciones;
    private int totalDeMegusta;
    private int clasificacion;

public void meGusta() {
    this.totalDeMegusta++; // CADA VEZ QUE UN USUARIO LLAME A ESTE METODO, EL SE SUME UN VALOR ACUMULAR ESE TOTAL
    }

public void reproduce(){
    this.totalDeReproducciones ++;
    }

    //GETTERS y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMegusta() {
        return totalDeMegusta;
    }

    public void setTotalDeMegusta(int totalDeMegusta) {
        this.totalDeMegusta = totalDeMegusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
