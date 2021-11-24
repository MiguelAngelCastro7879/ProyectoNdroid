package com.example.proyectosndroid.Adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectosndroid.Modelos.Examen;
import com.example.proyectosndroid.R;

import java.util.List;

public class ExamenAdapter extends RecyclerView.Adapter<ExamenAdapter.ViewHolder> {
    List<Examen> examen;

    public ExamenAdapter(List<Examen> examen) {
        this.examen = examen;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exam, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Examen e = examen.get(position);
        holder.llenar(e);
    }

    @Override
    public int getItemCount() {
        return examen.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView titulo;
        ImageView imagen;
        Intent intent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo= itemView.findViewById(R.id.exam_nombre);
            imagen = itemView.findViewById(R.id.exam_imagen);
            itemView.setOnClickListener(this);
        }

        public void llenar(Examen e) {
            titulo.setText(e.getTitulo());
            imagen.setImageResource(e.getImagen());
            intent=e.getIntent();
        }

        @Override
        public void onClick(View view) {
            view.getContext().startActivity(intent);

        }
    }
}
