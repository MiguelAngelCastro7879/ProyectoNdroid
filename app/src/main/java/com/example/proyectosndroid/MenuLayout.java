package com.example.proyectosndroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Toast;

import com.example.proyectosndroid.Modelos.Actividad;

import java.util.ArrayList;
import java.util.List;

public class MenuLayout extends AppCompatActivity implements View.OnClickListener{

    RecyclerView r;
    List<Actividad> actividades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        List<Actividad> actividades = new ArrayList<>();

        findViewById(R.id.btn1).setOnClickListener(this);findViewById(R.id.btn2).setOnClickListener(this);findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);findViewById(R.id.btn5).setOnClickListener(this);findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);findViewById(R.id.btn9).setOnClickListener(this);
    }

    public void texto(View view) {
        Toast.makeText(this, "Holaaaaa", Toast.LENGTH_LONG).show();
    }

    @Override
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
                        setContentView(R.layout.linear_activity);
                        break;
                    case R.id.btn2:
                        setContentView(R.layout.relative_activity);
                        break;
                    case R.id.btn3:
                        startActivity(new Intent(MenuLayout.this, calculadora_linear2.class));
                        break;
                    case R.id.btn4:
                        setContentView(R.layout.linear_relative_activity);
                        break;
                    case R.id.btn5:
                        setContentView(R.layout.constraint_activity);
                        break;
                    case R.id.btn6:
                        setContentView(R.layout.constraint_activity2);
                        break;
                    case R.id.btn8:
                        startActivity(new Intent(MenuLayout.this, tictactoe.class));
                        break;
                    case R.id.btn9:
                        startActivity(new Intent(MenuLayout.this, intents_expimp.class));
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + v.getId());
                }
            }
        }.start();
    }

}