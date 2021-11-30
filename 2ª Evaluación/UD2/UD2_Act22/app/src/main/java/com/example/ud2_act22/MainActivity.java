package com.example.ud2_act22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listado = (ListView) findViewById(R.id.listado);
        final String[] datos = new String[] {"Elemento1", "Elemento2", "Elemento3", "Elemento4"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datos);
        listado.setAdapter(adaptador);



    }
}