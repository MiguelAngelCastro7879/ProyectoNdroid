package com.example.proyectosndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.proyectosndroid.Adaptadores.PokemonAdapter;
import com.example.proyectosndroid.Modelos.Pokemon;
import com.example.proyectosndroid.Modelos.VolleySingleton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;

public class VoleyActivity extends AppCompatActivity {

    RecyclerView recPokemon;
    TextView  texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voley);
        recPokemon = findViewById(R.id.poke_lista);
        texto = findViewById(R.id.textView);

        //List<Pokemon> pokemonList = new ArrayList<>();
        //PokemonAdapter pa = new PokemonAdapter(pokemonList);
        //pokemonList.add(new Pokemon("a"));

        CargarRecycler();

    }

    public void CargarRecycler(){
        //RequestQueue solicitud = Volley.newRequestQueue(this);

        String url = "https://pokeapi.co/api/v2/pokemon?limit=150";
        JsonObjectRequest jsonRequest = new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        //texto.setText(response.toString());
                        final Gson gson = new Gson();
                        try {
                            JSONArray pokemonJson = response.getJSONArray("results");


                            final Type tipoListaPokemons = new TypeToken<List<Pokemon>>(){}.getType();
                            final List<Pokemon> ListaPokemones = gson.fromJson(pokemonJson.toString(), tipoListaPokemons);

                            PokemonAdapter pa = new PokemonAdapter(ListaPokemones);

                            recPokemon.setHasFixedSize(true);
                            recPokemon.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                            recPokemon.setAdapter(pa);


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
        );

        VolleySingleton.getMiInstancia(this).addToRequestQueue(jsonRequest);

    }
///https://www.adictosaltrabajo.com/2012/09/17/gson-java-json/

}