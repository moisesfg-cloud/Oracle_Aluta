package com.aluracursos.screenmatch.modelos;

public class Titulo {
    //ASIGNACIONES
    private String nombre;
    private int fechaDeLanzamineto;
    private int duracionEnMinutos;
    private boolean inlcuidoEnElPlan;
    private double sumaDeLasEvaluaciones; //Private sirve para que el metodo no sea usado dentro de otra clase
    private int totalDeLasEvaluaciones;

    //METODOS
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public boolean getInlcuidoEnElPlan() {
        return inlcuidoEnElPlan;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos ;
    }

    public int getFechaDeLanzamineto() {
        return fechaDeLanzamineto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //SETERS
    public void setFechaDeLanzamineto(int fechaDeLanzamineto) {
        this.fechaDeLanzamineto = fechaDeLanzamineto;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setInlcuidoEnElPlan(boolean inlcuidoEnElPlan) {
        this.inlcuidoEnElPlan = inlcuidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("Mi película es: " + nombre);
        System.out.println("Su fehca de lanzamiento fue en el: " + fechaDeLanzamineto);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++; // Cada que se realice una evaluacion va a sumarlas
    }
    public double calculaLaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones; //Esto va a hacer la division de los resultados
    }
}
