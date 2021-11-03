package com.example.proyectosndroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class recycle_adaptador extends BaseAdapter {
    private ArrayList<recycle_entidad> listitems;
    private Context context;

    public recycle_adaptador(ArrayList<recycle_entidad> listitems,Context context){
        this.listitems=listitems;
        this.context=context;
    }

    @Override
    public int getCount() { return listitems.size(); }

    @Override
    public Object getItem(int position) { return listitems.get(position); }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        recycle_entidad Item = (recycle_entidad)  getItem(position);
        convertView= LayoutInflater.from(context).inflate(R.layout.item,null);
        ImageView imagen= convertView.findViewById(R.id.imagen_chida);
        TextView titulo= convertView.findViewById(R.id.titulo);
        TextView subtitulo= convertView.findViewById(R.id.subtitulo);

        imagen.setImageResource(Item.getImage());
        titulo.setText(Item.getTitulo());
        subtitulo.setText(Item.getSubtitulo());

        return convertView;
    }
}
