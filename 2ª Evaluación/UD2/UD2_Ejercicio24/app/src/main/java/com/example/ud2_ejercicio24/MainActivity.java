package com.example.ud2_ejercicio24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int num1=0, num2=0;
    static String operador="+";

    ListView listViewNum1;
    ListView listViewOperador ;
    ListView listViewNum2;

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


        listViewNum1 = (ListView) findViewById(R.id.listViewNum1);
        listViewOperador = (ListView) findViewById(R.id.listViewOperador);
        listViewNum2 = (ListView) findViewById(R.id.listViewNum2);

        String[] numeros = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        ArrayAdapter<String> adaptadorNumeros = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, numeros);

        String[] operadores = new String[]{"+", "-", "*", "/"};
        ArrayAdapter<String> adaptadorOperadores = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, operadores);

        listViewNum1.setAdapter(adaptadorNumeros);
        listViewNum2.setAdapter(adaptadorNumeros);
        listViewOperador.setAdapter(adaptadorOperadores);

        listViewNum1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String num1 = (String) listViewNum1.getItemAtPosition(position);
                textViewNum1.setText(num1);
            }
        });

        listViewOperador.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String operador = (String) listViewOperador.getItemAtPosition(position);
                textViewOperador.setText(operador);
            }
        });

        listViewNum2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String num2 = (String) listViewNum2.getItemAtPosition(position);
                textViewNum2.setText(num2);
            }
        });

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



/*
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.buttonCalcular:
                Toast.makeText(getApplicationContext(), "Has pulsado el botón calcular", Toast.LENGTH_SHORT).show();

                double resultado;
                Integer num1 = (textViewNum1.getText().equals("")) ? 0 : Integer.parseInt((String) textViewNum1.getText());
                Integer num2 = (textViewNum2.getText().equals("")) ? 0 : Integer.parseInt((String) textViewNum1.getText());
                switch ((String) textViewOperador.getText()) {
                    case "":
                        Toast.makeText(getApplicationContext(), "Debes seleccionar un operador", Toast.LENGTH_SHORT).show();
                        break;
                    case "+":
                        resultado = num1 + num2;
                        Toast.makeText(getApplicationContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                        break;
                    case "-":
                        resultado = num1 - num2;
                        Toast.makeText(getApplicationContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                        break;
                    case "*":
                        resultado = num1 * num2;
                        Toast.makeText(getApplicationContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                        break;
                    case "/":
                        resultado = num1 / num2;
                        Toast.makeText(getApplicationContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            default:
                Toast.makeText(getApplicationContext(), "Has pulsado el botón calcular", Toast.LENGTH_SHORT).show();
                break;
        }
    }

 */



/* NO FUNCIONA POR MOTIVOS QUE DESCONOZCO
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (view.getId()) {
            case R.id.listViewNum1:
                String num1 = (String) listViewNum1.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), num1, Toast.LENGTH_SHORT).show();
                textViewNum1.setText(num1);
                break;
            case R.id.listViewOperador:
                String operador = (String) listViewOperador.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), operador, Toast.LENGTH_SHORT).show();
                textViewOperador.setText(operador);
                break;
            case R.id.listViewNum2:
                String num2 = (String) listViewNum2.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), num2, Toast.LENGTH_SHORT).show();
                textViewNum2.setText(num2);
                break;
            default:
                break;
        }
    }

 */
}