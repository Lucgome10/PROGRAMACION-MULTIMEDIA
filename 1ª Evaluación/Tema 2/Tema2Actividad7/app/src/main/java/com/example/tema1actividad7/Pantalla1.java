package com.example.tema1actividad7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);

        Button siguiente = (Button)findViewById(R.id.siguiente);
        siguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pantalla1.this, Pantalla2.class));
            }
        });

    }
    /*
    public void siguiente(View view) {
        Intent ejemplo = new Intent(this, Pantalla2.class);
        startActivity(ejemplo);
    }
     */

    public void atras(View view) {
        Intent ejemplo = new Intent(this, Pantalla8.class);
        startActivity(ejemplo);
    }

}