package com.example.proyectosndroid;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectosndroid.Adaptadores.LayoutAdapter;
import com.example.proyectosndroid.Listas.rellenoLayout;
import com.example.proyectosndroid.Modelos.Layout;

import java.util.ArrayList;
import java.util.List;

public class MenuLayout extends AppCompatActivity{

    RecyclerView r;
    List<Layout> layouts;
    String[] titulo;
    int[] imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);
        rellenoLayout datos = new rellenoLayout();
        titulo = datos.getTitulo();
        imagen = datos.getImagen();


        r= findViewById(R.id.r_layout);
        layouts = new ArrayList<>();
        LayoutAdapter l_adapter = new LayoutAdapter(layouts);
        for(int i = 0; i< datos.getClasses().length; i++){
            layouts.add(new Layout(datos.getImagen()[i],
                    datos.getTitulo()[i],
                    new Intent(MenuLayout.this, datos.getClasses()[i])));

        }

        r.setLayoutManager(new GridLayoutManager(this, 2));
        r.setHasFixedSize(true);
        r.setAdapter(l_adapter);
    }

}