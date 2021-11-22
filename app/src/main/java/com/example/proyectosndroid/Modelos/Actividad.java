package com.example.proyectosndroid.Modelos;

import android.content.Intent;

public class Actividad {
    private String nombre;
    private String descripcion;
    private Intent intent;

    public Actividad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Actividad(String nombre, String descripcion, Intent intent) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.intent = intent;
    }

    public Actividad() {
    }

    public Intent getIntent() {
        return intent;
    }
    public void setIntent(Intent intent) {
        this.intent = intent;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
