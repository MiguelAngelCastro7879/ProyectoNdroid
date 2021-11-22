package com.example.proyectosndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectosndroid.Adaptadores.ActividadAdapter;
import com.example.proyectosndroid.Modelos.Actividad;

import java.util.ArrayList;
import java.util.List;

public class index extends AppCompatActivity {
    RecyclerView lista;
    List<Actividad> actividades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        lista=findViewById(R.id.lista_actividades);
         actividades =new ArrayList<>();

        ActividadAdapter a = new ActividadAdapter(actividades);
        actividades.add(new Actividad("Layouts",
                "Aqui vemos todas las actividades usando MenuLayout, tambien vemos la introduccion de los intents y los on click",
                new Intent(index.this, MenuLayout.class)));
        actividades.add(new Actividad("RecyclerView",
                "Aqui vemos la primera actividad usando el recycler view, es algo ridiculo sabiendo que este es un recyclerview",
                new Intent(index.this, RecycleView.class)));
        actividades.add(new Actividad("Examen",
                "Como carajos reprobe esto si estaba bien facil",
                new Intent(index.this, Examen.class)));

        lista.setHasFixedSize(true);
        lista.setLayoutManager(new LinearLayoutManager(this));
        lista.setAdapter(a);

    }

}