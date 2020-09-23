package com.example.eva1_3_widgets_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //DECLARAR UN OBJETO DEL MISMO TIPO DEL WIDGET A MODIFICAR
    TextView txtVwHolaMundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //NO EXISTE LA INTERFAZ GRAFICA
        setContentView(R.layout.activity_main);
        //YA EXISTE LA INTERFAZ GRAFICA
        //VINCULAR EL COMPONENTE
        txtVwHolaMundo = findViewById(R.id.txtVwDatos);
        txtVwHolaMundo.setText("Primera Aplicación en Android");
    }
}