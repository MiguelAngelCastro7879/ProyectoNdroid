package com.example.proyectosndroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public int turno=1,tiros=1;
    int[][] jugadas = new int[3][3];
    TextView texto,xf,of,xc,oc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);findViewById(R.id.btn2).setOnClickListener(this);findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);findViewById(R.id.btn5).setOnClickListener(this);findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);findViewById(R.id.btn9).setOnClickListener(this);

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
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }

    public void tictac(View view) {
        Button b = (Button) view;
        texto=findViewById(R.id.ganador);

        if (turno == 1) {
            b.setText("X");
            b.setEnabled(false);
            turno = 2;
        } else {
            b.setText("O");
            b.setEnabled(false);
            turno = 1;
        }
        reg_jugada(turno,b);
        ganador();
    }
    public void reg_jugada(int turno, Button b){
        switch (b.getId()){
            case R.id.button1:
                jugadas[0][0]=turno;
                break;
            case R.id.button2:
                jugadas[0][1]=turno;
                break;
            case R.id.button3:
                jugadas[0][2]=turno;
                break;
            case R.id.button4:
                jugadas[1][0]=turno;
                break;
            case R.id.button5:
                jugadas[1][1]=turno;
                break;
            case R.id.button6:
                jugadas[1][2]=turno;
                break;
            case R.id.button7:
                jugadas[2][0]=turno;
                break;
            case R.id.button8:
                jugadas[2][1]=turno;
                break;
            case R.id.button9:
                jugadas[2][2]=turno;
                break;
        }
        tiros++;
    }

    public void ganador(){
        int contar_x_fila1 = 0,contar_x_fila2 = 0,contar_x_fila3 = 0;
        int contar_o_fila1 = 0,contar_o_fila2 = 0,contar_o_fila3 = 0;
        int contar_x_columna1 = 0,contar_x_columna2 = 0,contar_x_columna3 = 0;
        int contar_o_columna1 = 0,contar_o_columna2 = 0,contar_o_columna3 = 0;
        int contar_x_diagonal1=0,contar_x_diagonal2=0;
        int contar_o_diagonal1=0,contar_o_diagonal2=0;
        int gato=3;
        boolean ganador=false;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (jugadas[i][j] == 1)
                {
                    switch (j){
                        case 0:
                            contar_x_columna1++;
                            if (contar_x_columna1 == 3) { ganador = true;}
                            break;
                        case 1:
                            contar_x_columna2++;
                            if (contar_x_columna2 == 3) { ganador = true; }
                            break;
                        case 2:
                            contar_x_columna3++;
                            if (contar_x_columna3 == 3) { ganador = true; }
                            break;
                    }
                    switch (i){
                        case 0:
                            contar_x_fila1++;
                            if (contar_x_fila1 == 3) { ganador = true; }
                            break;
                        case 1:
                            contar_x_fila2++;
                            if (contar_x_fila2 == 3) { ganador = true; }
                            break;
                        case 2:
                            contar_x_fila3++;
                            if (contar_x_fila3 == 3) { ganador = true; }
                            break;
                    }
                    //SI el jugador x realiza un movimiento, esta parte
                    //sirve para checar fila por fila para ver si se cumplen
                    //los 3 en raya
                }

                if (jugadas[i][j] == 2)
                {
                    switch (j){
                        case 0:
                            contar_o_columna1++;
                            if (contar_o_columna1 == 3) { ganador = true; }
                            break;
                        case 1:
                            contar_o_columna2++;
                            if (contar_o_columna2 == 3) { ganador = true; }
                            break;
                        case 2:
                            contar_o_columna3++;
                            if (contar_o_columna3 == 3) { ganador = true; }
                            break;
                    }
                    switch (i){
                        case 0:
                            contar_o_fila1++;
                            if (contar_o_fila1 == 3) { ganador = true; }
                            break;
                        case 1:
                            contar_o_fila2++;
                            if (contar_o_fila2 == 3) { ganador = true; }
                            break;
                        case 2:
                            contar_o_fila3++;
                            if (contar_o_fila3 == 3) { ganador = true; }
                            break;
                    }
                    //SI el jugador o realiza un movimiento, esta parte
                    //sirve para checar fila por fila para ver si se cumplen
                    //los 3 en raya
                }

                if (i == j)
                {
                    if (jugadas[i][j] == 1)
                    {
                        contar_x_diagonal1++;
                        if (contar_x_diagonal1 == 3) {
                            ganador = true;
                        }
                    }
                    if (jugadas[i][j] == 2)
                    {
                        contar_o_diagonal1++;
                        if (contar_o_diagonal1 == 3) {
                            ganador = true;
                        }

                    }
                }

                if ((i + j) == gato -1)
                {
                    if (jugadas[i][j] == 1)
                    {
                        contar_x_diagonal2++;
                        if (contar_x_diagonal2 == 3) {
                            ganador = true;
                        }
                    }
                    if (jugadas[i][j] == 2)
                    {
                        contar_o_diagonal2++;
                        if (contar_o_diagonal2 == 3) {
                            ganador = true;
                        }

                    }

                }

            }
        }
        if(ganador){
            String v = "";
            if (turno==2)
            {
                v = "GANO X";
            }
            if(turno==1)
            {
                v = "GANO O";
            }
            texto.setText(v);
            botones();
            tiros = 0;
        }
        if (tiros == 10)
        {
            texto.setText(R.string.empate);
        }

    }
    public void botones(){
        findViewById(R.id.button1).setEnabled(false);
        findViewById(R.id.button3).setEnabled(false);
        findViewById(R.id.button3).setEnabled(false);
        findViewById(R.id.button4).setEnabled(false);
        findViewById(R.id.button5).setEnabled(false);
        findViewById(R.id.button6).setEnabled(false);
        findViewById(R.id.button7).setEnabled(false);
        findViewById(R.id.button8).setEnabled(false);
        findViewById(R.id.button9).setEnabled(false);
    }
}