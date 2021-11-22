package com.example.proyectosndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.proyectosndroid.Adaptadores.ElementoAdapter;
import com.example.proyectosndroid.Modelos.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Examen extends AppCompatActivity {

    RecyclerView r;
    List<Elemento> elementos;
    String[] titulo;
    int[] imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen);


        for(int i = 0; i< 0; i++)
        {}
        r= findViewById(R.id.recycler_intents);
        elementos = new ArrayList<>();
        ElementoAdapter l_adapter = new ElementoAdapter(elementos);
            elementos.add(new Elemento(
                    "Llamada directa",
                    new Intent(Intent.ACTION_CALL, Uri.parse("tel: 8715722538")),
                    R.drawable.telefono));
            elementos.add(new Elemento( "Explicito 1",
                    new Intent(Intent.ACTION_CALL, Uri.parse("tel: 8715722538")),
                    R.drawable.lista));
            elementos.add(new Elemento( "Explicito 2",
                    new Intent(Intent.ACTION_CALL, Uri.parse("tel: 8715722538")),
                    R.drawable.ic_launcher_background));
            elementos.add(new Elemento( "Google",
                    new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/")),
                    R.drawable.google));
            elementos.add(new Elemento("Dial",
                    new Intent(Intent.ACTION_VIEW,Uri.parse("tel:8715722538")),
                    R.drawable.telefono));
            elementos.add(new Elemento( "Google Maps"
                    ,new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=37.423156,-122.084917")),
                    R.drawable.maps));

        r.setLayoutManager(new LinearLayoutManager(this));
        r.setHasFixedSize(true);
        r.setAdapter(l_adapter);
    }
}