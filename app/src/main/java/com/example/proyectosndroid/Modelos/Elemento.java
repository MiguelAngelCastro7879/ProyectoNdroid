package com.example.proyectosndroid.Modelos;

import android.content.Intent;

public class Elemento {
    private String titulo;
    private Intent intent;
    private int imagen;

    public Elemento(String titulo, Intent intent, int imagen) {
        this.titulo = titulo;
        this.intent = intent;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Intent getIntent() {
        return intent;
    }
    public void setIntent(Intent intent) {
        this.intent = intent;
    }
    public int getImagen() {
        return imagen;
    }
    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
