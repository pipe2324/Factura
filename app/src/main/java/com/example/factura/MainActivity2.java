package com.example.factura;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView resultado;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = findViewById(R.id.resultado);



        // Recibe los datos de la actividad principal
        double totalNeto = getIntent().getDoubleExtra("totalNeto", 0.0);
        double totalConImpuestos = getIntent().getDoubleExtra("totalConImpuestos", 0.0);

        String resul="Total Neto: $" +(totalNeto)+"\n"+"\n";
        resul+= "Total con Impuestos (IVA): $"+(totalConImpuestos)+"\n"+"\n";

        resultado.setText(resul);


    }
}
