package com.example.eva1_14_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 14 CLIMA
 * MUESTRA LA INTERFAZ DE UNA APLICACION QUE MUESTRA EL CLIMA VINCULANDO LOS COMPONENTES*/

public class MainActivity extends AppCompatActivity {
    Weather[] weathers = {
            new Weather("Chihuahua",20,"Lluvia ligera",R.drawable.light_rain),
            new Weather("Cd. Juarez",18,"Nublado",R.drawable.cloudy),
            new Weather("Camargo",30,"Soleado",R.drawable.sunny),
            new Weather("Parral",20.5,"Lluvia ligera",R.drawable.light_rain),
            new Weather("Jimenez",22,"Lluvia Intensas",R.drawable.thunderstorm),
            new Weather("Cuauhtemoc",36,"Soleado",R.drawable.sunny),
            new Weather("Aldama",19,"Nublado",R.drawable.cloudy),
            new Weather("Creel",15.9,"Nevadas Intensas",R.drawable.snow),
            new Weather("Ojinaga",28.4,"Tornado",R.drawable.tornado),
            new Weather("Casas Grandes",33,"Soleado",R.drawable.sunny),
            new Weather("Batopilas",25.5,"Lluvioso",R.drawable.rainy)

    };
    ListView lstVwWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstVwWeather = findViewById(R.id.lstVwWeather);
        //Adaptador
        lstVwWeather.setAdapter(new WeatherAdapter(
                this, //Contexto
                R.layout.layout_weather, //Layout
                weathers //Arreglo
        ));
    }
}