package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{

    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    //Creamos un nuevo metodo
     //Esto nos indica que estamos haciendo una sobre escritura de metodos
    public int getDuracionEnMinutos() {
        return temporadas *episodiosPorTemporada * minutosPorEpisodio;
       // return super.getDuracionEnMinutos(); //El super nos indica que el resultado sera retorando de nuestra clase madre que en este caso se encuentra en titulo
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}