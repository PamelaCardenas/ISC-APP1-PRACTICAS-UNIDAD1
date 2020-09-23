package com.example.eva1_15_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 15 CICLO DE VIDA
 * MUESTRA MEDIANTE TOAST LAS DIFERENTES ETAPAS POR LAS QUE PASA UNA APLICACION */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {//1
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {//intermediario
        super.onRestart();
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {//2
        super.onStart();
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {//3
        super.onResume();
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show();
    }

    //Para empezar a cerrar la aplicacion
    @Override
    protected void onPause() {//4
        super.onPause();
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {//5
        super.onStop();
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {//6
        super.onDestroy();
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show();
    }
}