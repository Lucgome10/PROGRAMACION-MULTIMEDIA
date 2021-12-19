package com.example.ud2_ej26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int num1=0, num2=0;
    static String operador="+";

    Spinner spinnerNum1;
    Spinner spinnerOperador;
    Spinner spinnerNum2;

    TextView textViewNum1, textViewOperador, textViewNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1 = (TextView) findViewById(R.id.textViewNum1);
        textViewNum1.setText("");
        textViewOperador = (TextView) findViewById(R.id.textViewOperador);
        textViewOperador.setText("");
        textViewNum2 = (TextView) findViewById(R.id.textViewNum2);
        textViewNum2.setText("");

        String[] numeros = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        ArrayAdapter<String> adaptadorNumeros = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, numeros);
        adaptadorNumeros.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        String[] operadores = new String[]{"+", "-", "*", "/"};
        ArrayAdapter<String> adaptadorOperadores = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, operadores);
        adaptadorOperadores.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinnerNum1 = (Spinner) findViewById(R.id.spinnerNum1);
        spinnerNum1.setAdapter(adaptadorNumeros);

        spinnerOperador = (Spinner) findViewById(R.id.spinnerOperador);
        spinnerOperador.setAdapter(adaptadorOperadores);

        spinnerNum2 = (Spinner) findViewById(R.id.spinnerNum2);
        spinnerNum2.setAdapter(adaptadorNumeros);

        spinnerNum1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String num1 = (String) spinnerNum1.getItemAtPosition(position);
                textViewNum1.setText(num1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerOperador.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String operador = (String) spinnerOperador.getItemAtPosition(position);
                textViewOperador.setText(operador);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerNum2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String num2 = (String) spinnerNum2.getItemAtPosition(position);
                textViewNum2.setText(num2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
/*
        spinnerNum1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String num1 = (String) spinnerNum1.getItemAtPosition(position);
                textViewNum1.setText(num1);
            }
        });

 */
/*
        spinnerOperador.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String operador = (String) spinnerOperador.getItemAtPosition(position);
                textViewOperador.setText(operador);            }
        });

 */
/*
        spinnerNum2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String num2 = (String) spinnerNum2.getItemAtPosition(position);
                textViewNum2.setText(num2);
            }
        });

 */

        Button buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado;
                Integer num1 = (textViewNum1.getText().equals("")) ? 0 : Integer.parseInt((String) textViewNum1.getText());
                Integer num2 = (textViewNum2.getText().equals("")) ? 0 : Integer.parseInt((String) textViewNum2.getText());
                switch ((String) textViewOperador.getText()) {
                    case "":
                        Toast.makeText(getApplicationContext(), "Debes seleccionar un operador", Toast.LENGTH_SHORT).show();
                        break;
                    case "+":
                        resultado = num1 + num2;
                        Toast.makeText(getApplicationContext(), num1 + " " + (String) textViewOperador.getText() + " " + num2 + " = " + String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                        break;
                    case "-":
                        resultado = num1 - num2;
                        Toast.makeText(getApplicationContext(), num1 + " " + (String) textViewOperador.getText() + " " + num2 + " = " + String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                        break;
                    case "*":
                        resultado = num1 * num2;
                        Toast.makeText(getApplicationContext(), num1 + " " + (String) textViewOperador.getText() + " " + num2 + " = " + String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                        break;
                    case "/":
                        resultado = num1 / num2;
                        Toast.makeText(getApplicationContext(), num1 + " " + (String) textViewOperador.getText() + " " + num2 + " = " + String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });













    }
}