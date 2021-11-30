package com.example.t2actividad10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Log.i("ETIQUETA", "SecondaryActivity onCreate");
        Bundle b = getIntent().getExtras();

        Log.i("ETIQUETA", b.getString("Cadena"));
        Log.i("ETIQUETA", b.getString("Integer"));

        Integer in = Integer.parseInt(b.getString("Integer"));
        Log.i("ETIQUETA", String.valueOf(in) + " convertido desde cadena.");
    }
}