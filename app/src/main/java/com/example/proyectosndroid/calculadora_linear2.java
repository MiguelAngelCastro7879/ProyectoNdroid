package com.example.proyectosndroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculadora_linear2 extends AppCompatActivity implements View.OnClickListener {

    TextView resultado, operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_linear2);
        findViewById(R.id.one).setOnClickListener(this);
        findViewById(R.id.two).setOnClickListener(this);
        findViewById(R.id.three).setOnClickListener(this);
        findViewById(R.id.four).setOnClickListener(this);
        findViewById(R.id.five).setOnClickListener(this);
        findViewById(R.id.six).setOnClickListener(this);
        findViewById(R.id.seven).setOnClickListener(this);
        findViewById(R.id.eight).setOnClickListener(this);
        findViewById(R.id.nine).setOnClickListener(this);
        findViewById(R.id.zero).setOnClickListener(this);
        findViewById(R.id.por).setOnClickListener(this);
        findViewById(R.id.entre).setOnClickListener(this);
        findViewById(R.id.menos).setOnClickListener(this);
        findViewById(R.id.mas).setOnClickListener(this);
        findViewById(R.id.igual).setOnClickListener(this);
        resultado=findViewById(R.id.resultado);
        operacion=findViewById(R.id.operacion);

    }
    @Override
    public void onClick(View v) {
        Button boton=(Button)v;
        switch (v.getId()){
            case R.id.one:
            case R.id.two:
            case R.id.three:
            case R.id.four:
            case R.id.five:
            case R.id.six:
            case R.id.seven:
            case R.id.eight:
            case R.id.nine:
            case R.id.zero:
                operacion.setText(operacion.getText()+String.valueOf(boton.getText()));
                break;
//            case R.id.por:;
//                break;
//            case R.id.entre:
//                break;
//            case R.id.menos:
//                break;
//            case R.id.mas:
//                break;
//            case R.id.igual:
//                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }

    }

    double variante_a=0,variante_b=0;
//    public void operaciones(View view, TextView res, TextView oper){
//        Button v=(Button)view;
//        switch (v.getId()){
//            case R.id.one:
//            case R.id.two:
//            case R.id.three:
//            case R.id.four:
//            case R.id.five:
//            case R.id.six:
//            case R.id.seven:
//            case R.id.eight:
//            case R.id.nine:
//            case R.id.zero:
//                oper.setText(oper.getText()+String.valueOf(v.getText()));
//                break;
//            case R.id.por:
//                res.setText(oper.getText()+String.valueOf(v.getText()));
//                oper.setText("");
//                break;
//            case R.id.entre:
//                break;
//            case R.id.menos:
//                break;
//            case R.id.mas:
//                break;
//            case R.id.igual:
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + v.getId());
//        }
//
//    }
    public void sumar(){

    }
    public void restar(){

    }
    public void multiplicar(){

    }
    public void dividir(){

    }
    public void igual(){

    }

}