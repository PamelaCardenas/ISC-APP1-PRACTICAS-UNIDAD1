package com.example.eva1_8_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 8 RADIOGROUP
 * COLOCAR UN RADIOGROUP Y LANZAR UN TOAST POR CADA VEZ QUE SE SELECCIONA UNA NUEVA OPCION */

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGrpComida = findViewById(R.id.rdGrpComida);

        //Por clase anonima
        //Evento generado cuando hay un cambio en la seleccion
        rdGrpComida.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        //Definir el id que fue elegido
                        RadioButton rdButton = (RadioButton) findViewById(i);
                        //Mostrar en el Toast el texto del radioButton elegido tomando como referencia su ID
                        Toast.makeText(getApplicationContext()," " + rdButton.getText(),Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}