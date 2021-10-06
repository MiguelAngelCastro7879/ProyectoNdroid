package com.example.proyectosndroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ir_a(View v) {

        btn1 = findViewById(R.id.btn1);btn2 = findViewById(R.id.btn2);btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);btn5 = findViewById(R.id.btn5);btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);btn8 = findViewById(R.id.btn8);btn9 = findViewById(R.id.btn9);

        Button b=(Button) v;
        switch (b.getId()){
            case R.id.btn1:
                setContentView(R.layout.linear_activity);
                break;
            case R.id.btn2:
                setContentView(R.layout.relative_activity);
                break;
            case R.id.btn3:
                setContentView(R.layout.linear_activity2);
                break;
//            case R.id.btn4:
//                setContentView(R.layout.constraint_activity);
//                break;
//            case R.id.btn5:
//                setContentView(R.layout.linear_activity);
//                break;
            case R.id.btn6:
                setContentView(R.layout.constraint_activity);
                break;
            case R.id.btn7:
                setContentView(R.layout.constraint_activity2);
                break;
//            case R.id.btn8:
//                setContentView(R.layout.linear_activity);
//                break;
//            case R.id.btn9:
//                setContentView(R.layout.linear_activity);
//                break;
            default:
                throw new IllegalStateException("Unexpected value: " + b.getId());
        }

    }

}