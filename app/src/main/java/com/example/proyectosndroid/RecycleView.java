package com.example.proyectosndroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proyectosndroid.Adaptadores.AlumnoAdapter;
import com.example.proyectosndroid.Modelos.Alumno;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends AppCompatActivity {

/*
 Alumno a= new Alumno("Miguel","19170023","8715722538",19);
 Alumno b= new Alumno();
*/


    RecyclerView re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        re = findViewById(R.id.lista);
        List<Alumno> Alumnos = new ArrayList<>();
        AlumnoAdapter aa = new AlumnoAdapter(Alumnos);
        Alumnos.add(new Alumno("Miguel","19170023","8715722538",19));
        Alumnos.add(new Alumno("Miguel","19170023","8715722538",19));
        Alumnos.add(new Alumno("Miguel","19170023","8715722538",19));
        Alumnos.add(new Alumno("Miguel","19170023","8715722538",19));
        re.setHasFixedSize(true);
        re.setLayoutManager(new LinearLayoutManager(this));
        re.setAdapter(aa);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}