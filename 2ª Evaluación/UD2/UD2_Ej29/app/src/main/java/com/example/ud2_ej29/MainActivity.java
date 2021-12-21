package com.example.ud2_ej29;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonFecha = (Button) findViewById(R.id.buttonFecha);
        Button buttonHora = (Button) findViewById(R.id.buttonHora);

        TextView textViewFecha = (TextView) findViewById(R.id.textViewFecha);
        TextView textViewHora = (TextView) findViewById(R.id.textViewHora);

        final Calendar calendar = Calendar.getInstance();

        buttonFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog fecha = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(getApplicationContext(), "Año: " + year + "\nMes: " + month +
                                "\nDía: " + dayOfMonth, Toast.LENGTH_LONG).show();
                        textViewFecha.setText("Año: " + year + "\nMes: " + month +
                                "\nDí: " + dayOfMonth);
                    }
                }, year, month, day);
                fecha.show();


            }
        });

        buttonHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);
                TimePickerDialog hora = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Toast.makeText(getApplicationContext(), "Hora: " + hourOfDay + "\nMinuto: " + minute, Toast.LENGTH_LONG).show();
                        textViewHora.setText("Hora: " + hourOfDay + "\nMinuto: " + minute);
                    }
                }, hour, minute, true);
                hora.show();
            }
        });

    }
}
















