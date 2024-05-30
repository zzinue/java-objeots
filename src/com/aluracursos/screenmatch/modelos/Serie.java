package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporada;
    private  int episodiosPorTemporadas;
    private  int minutosPorEposodio;

    @Override
    public int getDuracionEnMinutos() {
        return  temporada* episodiosPorTemporadas*minutosPorEposodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public int getMinutosPorEposodio() {
        return minutosPorEposodio;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public void setMinutosPorEposodio(int minutosPorEposodio) {
        this.minutosPorEposodio = minutosPorEposodio;
    }
}
