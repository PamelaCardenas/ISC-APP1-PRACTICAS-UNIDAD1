package com.example.eva1_14_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    private Context context; //Recibir contexto
    private int resource; //Layout que va a utilizar
    private Weather[] objects; //Datos

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    //Crea el layout.
    //Se crea para cada uno de los datos de la clase Weather
    //10 filas, se crean 10 con el mismo diseño
    //Crea todas las listas necesarias para llenarse de datos
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Primera vez que se ejecuta la app para crear las filas
        if(convertView == null){
                            //Contexto convertido en actividad
                            //Y hace referencia a una actividad
            //INFLAR --> Inflate (Para crear layouts)
            convertView = ((Activity)context).getLayoutInflater().inflate(resource,parent,false);
        }
        //LAYOUT CREADO ACCESIBLE A TRAVES DE ConvertView
        TextView txtVwCity, txtVwTemp, txtVwDesc;
        ImageView imgVwImage;

        txtVwCity = convertView.findViewById(R.id.txtVwCity);
        txtVwDesc = convertView.findViewById(R.id.txtVwDesc);
        txtVwTemp = convertView.findViewById(R.id.txtVwTemp);
        imgVwImage = convertView.findViewById(R.id.imgVwImage);

        txtVwCity.setText(objects[position].getCity());
        txtVwDesc.setText(objects[position].getDesc());
        txtVwTemp.setText((objects[position].getTemp()) + "°C");
        imgVwImage.setImageResource(objects[position].getImgWeather());


        return convertView;

    }
}
