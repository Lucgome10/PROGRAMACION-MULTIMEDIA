package com.example.t2actividad10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ETIQUETA", "MainActivity onCreate");

        tv = (TextView) findViewById(R.id.tvMainActivity);
        tv.setOnClickListener(this);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ETIQUETA", "MainActivity onDestroy");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvMainActivity:
                Intent intent = new Intent(this, SecondaryActivity.class);
                intent.putExtra("Cadena", "Extra 1 desde MainActivity");
                Integer in = 1000;
                String inString = String.valueOf(in);
                intent.putExtra("Integer", inString);
                startActivity(intent);
                Log.i("ETIQUETA", "Pulsado el TextView");
        }

    }
}