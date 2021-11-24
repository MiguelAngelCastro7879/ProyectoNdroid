package com.example.proyectosndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class VoleyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voley);

        RequestQueue solicitud = Volley.newRequestQueue(this);
        String url = "https://jsonplaceholder.typicode.com/posts";


        StringRequest cadenaSolicitud = new StringRequest(
                Request.Method.GET,
                url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            },
            new Response.ErrorListener(){
                @Override
                public void onErrorResponse(){

                }
            }
        });
    }
}