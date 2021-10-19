package com.example.proyectosndroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

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
