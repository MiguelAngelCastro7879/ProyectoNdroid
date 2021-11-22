package com.example.proyectosndroid.Modelos;

import android.content.Intent;

public class Layout {
    private int imagen;
    private String titulo;
    private Intent intent;

    public Layout(int imagen, String titulo, Intent intent) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.intent = intent;
    }

    public Layout(int imagen, String titulo) {
        this.imagen = imagen;
        this.titulo = titulo;
    }

    public Layout(String titulo) {
        this.titulo = titulo;
    }

    public Layout() {
    }

    public int getImagen() {
        return imagen;
    }
    public void setImagen(int imagen) {
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
}
