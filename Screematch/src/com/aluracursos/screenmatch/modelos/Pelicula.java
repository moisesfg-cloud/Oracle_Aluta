package com.aluracursos.screenmatch.modelos; // QAquí nos indica que es un paquete y el nombre del mismo.

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.Clasificacion;
                 /*Herencia*/                /*INTERFAZ*/
public class Pelicula extends Titulo implements Clasificacion{ //ESTO ES UNA EXTENSION DE LA CLASE TITULO O UN HIJO O UNA HIJA (ESTO ES UNA HERENCIA)
private String director;

    public String getDirectoro() {
        return director;
    }

    public void setDirectoro(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
    return (int) (calculaLaMedia() / 2);
    }

}

//Encapsulamiento
//get - cunado queremos obtener el valor de algo
//set- Nos ayudan a crear metodos que nos permitan agregar un valor especifico.
//this - hace referencia al atributo de la clase y no al valor

//Modificadores de acceso
// Private hace que los metodos solo puedan ser usados dentro de la misma clase,
// Public hace que todos los metodos puedan ser usados en cualquier clase

//Herencia una clse es igual a otra
//Polimorfismo Podemos hacer referencia a la misma cosa pero de diferentes maneras

//Interfaces: Ayudan a implementar recursos dentro de cualquier clase