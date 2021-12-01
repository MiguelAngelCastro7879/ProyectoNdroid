package com.example.proyectosndroid.Modelos;

public class Pokemon {
    private String name;
    private String url;

    public Pokemon() {
    }

    public Pokemon(String name) {
        this.name = this.name;
    }

    public Pokemon(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
