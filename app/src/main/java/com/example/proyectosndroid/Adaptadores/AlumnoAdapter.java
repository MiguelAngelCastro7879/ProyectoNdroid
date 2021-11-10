package com.example.proyectosndroid.Adaptadores;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectosndroid.Modelos.Alumno;
import com.example.proyectosndroid.R;

import java.util.List;


public class AlumnoAdapter extends  RecyclerView.Adapter<AlumnoAdapter.ViewHolder> {

    private List<Alumno> lista;

    public AlumnoAdapter(List<Alumno> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    //acceso//lo que devuelve//
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
