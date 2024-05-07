package com.aluracursos.screenmatch.modelos;

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




//        com.aluracursos.screenmatch.modelos.Principal.Pelicula otraPelicula=new com.aluracursos.screenmatch.modelos.Principal.Pelicula();
//        otraPelicula.nombre="Matrix";
//        otraPelicula.fechaDeLanzamiento=1998;
//        otraPelicula.duracionEnMinutos=180;
//
//      otraPelicula.muestraFichaTecnica();

    }


}
