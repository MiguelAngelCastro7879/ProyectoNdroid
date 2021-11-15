package com.example.proyectosndroid.Adaptadores;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.proyectosndroid.Modelos.Alumno;
import com.example.proyectosndroid.R;

import java.util.List;


public class AlumnoAdapter extends  RecyclerView.Adapter<AlumnoAdapter.ViewHolder> {

    private final List<Alumno> lista;

    public AlumnoAdapter(List<Alumno> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    //acceso//lo que devuelve//
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        //transformar una item layout en vista
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Alumno a = lista.get(position);
        holder.llenar(a);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView matricula, nombre, telefono, edad;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            matricula = itemView.findViewById(R.id.txtmatricula);
            telefono = itemView.findViewById(R.id.txttelefono);
            edad = itemView.findViewById(R.id.txtedad);
            nombre = itemView.findViewById(R.id.txtnombre);
        }

        public void llenar(Alumno a) {
            matricula.setText(a.getMatricula());
            telefono.setText(a.getTelefono());
            edad.setText(String.valueOf(a.getEdad()));
            nombre.setText(a.getNombre());
        }
    }
}
