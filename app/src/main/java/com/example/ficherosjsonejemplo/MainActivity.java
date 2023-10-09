package com.example.ficherosjsonejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
//Implementamos libreria Gson en gradle scripts -> build.gradle (module)
//Implementamos el acceso a internet en manifests -> Android Manfiests.xml
//Implementamos libreria Glide en gradle scripts -> build.gradle (module)

public class MainActivity extends AppCompatActivity {
    Gson gson = new Gson();
    String unaPelicula_json = "{\n" +
            "      \"titulo\": \"El Caballero Oscuro\",\n" +
            "      \"director\": \"Christopher Nolan\",\n" +
            "      \"actores\": [\"Christian Bale\", \"Heath Ledger\", \"Aaron Eckhart\"],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/caballero-oscuro.jpg\"\n" +
            "    },";

    TextView titulo, director, actores, portada, serializado, aCadena;
    ImageView imgPortada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        titulo = (TextView) findViewById(R.id.titulo);
        director = (TextView) findViewById(R.id.director);
        actores = (TextView) findViewById(R.id.actores);
        portada = (TextView) findViewById(R.id.portada);
        serializado = (TextView) findViewById(R.id.serializado);
        aCadena= (TextView) findViewById(R.id.aCadena);
        imgPortada = (ImageView) findViewById(R.id.imgPortada);

        Pelicula peli;
        //(Parseamos a objeto tipo Película) parámetro 1 ->Objeto(Cadena de texto con el json), segundo parámetro ->Clase objetivo
        peli = gson.fromJson(unaPelicula_json, Pelicula.class);


        titulo.setText(peli.getTitulo());
        director.setText(peli.getDirector());
        actores.setText(peli.getActores().toString());
        portada.setText(peli.getPortada());


        peli.addActor("Joker");
        actores.setText(peli.getActores().toString()); //Lo imprimimos aqui por que arriba solo lo añade


        /*
        try {
            Thread.sleep(1000);
            peli.deleteActor("Christian Bale");
            actores.setText(peli.getActores().toString());
        }catch (InterruptedException e){
            throw new RuntimeException()e;
        }
        */
        serializado.setText(gson.toJson(peli)); //serializado -> convertir a texto plano
        aCadena.setText(peli.toString());
        //Para cargar la imagen imgPortada con la librería glide
        Glide.with(imgPortada.getContext()).load(peli.getPortada()).placeholder(R.drawable.ic_launcher_background).
                into(imgPortada);

    }
}