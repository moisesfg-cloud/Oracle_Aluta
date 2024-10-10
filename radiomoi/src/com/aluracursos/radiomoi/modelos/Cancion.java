package com.aluracursos.radiomoi.modelos;

public class Cancion extends Audio {
    private String album;
    private String cantante;
    private String genero;

    @Override //SUBSTITUCION
    public int getClasificacion() {
        if (getTotalDeMegusta() > 5000){ //Si totaldemgusta es mayor a 5000 retorna 8
            return 8;
        }else {
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

}
