package com.example.proyectosndroid.Modelos;

public class Pokemon {
    private String nombre;
    private String url;

    public Pokemon() {
    }

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public Pokemon(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
