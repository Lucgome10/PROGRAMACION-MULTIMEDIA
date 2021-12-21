package com.example.ud2_ej27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConfigurar = (Button) findViewById(R.id.buttonConfigurar);
        buttonConfigurar.setOnClickListener(this);

        Button buttonConsultar = (Button) findViewById(R.id.buttonConsultar);
        buttonConsultar.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.buttonConfigurar:
                startActivity(new Intent(MainActivity.this, OpcionesPreferencias.class));
                break;
            case R.id.buttonConsultar:
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
                String preferencias = pref.getBoolean("preferencia1", true) + " " + pref.getString("preferencia2", "No asignada")
                        + " " + pref.getString("preferencia3", "No asignada");
                Toast.makeText(getApplicationContext(), preferencias, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

}