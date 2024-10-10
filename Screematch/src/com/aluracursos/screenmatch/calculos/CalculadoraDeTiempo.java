package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    private int tiempoTotal;

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}
