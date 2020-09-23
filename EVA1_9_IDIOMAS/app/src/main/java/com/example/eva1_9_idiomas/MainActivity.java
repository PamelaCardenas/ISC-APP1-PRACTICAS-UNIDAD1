package com.example.eva1_9_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 9 IDIOMAS
 * CAMBIA EL IDIOMA DE ESPAÑOL A INGLES Y VICEVERSA DEPENDIENDO DE LA OPCION SELECCIONADA EN EL RADIOGROUP */

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEsp, rdBtnEn, rdBtnHom, rdBtnMuj, rdBtnNoHay;
    TextView txtNombre, txtApe, txtGen, txtNombreHint, txtApeHint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEn = findViewById(R.id.rdBtnEn);
        rdBtnEsp = findViewById(R.id.rdBtnEsp);

        rdBtnHom = findViewById(R.id.rdBtnHom);
        rdBtnMuj = findViewById(R.id.rdBtnMuj);
        rdBtnNoHay = findViewById(R.id.rdBtnNoHay);
        txtNombre = findViewById(R.id.txtNombre);
        txtApe = findViewById(R.id.txtApe);
        txtNombreHint = findViewById(R.id.txtNombreHint);
        txtApeHint = findViewById(R.id.txtApeHint);
        txtGen = findViewById(R.id.txtGen);

        rdGrpIdioma.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {

                        if(i == R.id.rdBtnEsp){
                            rdBtnEsp.setText(R.string.btn_es_español);
                            rdBtnEn.setText(R.string.btn_es_ingles);
                            rdBtnHom.setText(R.string.btn_es_hombre);
                            rdBtnMuj.setText(R.string.btn_es_mujer);
                            rdBtnNoHay.setText(R.string.btn_es_nohay);
                            txtNombre.setText(R.string.txt_es_nombre);
                            txtApe.setText(R.string.txt_es_apellido);
                            txtNombreHint.setText(R.string.hint_es_nombre);
                            txtApeHint.setText(R.string.hint_es_apellido);
                            txtGen.setText(R.string.txt_es_genero);
                        } else if(i == R.id.rdBtnEn){
                            rdBtnEn.setText(R.string.btn_en_ingles);
                            rdBtnEsp.setText(R.string.btn_en_español);
                            rdBtnHom.setText(R.string.btn_en_hombre);
                            rdBtnMuj.setText(R.string.btn_en_mujer);
                            rdBtnNoHay.setText(R.string.btn_en_nohay);
                            txtNombre.setText(R.string.txt_en_nombre);
                            txtApe.setText(R.string.txt_en_apellido);
                            txtNombreHint.setText(R.string.hint_en_nombre);
                            txtApeHint.setText(R.string.hint_en_apellido);
                            txtGen.setText(R.string.txt_en_genero);
                        }
                    }
                }
        );
    }
}