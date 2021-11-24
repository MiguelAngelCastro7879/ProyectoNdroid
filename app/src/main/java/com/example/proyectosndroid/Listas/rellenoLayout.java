package com.example.proyectosndroid.Listas;

import android.content.Intent;
import android.widget.ImageView;

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

public class rellenoLayout {
    private Class[] classes = {
                Linear.class,
                Relative.class,
                calculadora_linear2.class,
                RelativeLinear.class,
                Constraint1.class,
                Constraint2.class,
                Tictactoe.class,
                IntentsImplicitos.class
    };

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
            R.drawable.linear_form,
            R.drawable.relat_calc,
            R.drawable.linear,
            R.drawable.relative,
            R.drawable.constraint1,
            R.drawable.constraint2,
            R.drawable.gato,
            R.drawable.intents,
    };

    public rellenoLayout() {
    }

    public Class[] getClasses() {
        return classes;
    }

    public String[] getTitulo() {
        return titulo;
    }

    public int[] getImagen() {
        return imagen;
    }
}
