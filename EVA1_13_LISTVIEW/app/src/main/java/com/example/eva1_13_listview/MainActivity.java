package com.example.eva1_13_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lstVwDatos;
    //DATOS
    String[] datos = {
            "Amarillo",
            "Azul",
            "Rojo",
            "Blanco",
            "Negro",
            "Naranja",
            "Morado",
            "Café",
            "Gris",
            "Plateado",
            "Dorado",
            "Esmeralda",
            "Turquesa",
            "Rosa",
            "Violeta",
            "Mostaza",
            "Magenta",
            "Lila",
            "Beige",
            "Verde",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwDatos = findViewById(R.id.listVwDatos);

        lstVwDatos.setAdapter(new ArrayAdapter<String>(
                this, //Contexto
                //Como mostrar los datos
                android.R.layout.simple_list_item_1, //Listado generico
                datos //Arreglo de los datos
        ));

        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),datos[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}