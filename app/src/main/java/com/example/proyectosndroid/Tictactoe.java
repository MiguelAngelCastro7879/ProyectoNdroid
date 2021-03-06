package com.example.proyectosndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tictactoe extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
    }

    public int turno=1,tiros=1;
    int[][] jugadas = new int[3][3];
    TextView texto;

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
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
    @SuppressLint("NonConstantResourceId")
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
            default:
                throw new IllegalStateException("Unexpected value: " + b.getId());
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