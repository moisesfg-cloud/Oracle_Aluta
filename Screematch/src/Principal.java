import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltrRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula; // Se importo el paquete para hagan uso de las herramientas
import com.aluracursos.screenmatch.modelos.Serie;

import javax.sql.rowset.FilteredRowSet;
import java.sql.SQLOutput;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula= new Pelicula();
        miPelicula.setNombre("Black Panter");
        miPelicula.setFechaDeLanzamineto(2022);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setInlcuidoEnElPlan(true);

        miPelicula.muestraFichaTecnica(); //Dentro de este metodo se encuentran los sout, se les llamada mediatnte el metidi
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaLaMedia());
//        miPelicula.totalDeLasEvaluaciones

        //System.out.println(miPelicula.sumaDeLasEvaluaciones);
        // System.out.println(miPelicula.totalDeLasEvaluacion);

        Serie elChapo = new Serie();// Se crea el atributo "serie y se realiza un nuevo espacio en memoria para una nueva serie) Se les llama instancias
        elChapo.setNombre("El chapo");
        elChapo.setFechaDeLanzamineto(2021);
        elChapo.setTemporadas(1);
        elChapo.setMinutosPorEpisodio(45);
        elChapo.setEpisodiosPorTemporada(14);
        elChapo.muestraFichaTecnica();
        System.out.println(elChapo.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(elChapo);
        System.out.println(calculadora.getTiempoTotal());

        FiltrRecomendacion filtrRecomendacion = new FiltrRecomendacion();
        filtrRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("El chapito");
        episodio.setSerie(elChapo);
        episodio.setTotalVisualizaciones(80);
        System.out.println("El episodio " + episodio.getNombre());

        filtrRecomendacion.filtra(episodio);
    }

}
