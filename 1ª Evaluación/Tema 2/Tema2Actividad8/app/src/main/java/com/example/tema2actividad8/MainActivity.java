package com.example.tema2actividad8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonCall = (Button)findViewById(R.id.buttonActionCall);
        botonCall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int permissionCheck = ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE);
                if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(
                            MainActivity.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            255);
                } else {
                    Intent llamar = new Intent(Intent.ACTION_CALL, Uri.parse("tel:777777777"));
                    startActivity(llamar);
                }
            }
        });


        Button botonView = (Button)findViewById(R.id.buttonActionView);
        botonView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent ejemplo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es"));
                startActivity(ejemplo);
            }
        });

        Button botonSend = (Button)findViewById(R.id.buttonActionSend);
        botonSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);

            }
        });

        Button botonWallpaper = (Button)findViewById(R.id.buttonSetWallpaper);
        botonWallpaper.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SET_WALLPAPER);
                startActivity(Intent.createChooser(intent, "Select Wallpaper"));

            }
        });

        // Funciona solo con máximo API 25.
        Button botonDelete = (Button)findViewById(R.id.buttonDelete);
        botonDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DELETE, Uri.parse("package:com.example.tema2actividad8"));
                startActivity(intent);
            }
        });
    }
}