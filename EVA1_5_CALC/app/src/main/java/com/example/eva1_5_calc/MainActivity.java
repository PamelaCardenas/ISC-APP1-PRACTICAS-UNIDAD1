package com.example.eva1_5_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

/*KARLA PAMELA CARDENAS LEYVA 18550338
 * PRACTICA 5 CALCULADORA
 * COLOCACION DE COMPONENTES PARA DISEÑAR UNA CALCULADORA Y LA VINCULACION DE ELLOS  */

public class MainActivity extends AppCompatActivity {

    Button dosnd, btnpi, btne, btnc, borrar, btnx2, btnunosobrex, btnxabsoluta, btnexp, btnmod, btnraizx, btnabrirParen, btncerrarParen, btnnFact, btnentre;
    Button btnxy, btnsiete, btnocho, btnnueve, btnmult, btndiezx,btncuatro, btncinco, btnseis, btnresta, btnlog, btnuno, btndos, btntres, btnsuma;
    Button btnln, btnmasmenos, btncero, btnpunto, btnigual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Primera fila
        setContentView(R.layout.activity_main);
        dosnd = findViewById(R.id.dosnd);
        btnpi = findViewById(R.id.btnpi);
        btne = findViewById(R.id.btne);
        btnc = findViewById(R.id.btnc);
        borrar = findViewById(R.id.borrar);
        //Segunda fila
        btnx2 = findViewById(R.id.btnx2);
        btnunosobrex = findViewById(R.id.btnunosobrex);
        btnxabsoluta = findViewById(R.id.btnxabsoluta);
        btnexp = findViewById(R.id.btnexp);
        btnmod = findViewById(R.id.btnmod);
        //Tercera Fila
        btnraizx = findViewById(R.id.btnraizx);
        btnabrirParen = findViewById(R.id.btnabrirParen);
        btncerrarParen = findViewById(R.id.btncerrarParen);
        btnnFact = findViewById(R.id.btnnFact);
        btnentre = findViewById(R.id.btnentre);
        //Cuarta Fila
        btnxy = findViewById(R.id.btnxy);
        btnsiete = findViewById(R.id.btnsiete);
        btnocho = findViewById(R.id.btnocho);
        btnnueve = findViewById(R.id.btnnueve);
        btnmult = findViewById(R.id.btnmult);
        //Quinta Fila
        btndiezx = findViewById(R.id.btndiezx);
        btncuatro = findViewById(R.id.btncuatro);
        btncinco = findViewById(R.id.btncinco);
        btnseis = findViewById(R.id.btnseis);
        btnresta = findViewById(R.id.btnresta);
        //Sexta Fila
        btnlog = findViewById(R.id.btnlog);
        btnuno = findViewById(R.id.btnuno);
        btndos = findViewById(R.id.btndos);
        btntres = findViewById(R.id.btntres);
        btnsuma = findViewById(R.id.btnsuma);
        //Septima Fila
        btnln = findViewById(R.id.btnln);
        btnmasmenos = findViewById(R.id.btnmasmenos);
        btncero = findViewById(R.id.btncero);
        btnpunto = findViewById(R.id.btnpunto);
        btnigual = findViewById(R.id.btnigual);
    }
}