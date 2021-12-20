package com.example.ud2_ej28;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonEditText = (Button) findViewById(R.id.buttonEditText);
        buttonEditText.setOnClickListener(this);

        Button buttonToastSeekBar = (Button) findViewById(R.id.buttonToastSeekBar);
        buttonToastSeekBar.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.buttonEditText:
                startActivity(new Intent(this, MostrarToastEditText.class));
                break;
            case R.id.buttonToastSeekBar:
                startActivity(new Intent(this, ModificarToastSeekBar.class));
                break;
            default:
                break;
        }
    }
}