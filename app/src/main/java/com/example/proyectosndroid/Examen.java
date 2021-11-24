package com.example.proyectosndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.proyectosndroid.Adaptadores.ExamenAdapter;
import com.example.proyectosndroid.Modelos.Permiso;

import java.util.ArrayList;
import java.util.List;

public class Examen extends AppCompatActivity {

    RecyclerView r;
    List<com.example.proyectosndroid.Modelos.Examen> examen;
    String[] titulo;
    int[] imagen;
    List<Permiso> permisos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen);

        for(int i = 0; i< 0; i++)
        {}
        r= findViewById(R.id.recycler_intents);
        examen = new ArrayList<>();
        ExamenAdapter l_adapter = new ExamenAdapter(examen);
            examen.add(new com.example.proyectosndroid.Modelos.Examen(
                    "Llamada directa",
                    new Intent(Intent.ACTION_CALL, Uri.parse("tel: 8715722538")),
                    R.drawable.telefono));
            examen.add(new com.example.proyectosndroid.Modelos.Examen( "Explicito 1",
                    new Intent(Intent.ACTION_CALL, Uri.parse("tel: 8715722538")),
                    R.drawable.lista));
            examen.add(new com.example.proyectosndroid.Modelos.Examen( "Explicito 2",
                    new Intent(Intent.ACTION_CALL, Uri.parse("tel: 8715722538")),
                    R.drawable.ic_launcher_background));
            examen.add(new com.example.proyectosndroid.Modelos.Examen( "Google",
                    new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/")),
                    R.drawable.google));
            examen.add(new com.example.proyectosndroid.Modelos.Examen("Dial",
                    new Intent(Intent.ACTION_VIEW,Uri.parse("tel:8715722538")),
                    R.drawable.telefono));
            examen.add(new com.example.proyectosndroid.Modelos.Examen( "Google Maps"
                    ,new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=37.423156,-122.084917")),
                    R.drawable.maps));


        r.setLayoutManager(new LinearLayoutManager(this));
        r.setHasFixedSize(true);
        r.setAdapter(l_adapter);
    }
}