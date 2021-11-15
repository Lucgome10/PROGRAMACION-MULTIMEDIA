package com.example.tema2actividad13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/*
    Ha sido necesario incluir el permiso en el AndroidManifest.
    Además el bloque de código que incluyo antes de ejecutar el Intent solicita el permiso al usuario
    cuando pulsa en el TextView.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textViewMain);
        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.textViewMain:
                int permissionCheck = ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE);
                if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},255);
                } else {
                    Intent llamar = new Intent(Intent.ACTION_CALL, Uri.parse("tel:123123123"));
                    startActivity(llamar);
                }
                break;
            default:
                break;
        }
    }
}