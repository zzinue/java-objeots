package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula=new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);


        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println("Media de las evaluaciones de la pelicula: "+ miPelicula.calculaMedia());

    Serie casaDragon=new Serie();
    casaDragon.setNombre("La casa del dragon");
    casaDragon.setFechaDeLanzamiento(2022);
    casaDragon.setTemporada(1);
    casaDragon.setMinutosPorEposodio(50);
    casaDragon.setEpisodiosPorTemporadas(10);
    casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());


        CalculadoraDeTiempo calculadora=new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());

FiltroRecomendaciones filtroRecomendaciones=new FiltroRecomendaciones();
filtroRecomendaciones.filtra(miPelicula);

Episodio episodio=new Episodio();
episodio.setNumero(1);
episodio.setNombre("la casa de Targaryen");
episodio.setSerie(casaDragon);
episodio.setTotalVisualizaciones(50);
filtroRecomendaciones.filtra(episodio);


    }


}
