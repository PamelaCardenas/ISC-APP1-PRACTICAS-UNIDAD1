package com.example.eva1_1_holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 1 HOLA MUNDO
 * MUESTRA EL TEXT VIEW EN EL LAYOUT CON LA DESCRIPCION DE HOLA MUNDO */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}