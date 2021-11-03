package com.example.proyectosndroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class index extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        findViewById(R.id.views).setOnClickListener(this);
        findViewById(R.id.recycle).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.views:
                startActivity(new Intent(index.this, MainActivity.class));
                break;
            case R.id.recycle:
                startActivity(new Intent(index.this, RecycleView.class));
                break;

        }
    }
}