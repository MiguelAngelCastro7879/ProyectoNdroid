package com.example.proyectosndroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    double variante_a=0,variante_b=0;
    public void imprimir(View view,TextView res, TextView oper){
        Button v=(Button)view;
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
                oper.setText(oper.getText()+String.valueOf(v.getText()));
                break;
            case R.id.por:
                res.setText(oper.getText()+String.valueOf(v.getText()));
                oper.setText("");
                break;
            case R.id.entre:
                break;
            case R.id.menos:
                break;
            case R.id.mas:
                break;
            case R.id.igual:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }

    }
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
