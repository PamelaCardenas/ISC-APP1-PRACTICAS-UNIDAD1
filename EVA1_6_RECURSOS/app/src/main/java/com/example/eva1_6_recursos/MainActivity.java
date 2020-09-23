package com.example.eva1_6_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 6 RECURSOS
 * UTILIZACION DE RECURSOS COMO LA COLOCACION DE UNA IMAGEN */

public class MainActivity extends AppCompatActivity {

    ImageView imagevwFlor;
    TextView txtVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagevwFlor = findViewById(R.id.imageView3);
        txtVwDatos = findViewById(R.id.txtVwDatos);
        imagevwFlor.setImageResource(R.drawable.rosa_pequena);
        txtVwDatos.setText(R.string.mis_datos);
    }
}