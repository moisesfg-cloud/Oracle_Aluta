package com.aluracursos.radiomoi.modelos;

public class Misfavoritos {

   public void adicion(Audio audio)/*Porque puede ser tanto una cancion como un podcast*/{
      if (audio.getClasificacion() >= 8){
          System.out.println(audio.getTitulo() + " es uno de los podcast favoritos del momento");
      }else{
          System.out.println(audio.getTitulo() + " es una de las canciones favoritas del momento ");

      }
    }


}

