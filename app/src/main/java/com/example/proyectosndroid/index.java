package com.example.proyectosndroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
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

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.views:
                startActivity(new Intent(index.this, MainActivity.class));
                break;
            case R.id.recycle:
                startActivity(new Intent(index.this, RecycleView.class));
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}