package com.example.tema1actividad7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pantalla6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla6);
    }

    public void siguiente(View view) {
        Intent ejemplo = new Intent(this, Pantalla7.class);
        startActivity(ejemplo);
    }

    public void atras(View view) {
        Intent ejemplo = new Intent(this, Pantalla5.class);
        startActivity(ejemplo);
    }
}