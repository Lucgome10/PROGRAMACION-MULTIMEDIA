package com.example.ud2_ej28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class ModificarToastSeekBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_toast_seek_bar);


        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

        Button buttonToastModificado = (Button) findViewById(R.id.buttonToastModificado);
        buttonToastModificado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (seekBar.getProgress()) {
                    case 1:
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Posición inferior", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.BOTTOM, 0, 0);
                        toast1.show();
                        break;
                    case 2:
                        Toast toast2 = Toast.makeText(getApplicationContext(), "Posición central", Toast.LENGTH_SHORT);
                        toast2.setGravity(Gravity.CENTER, 0, 0);
                        toast2.show();
                        break;
                    case 3:
                        Toast toast3 = Toast.makeText(getApplicationContext(), "Posición superior", Toast.LENGTH_SHORT);
                        toast3.setGravity(Gravity.TOP, 0, 0);
                        toast3.show();
                        break;
                    default:
                        break;
                }
            }
        });


    }
}