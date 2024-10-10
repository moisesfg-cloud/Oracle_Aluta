package com.aluracursos.screenmatch.calculos;

import java.sql.SQLOutput;

public class FiltrRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >=4){
            System.out.println("Tienes que verla");//METODO QUE NOS VA A REGRESAR LA CANTIDAD DE ESTRELLAS
        } else if (clasificacion.getClasificacion() >=2) {
            System.out.println("Puede que te guste");
        }else{
            System.out.println("No la veas");
        }
    }
}
