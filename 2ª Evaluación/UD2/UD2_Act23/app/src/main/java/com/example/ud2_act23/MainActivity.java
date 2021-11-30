package com.example.ud2_act23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listado = (ListView) findViewById(R.id.listado);
        final String[] datos = new String[] {"Elemento1", "Elemento2", "Elemento3", "Elemento4", "Elemento5",
                "Elemento6", "Elemento7", "Elemento8", "Elemento9", "Elemento10"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datos);
        listado.setAdapter(adaptador);
        textView = findViewById(R.id.textViewMostrarPulsado);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id) {
                String elemento = (String) parent.getItemAtPosition(posicion);
                Toast.makeText(getApplicationContext(), "Pulsado: " + elemento, Toast.LENGTH_SHORT).show();
                textView.setText(elemento);
                //String otroElemento = (String) parent.getAdapter().getItem(posicion);
            }
        });


    }
}