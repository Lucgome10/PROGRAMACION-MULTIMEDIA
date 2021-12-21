package com.example.ud2_ej28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MostrarToastEditText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_toast_edit_text);

        EditText editText = (EditText) findViewById(R.id.editText);

        Button buttonMostrarToastEditText = (Button) findViewById(R.id.buttonMostrarToastEditText);
        buttonMostrarToastEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}