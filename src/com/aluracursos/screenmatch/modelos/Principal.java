package com.aluracursos.screenmatch.modelos;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula=new Pelicula();
        miPelicula.nombre="Encanto";
        miPelicula.fechaDeLanzamiento=2021;
        miPelicula.duracionEnMinutos=120;


        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());




//        Pelicula otraPelicula=new Pelicula();
//        otraPelicula.nombre="Matrix";
//        otraPelicula.fechaDeLanzamiento=1998;
//        otraPelicula.duracionEnMinutos=180;
//
//      otraPelicula.muestraFichaTecnica();

    }
}
