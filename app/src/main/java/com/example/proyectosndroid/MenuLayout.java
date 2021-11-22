package com.example.proyectosndroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Toast;

import com.example.proyectosndroid.Adaptadores.LayoutAdapter;
import com.example.proyectosndroid.Listas.relleno_datos;
import com.example.proyectosndroid.Modelos.Layout;

import java.util.ArrayList;
import java.util.List;

public class MenuLayout extends AppCompatActivity /*implements View.OnClickListener*/{

    RecyclerView r;
    List<Layout> layouts;
    Intent[] intent = {
        new Intent( MenuLayout.this, Linear.class),
        new Intent( MenuLayout.this, Relative.class),
        new Intent( MenuLayout.this, calculadora_linear2.class),
        new Intent( MenuLayout.this, RelativeLinear.class),
        new Intent( MenuLayout.this, Constraint1.class),
        new Intent( MenuLayout.this, Constraint2.class),
        new Intent( MenuLayout.this, Tictactoe.class),
        new Intent( MenuLayout.this, IntentsImplicitos.class),
    };
    String[] titulo;
    int[] imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);
        relleno_datos datos = new relleno_datos();
        titulo = datos.getTitulo();
        imagen = datos.getImagen();


        r= findViewById(R.id.r_layout);
        layouts = new ArrayList<>();
        LayoutAdapter l_adapter = new LayoutAdapter(layouts);
        for(int i = 0; i< 1; i++){
            layouts.add(new Layout(datos.getImagen()[i],
                    datos.getTitulo()[i],
                    intent[i]));

        }
        layouts.add(new Layout(R.drawable.ic_launcher_background,
                "aaaa",
                new Intent(MenuLayout.this, IntentsImplicitos.class)));

        r.setLayoutManager(new GridLayoutManager(this, 2));
        r.setHasFixedSize(true);
        r.setAdapter(l_adapter);
        //findViewById(R.id.btn1).setOnClickListener(this);findViewById(R.id.btn2).setOnClickListener(this);findViewById(R.id.btn3).setOnClickListener(this);
        //findViewById(R.id.btn4).setOnClickListener(this);findViewById(R.id.btn5).setOnClickListener(this);findViewById(R.id.btn6).setOnClickListener(this);
        //findViewById(R.id.btn8).setOnClickListener(this);findViewById(R.id.btn9).setOnClickListener(this);
    }

    public void texto(View view) {
        Toast.makeText(this, "Holaaaaa", Toast.LENGTH_LONG).show();
    }

   /* @Override
    public void onClick(View v) {
        new CountDownTimer(2000,1000) {
            @Override
            public void onTick(long l) {
                Toast.makeText(MenuLayout.this,""+l/1000,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFinish() {
                switch (v.getId()){
                    case R.id.btn1:
                        startActivity(new Intent(MenuLayout.this, Linear.class));
                        break;
                    case R.id.btn2:
                        startActivity(new Intent(MenuLayout.this, Relative.class));
                        break;
                    case R.id.btn3:
                        startActivity(new Intent(MenuLayout.this, calculadora_linear2.class));
                        break;
                    case R.id.btn4:
                        startActivity(new Intent(MenuLayout.this, RelativeLinear.class));
                        break;
                    case R.id.btn5:
                        startActivity(new Intent(MenuLayout.this, Constraint1.class));
                        break;
                    case R.id.btn6:
                        startActivity(new Intent(MenuLayout.this, Constraint2.class));
                        break;
                    case R.id.btn8:
                        startActivity(new Intent(MenuLayout.this, Tictactoe.class));
                        break;
                    case R.id.btn9:
                        startActivity(new Intent(MenuLayout.this, IntentsImplicitos.class));
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + v.getId());
                }
            }
        }.start();
    }
*/
}