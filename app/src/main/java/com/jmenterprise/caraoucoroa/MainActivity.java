package com.jmenterprise.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private Button buttonResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonResultado = findViewById(R.id.buttonResultado);

        buttonResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //passar dados para a próxima tela
                //sempre use o new para instancia uma classe
                int numero = new Random().nextInt(2); //0 e 1
                //em putExtra sempre é necessário usar o identificados e depois o dado
                intent.putExtra("numero",numero);

                startActivity(intent);
            }
        });

    }
}