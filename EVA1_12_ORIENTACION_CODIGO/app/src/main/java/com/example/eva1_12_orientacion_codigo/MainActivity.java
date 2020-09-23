package com.example.eva1_12_orientacion_codigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 12 ORIENTACION CODIGO
 * DEPENDIENDO DE LA ORIENTACION  DE LA PANTALLA AL PRESIONAR EL BOTON MUESTRA EL TOAST CON EL MENSAJE CORRESPONDIENTE */

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
    /*android:screenOrientation="portrait"
    usado en el Manifest para bloquear solo una orientacion de pantalla*/

    Button btnAccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAccion = findViewById(R.id.btnAccion);

        btnAccion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int iOrienta = getResources().getConfiguration().orientation;
        if(iOrienta == Configuration.ORIENTATION_PORTRAIT){
        Toast.makeText(this, "MODO PORTRAIT", Toast.LENGTH_SHORT).show();}
        else{
            Toast.makeText(this, "MODO LANDSCAPE", Toast.LENGTH_SHORT).show();
        }

    }
}