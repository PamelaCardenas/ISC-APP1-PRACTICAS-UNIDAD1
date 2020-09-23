package com.example.eva1_16_alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowAlertDialog(View v){
        //AlertDialog miCuadroDialogo = new...
        //miCuadroDialogo.setTitle...
        new AlertDialog.Builder(this).setTitle("CUADRO DE DIALOGO DE ANDROID")
                .setMessage("Cuadro de diálogo del sistema")
                //.setIcon(R.drawable.ic_launcher_foreground)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                        Log.wtf("ALERT DIALOG","YES");
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                        Log.wtf("ALERT DIALOG", "NO");
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                        Log.wtf("ALERT DIALOG", "CANCEL");
                    }
                })
                .create()
                .show();
    }

    public void onShowMyAlertDialog(View v){
        final Dialog miCuadroDialogo = new Dialog(this);
        miCuadroDialogo.setContentView(R.layout.mi_dialogo);

        TextView txtVwTitu;
        txtVwTitu = miCuadroDialogo.findViewById(R.id.txtVwTitulo);
        txtVwTitu.setText("ESTE ES MI CUADRO DE DIALOGO!!!!!");
        final EditText editTextName;
        editTextName = miCuadroDialogo.findViewById(R.id.editTextName);
        Button btnOk;
        btnOk = miCuadroDialogo.findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sCade;
                sCade = editTextName.getText().toString();
                Log.wtf("CUADRO PERSONAL", sCade);
                //Para cerrar el cuadro de dialogo al presionar el boton y llama al evento
                miCuadroDialogo.dismiss();
            }
        });

        miCuadroDialogo.show();

    }
}