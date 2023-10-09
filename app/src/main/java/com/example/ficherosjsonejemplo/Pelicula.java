package com.example.ficherosjsonejemplo;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo, director, portada; //portada es url
    private List<String> actores; //Lista genérica y abstracta: no podemos instanciar una coleccion de tipo List

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, String portada, List<String> actores) {
        this.titulo = titulo;
        this.director = director;
        this.portada = portada;
        this.actores = new ArrayList<String>(); //Definimos que esa List sea de tipo ArrayList
        this.actores = (ArrayList) actores;
    }

    public void addActor(String actor){
        this.actores.add(actor);
    }
    public void deleteActor(String actor){
        for (String actor_existente: actores){
            if (actor_existente.compareTo(actor) == 0){
                actores.remove(actor);
            }
        }
    }


    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", portada='" + portada + '\'' +
                ", actores=" + actores +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }
}
