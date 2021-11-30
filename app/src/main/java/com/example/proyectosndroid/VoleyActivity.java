package com.example.proyectosndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.proyectosndroid.Adaptadores.PokemonAdapter;
import com.example.proyectosndroid.Modelos.Pokemon;

import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class VoleyActivity extends AppCompatActivity {

    RecyclerView pokeLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voley);
        pokeLista = findViewById(R.id.poke_lista);
        RequestQueue solicitud = Volley.newRequestQueue(this);
        String url = "https://pokeapi.co/api/v2/pokemon?limit=151";

        List<Pokemon> pokemonList = new ArrayList<>();
        PokemonAdapter pa = new PokemonAdapter(pokemonList);
        pokemonList.add(new Pokemon("a"));

        //StringRequest respuestaCadena = new StringRequest
        JsonObjectRequest respuestaCadena = new JsonObjectRequest(
                //Request.Method.GET,
                url,
                new Response.Listener<JSONObject>(){
                    @Override
                    public void onResponse(JSONObject response) {

                        for (int i = 0; i < 3; i++){
                            try {

                                JSONObject jsonObject = response.getJSONObject(String.valueOf(i));
                                pokemonList.add(new Pokemon(jsonObject.getString("title")));

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );

        pokeLista.setHasFixedSize(true);
        pokeLista.setLayoutManager(new LinearLayoutManager(this));
        pokeLista.setAdapter(pa);
    }
}
/*
private void getData() {
    final ProgressDialog progressDialog = new ProgressDialog(this);
    progressDialog.setMessage("Loading...");
    progressDialog.show();

    JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
        @Override
        public void onResponse(JSONArray response) {
            for (int i = 0; i < response.length(); i++) {
                try {
                    JSONObject jsonObject = response.getJSONObject(i);
                    Movie movie = new Movie();
                    movie.setTitle(jsonObject.getString("title"));
                    movie.setRating(jsonObject.getInt("rating"));
                    movie.setYear(jsonObject.getInt("releaseYear"));

                    movieList.add(movie);
                } catch (JSONException e) {
                    e.printStackTrace();
                    progressDialog.dismiss();
                }
            }
            adapter.notifyDataSetChanged();
            progressDialog.dismiss();
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Log.e("Volley", error.toString());
            progressDialog.dismiss();
        }
    });
    RequestQueue requestQueue = Volley.newRequestQueue(this);
    requestQueue.add(jsonArrayRequest);
}*/