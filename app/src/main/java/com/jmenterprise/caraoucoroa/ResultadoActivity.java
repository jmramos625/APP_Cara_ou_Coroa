package com.jmenterprise.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //recuperando os dados
        Bundle dados = getIntent().getExtras();

        //recuperando a variável número para o resultado final
        int numero = dados.getInt("numero");

        if (numero == 0){
            //cara
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }
        else {
            //coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }


        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //método normal
                //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(intent);

                //mas podemos umar um método que finaliza a activity
                finish();

            }
        });

    }
}