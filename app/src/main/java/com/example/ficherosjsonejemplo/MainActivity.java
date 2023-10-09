package com.example.ficherosjsonejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
//Implementamos libreria Gson en gradle scripts -> build.gradle (module)
//Implementamos el acceso a internet en manifests -> Android Manfiests.xml

public class MainActivity extends AppCompatActivity {
    Gson gson = new Gson();
    String unaPelicula = "{\n" +
            "      \"titulo\": \"El Caballero Oscuro\",\n" +
            "      \"director\": \"Christopher Nolan\",\n" +
            "      \"actores\": [\"Christian Bale\", \"Heath Ledger\", \"Aaron Eckhart\"],\n" +
            "      \"portada\": \"https://almacen-rmr.tionazo.com/pelis/caballero-oscuro.jpg\"\n" +
            "    },";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}