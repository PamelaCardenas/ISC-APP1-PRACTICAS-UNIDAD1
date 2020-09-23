package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnIntListener;
    Button btnPorClaseAnonima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIntListener = findViewById(R.id.btnIntListener);
        btnPorClaseAnonima = findViewById(R.id.btnPorClaseAnonima);

        //Listener del Main
        btnIntListener.setOnClickListener(this);

        //Generar un contexto para usarla en el Toast
        //Para interactuar con la interfaz grafica se requiere el contexto
        final Context context = getApplicationContext();

        //Objeto para reutilizar el codigo del OnClick
        /*View.OnClickListener miClickLis = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "POR CLASE ANONIMA 2", Toast.LENGTH_SHORT).show();
            }
        };*/

        //Boton para la clase anonima
        btnPorClaseAnonima.setOnClickListener(
                //Creacion de clase anonima
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        //this no funciona porque esta clase anonima no tiene interfaz
                        Toast.makeText(getApplicationContext(), "CLASE ANONIMA!!", Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }

//EVENTO CLICK
    public void  miClick(View v){
        //THIS ES LA ACTIVIDAD QUE SE ESTA CORRIENDO
        Toast.makeText(this, "HOLA MUNDO!!", Toast.LENGTH_SHORT).show();
        Log.wtf("Mensaje", "Falla catastrófica");
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "EVENTO POR INTERFAZ", Toast.LENGTH_SHORT).show();
    }
}