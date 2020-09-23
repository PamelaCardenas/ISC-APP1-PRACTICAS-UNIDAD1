package com.example.eva1_11_multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 11 MULTISCREEN
 * MOSTRAR DIFERENTES LAYOUTS DEPENDIENDO DE LA ORIENTACION DE LA PANTALLA */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}