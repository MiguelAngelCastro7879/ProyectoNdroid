package com.example.proyectosndroid;

import java.io.Serializable;

public class recycle_entidad implements Serializable {
    private int image;
    private String titulo;
    private String subtitulo;

    public recycle_entidad(int image,String titulo,String subtitulo){
        this.image=image;
        this.titulo=titulo;
        this.subtitulo=subtitulo;
    }

    public int getImage() { return image; }

    public String getTitulo() { return titulo; }

    public String getSubtitulo() { return subtitulo; }
}
