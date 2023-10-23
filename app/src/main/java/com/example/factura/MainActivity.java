package com.example.factura;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button Calcular;
    private EditText Cantidad, costounitario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calcular = findViewById(R.id.Calcular);
        Cantidad = findViewById(R.id.cantidad);
        costounitario = findViewById(R.id.costounitario);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularTotal();
            }
        });
    }

    private void calcularTotal() {
        int cantidad = Integer.parseInt(Cantidad.getText().toString());
        double costoUnitario = Double.parseDouble(costounitario.getText().toString());

        // Realiza el cálculo del total neto y total con impuestos
        double totalNeto = cantidad * costoUnitario;
        double totalConImpuestos = calcularTotalConImpuestos(totalNeto);

        // Abre la segunda pantalla para mostrar los resultados
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("totalNeto", totalNeto);
        intent.putExtra("totalConImpuestos", totalConImpuestos);
        startActivity(intent);
    }
    public double calcularTotalConImpuestos(double totalNeto) {
        int iva = 19;
        return totalNeto + calculadoriva(totalNeto, iva);
    }

    private static double calculadoriva(double totalNeto, double iva) {
        return operacion(totalNeto, iva) / 100.0;
    }
    private static int operacion(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return (int) (a + operacion(a, b - 1));
    }
}

