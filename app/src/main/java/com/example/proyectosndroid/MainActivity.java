package com.example.proyectosndroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);

    }

    public void texto(View view) {
        Toast.makeText(this, "Holaaaaa", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                setContentView(R.layout.linear_activity);
                break;
            case R.id.btn2:
                setContentView(R.layout.relative_activity);
                break;
            case R.id.btn3:
                setContentView(R.layout.linear_activity2);
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
                setContentView(R.layout.tictactoe);
                break;
//            case R.id.btn9:
//                setContentView(R.layout.linear_activity);
//                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}