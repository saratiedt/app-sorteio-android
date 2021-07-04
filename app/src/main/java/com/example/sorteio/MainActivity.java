package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edInicial, edFinal;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edInicial = findViewById(R.id.editTextValorInicial);
        edFinal = findViewById(R.id.editTextValorFinal);
        textView = findViewById(R.id.valorSorteado);
    }

    public void sorteioNumero(View view) {
        int valorInicial = 0, valorFinal = 0;
        valorInicial = Integer.parseInt(edInicial.getText().toString());
        valorFinal = Integer.parseInt(edFinal.getText().toString());
        int  numeroSorteado = (new Random().nextInt((valorFinal - valorInicial) + 1)) + valorInicial;
        Log.i("valorRandom", Integer.toString(numeroSorteado));
        textView.setText(Integer.toString(numeroSorteado));
    }

}