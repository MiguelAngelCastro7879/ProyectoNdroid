package com.example.proyectosndroid;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class intents_expimp extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_expimp);
        findViewById(R.id.web).setOnClickListener(this);
        findViewById(R.id.contactos).setOnClickListener(this);
        findViewById(R.id.llamada).setOnClickListener(this);
        findViewById(R.id.alarma).setOnClickListener(this);
        findViewById(R.id.google).setOnClickListener(this);
        findViewById(R.id.voz).setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.web:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/")));
                break;
            case R.id.contactos:
                /*En este ejemplo utilizaremos la creación de un nuevo “intent” con la acción “ACTION_VIEW”
                y como datos pasaremos “content://contacts..” para realizar la operación de visualización de
                contactos de mi directorio.
                 */
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/")));
                break;
            case R.id.llamada:
                /*En este ejemplo utilizaremos la creación de un nuevo “intent” con la acción
                “ACTION_VIEW” y como datos pasaremos “tel:73647832” esto colocará la aplicación en el
                escenario de llamada telefonica para confirmar la llamada al número representado.
                 */
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("tel:8715722538")));
                break;
            case R.id.google:
               /* En este ejemplo utilizaremos la creación de un “intent” pero lo realizaremos de forma
               separada inicialmente para luego poder insertar una Query al mismo. Hay algunos intents
               que necesitarán más que una acción y una URI. Esas datos adicionales se llaman "extras" y se
               los puede añadir con “Intent.putExtra” como muestra el ejemplo del Code 5.
                */

                Intent intent= new Intent(Intent.ACTION_WEB_SEARCH );
                intent.putExtra(SearchManager.QUERY, "Bortolotti");

                startActivity(intent);
                break;
            case R.id.voz:
                startActivity(new Intent(Intent.ACTION_VOICE_COMMAND));
                break;
            case R.id.alarma:
                break;
        }

    }
}
// <action android:name="android.intent.action.SET_ALARM"/>