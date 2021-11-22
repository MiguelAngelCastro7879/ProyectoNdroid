package com.example.proyectosndroid.Adaptadores;

import android.content.Intent;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectosndroid.Modelos.Layout;
import com.example.proyectosndroid.R;
import com.example.proyectosndroid.index;
import com.example.proyectosndroid.presentacion;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class LayoutAdapter extends RecyclerView.Adapter<LayoutAdapter.ViewHolder> {
    List<Layout> layouts;

    public LayoutAdapter(List<Layout> layouts) {
        this.layouts = layouts;
    }

    @NonNull
    @Override
    public LayoutAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item3, parent , false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LayoutAdapter.ViewHolder holder, int position) {
        Layout l = layouts.get(position);
        holder.llenar(l);
    }

    @Override
    public int getItemCount() {
        return layouts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imagen;
        TextView titulo;
        Intent intent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagen_layout);
            titulo = itemView.findViewById(R.id.titulo_layout);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            new CountDownTimer(500,1000) {
                @Override
                public void onTick(long l) {
                }
                @Override
                public void onFinish() {
                    v.getContext().startActivity(intent);

                }
            }.start();

        }

        public void llenar(Layout l) {
            intent = l.getIntent();
            titulo.setText(l.getTitulo());
            imagen.setImageResource(l.getImagen());
        }
    }
}
