package com.aluracursos.radiomoi.principal;

import com.aluracursos.radiomoi.modelos.Cancion;
import com.aluracursos.radiomoi.modelos.Misfavoritos;
import com.aluracursos.radiomoi.modelos.Podcast;

public class Principal {
    public static void main(String[] args)  /*Para poder hacer los test o imprimir*/ {
        Cancion miCancion = new Cancion(); //Se crea una instacia
         miCancion.setTitulo("Clasyy 101"); //Establecemos el nombre de la cancion
         miCancion.setCantante("Ferxxo"); //Establecemos el nombre del artista

        Podcast miPodcast = new Podcast(); //Instancia u nuevo objeto
        miPodcast.setPresentador(" DJLivy IA");
        miPodcast.setTitulo("Sporify");

        for (int i = 0; i <5; i++)/* i es igual a 0, mientras 1 sea menor a 100 i sumara*/ {
            miCancion.meGusta(); //Se le llama al metodo Mi cancion, representa a cuantas personas les agrada o gusta
        }

        for (int i = 0; i <5; i++) {
        miCancion.reproduce(); // Representa el total de las reproducciones
        }
//                        PODCAST
        for (int i = 0; i <400 ; i++)/* i es igual a 0, mientras 1 sea menor a 100 i sumara*/ {
             miPodcast.meGusta(); //Se le llama al metodo Mi cancion, representa a cuantas personas les agrada o gusta
        }

        for (int i = 0; i <3000; i++) {
            miPodcast.reproduce(); // Representa el total de las reproducciones
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMegusta());


        System.out.println("Esta cancion fue presentada por: " + miPodcast.getPresentador());
        System.out.println("Estas escuchando esta cancion desde: " + miPodcast.getTitulo());
        System.out.println("La calsificacion del podcast  es: "  + miCancion.getClasificacion());

        Misfavoritos favoritos = new Misfavoritos();
        favoritos.adicion(miPodcast);
        favoritos.adicion(miCancion);


    }


}
