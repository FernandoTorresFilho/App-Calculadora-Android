package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button soma = (Button) findViewById(R.id.soma);
        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numero1 = (EditText) findViewById(R.id.editText);
                EditText numero2 = (EditText) findViewById(R.id.editText2);

                Double numero11 = Double.parseDouble(numero1.getText().toString());
                Double numero22 = Double.parseDouble(numero2.getText().toString());

                Double resultadosoma = numero11 + numero22;

                TextView resultado = (TextView) findViewById(R.id.resultado);
                resultado.setText(String.valueOf(resultadosoma));
                alert("Soma realizada!");
            }
        });

        Button btnsub = (Button) findViewById(R.id.btnsub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numero1 = (EditText) findViewById(R.id.editText);
                EditText numero2 = (EditText) findViewById(R.id.editText2);

                Double numero11 = Double.parseDouble(numero1.getText().toString());
                Double numero22 = Double.parseDouble(numero2.getText().toString());

                Double resultadosubtracao= numero11 - numero22;

                TextView resultado = (TextView) findViewById(R.id.resultado);
                resultado.setText(String.valueOf(resultadosubtracao));
                alert("Subtração realizada!");
            }
        });

        Button btnmult = (Button) findViewById(R.id.btnmult);
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numero1 = (EditText) findViewById(R.id.editText);
                EditText numero2 = (EditText) findViewById(R.id.editText2);

                Double numero11 = Double.parseDouble(numero1.getText().toString());
                Double numero22 = Double.parseDouble(numero2.getText().toString());

                Double resultadomult = numero11 * numero22;

                TextView resultado = (TextView) findViewById(R.id.resultado);
                resultado.setText(String.valueOf(resultadomult));
                alert("Multiplicação realizada!");
            }
        });

        Button btndiv = (Button) findViewById(R.id.btndiv);
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numero1 = (EditText) findViewById(R.id.editText);
                EditText numero2 = (EditText) findViewById(R.id.editText2);

                Double numero11 = Double.parseDouble(numero1.getText().toString());
                Double numero22 = Double.parseDouble(numero2.getText().toString());

                Double resultadodiv = numero11 / numero22;

                TextView resultado = (TextView) findViewById(R.id.resultado);
                resultado.setText(String.valueOf(resultadodiv));
                alert("Divisão realizada!");
            }
        });
    }

    private void alert(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

}