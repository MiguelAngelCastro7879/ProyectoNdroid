package com.example.proyectosndroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {

    private RecyclerView lista;
    private recycle_adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        lista=findViewById(R.id.lista);
        adaptador=new recycle_adaptador(getArrayItems(),this);
    }

    private ArrayList<recycle_entidad> getArrayItems() {
        ArrayList<recycle_entidad> lista = new ArrayList<>();
        for(int i=0;i<30;i++)
        {
            lista.add(new recycle_entidad(R.drawable.ic_launcher_background,"Titulo # "+i,  "subtitulo #"+i));

        }
        return lista;
    }
}