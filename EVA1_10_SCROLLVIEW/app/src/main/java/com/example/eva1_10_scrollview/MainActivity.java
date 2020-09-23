package com.example.eva1_10_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtViewTexto;
    final String cade = "Los eventos culturales, ya sean conciertos, recitales, exposiciones de arte, obras de teatro, entre otras; funcionan no únicamente como un incentivo para evitar la rutina del ser humano, sino también como una forma de fomentar la economía, de movilizar las decisiones que se toman en los escritorios políticos. ¿Por qué? Porque realizar una actividad cultural involucra recursos humanos, y recursos físicos. Porque realizar una actividad cultura envuelve un compromiso del estado a la hora de formar públicos.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewTexto = findViewById(R.id.txtViewTexto);
        txtViewTexto.setText(cade);
    }
}