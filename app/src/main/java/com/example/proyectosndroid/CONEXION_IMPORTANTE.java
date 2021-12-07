package com.example.proyectosndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.proyectosndroid.Modelos.VolleySingleton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class CONEXION_IMPORTANTE extends AppCompatActivity implements View.OnClickListener {

    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conexion_importante);
        findViewById(R.id.sendOn).setOnClickListener(this);
        findViewById(R.id.sendOff).setOnClickListener(this);
        tx= findViewById(R.id.adafruit);
        findViewById(R.id.data).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        JSONObject datos = new JSONObject();
        if (view.getId() == R.id.sendOn) {
            try {
                datos.put("value", "ON");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            peticion(datos);
        }
        else if (view.getId() == R.id.sendOff){
            try {
                datos.put("value", "OFF");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            peticion(datos);
        }
        else{
            peticion2();
        }

    }
    public void peticion(JSONObject datos){
        String url = "https://io.adafruit.com/api/v2/MiguelAngel7879/feeds/led/data";
        JsonObjectRequest jsonRequest = new JsonObjectRequest(
                Request.Method.POST,
                url,
                datos,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {



                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("X-AIO-Key", "aio_czGc48dihOrfOil3hn1qPa0sZFD7");
                return headers;
            }
        };

        VolleySingleton.getMiInstancia(this).addToRequestQueue(jsonRequest);

    }
    public void peticion2(){
        String url = "https://io.adafruit.com/api/v2/MiguelAngel7879/feeds/temperatura/data/last";
        JsonObjectRequest jsonRequest = new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String valor = response.getString("value");
                            tx.setText(valor);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("X-AIO-Key", "aio_czGc48dihOrfOil3hn1qPa0sZFD7");
                return headers;
            }
        };

        VolleySingleton.getMiInstancia(this).addToRequestQueue(jsonRequest);

    }

}