package com.example.proyectosndroid.Listas;

import android.content.Intent;

import com.example.proyectosndroid.Constraint1;
import com.example.proyectosndroid.Constraint2;
import com.example.proyectosndroid.IntentsImplicitos;
import com.example.proyectosndroid.Linear;
import com.example.proyectosndroid.MenuLayout;
import com.example.proyectosndroid.R;
import com.example.proyectosndroid.Relative;
import com.example.proyectosndroid.RelativeLinear;
import com.example.proyectosndroid.Tictactoe;
import com.example.proyectosndroid.calculadora_linear2;

public class relleno_datos {
    private Intent[] intent;

    private String[] titulo = {
            "Linear form",
            "Relative calc",
            "calculadora linear",
            "Relative Linear",
            "Constraint 1",
            "Constraint 2",
            "Tictactoe",
            "Intents Implicitos"
    };
    private int[] imagen = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
    };

    public relleno_datos() {

    }

    public String[] getTitulo() {
        return titulo;
    }

    public int[] getImagen() {
        return imagen;
    }
}
