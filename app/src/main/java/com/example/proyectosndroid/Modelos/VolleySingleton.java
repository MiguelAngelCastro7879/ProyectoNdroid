package com.example.proyectosndroid.Modelos;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {
    private static VolleySingleton miInstancia;
    private RequestQueue miSolicitud;
    private static Context cntxt;

    private VolleySingleton(Context contexto) {
        cntxt = contexto;
        miSolicitud = getRequestQueue();
    }

    private RequestQueue getRequestQueue() {
        if(miSolicitud== null){
            miSolicitud = Volley.newRequestQueue(cntxt.getApplicationContext());
        }
        return miSolicitud;
    }

    public static synchronized VolleySingleton getMiInstancia(Context contexto) {
        if(miInstancia == null){
            miInstancia = new VolleySingleton(contexto);
        }
        return miInstancia;
    }
    public <T> void addToRequestQueue(Request<T> req){
        getRequestQueue().add(req);
    }

}
