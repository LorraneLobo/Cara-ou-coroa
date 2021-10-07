package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageButton imageButtonVoltar;
    private ImageView imageViewCaraCoroa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageButtonVoltar = findViewById(R.id.imageButtonVoltar);
        imageViewCaraCoroa = findViewById(R.id.imageViewCaraCoroa);

        jogarMoeda();

        imageButtonVoltar.setOnClickListener(v -> onBackPressed());
    }

    public void jogarMoeda(){
        int[] imagens = {R.drawable.moeda_cara, R.drawable.moeda_coroa};
        Random rand = new Random();
        imageViewCaraCoroa.setImageResource(imagens[rand.nextInt(imagens.length)]);
    }
}